public class Complex extends MathObj {
    
    public Complex(int reel, int imaginaire){
        super(reel, imaginaire);
    }

    @Override public MathObj add(MathObj o){

        Complex c = new Complex(this.X, this.Y);

        c.X += o.X;
        c.Y += o.Y;

        return c;
    }

    @Override public MathObj mul(MathObj o){

        Complex c = new Complex(this.X, this.Y);

        c.X *= o.X;
        c.Y *= o.Y;

        return c;
    }

    @Override public MathObj sub(MathObj o){

        Complex c = new Complex(this.X, this.Y);

        c.X -= o.X;
        c.Y -= o.Y;

        return c;
    }

    public String toString(){
        return this.X + " + " + this.Y +"i";
    }

    @Override public void display() {
        System.out.println(toString());
    }

    public static void main(String args[]){

        Complex a = new Complex(3, 5);
        
        
        MathObj b = a.add(new Complex(3, 2));
        b.display();
        
        
        MathObj c = a.sub(new Complex(7, 1));
        c.display();

        MathObj r = a.mul(new Complex(2, 0));
        r.display();
        
    }
}
