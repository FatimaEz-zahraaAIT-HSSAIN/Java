public class Matrice extends MathObj{

    public Matrice(int a, int b){
        super(a, b);
    }

    @Override public MathObj add(MathObj o){

        Matrice c = new Matrice(this.X, this.Y);

        c.X += o.X;
        c.Y += o.Y;

        return c;
    }

    @Override public MathObj mul(MathObj o){

        Matrice c = new Matrice(this.X, this.Y);

        c.X *= o.X;
        c.Y *= o.Y;

        return c;
    }

    @Override public MathObj sub(MathObj o){

        Matrice c = new Matrice(this.X, this.Y);

        c.X -= o.X;
        c.Y -= o.Y;

        return c;
    }

    public String toString(){
        return "[ "+ this.X + " , " + this.Y +" ]";
    }

    @Override public void display() {
        System.out.println(toString());
    }

    public static void main(String args[]){

        Matrice A = new Matrice(3, 5);
        
        
        MathObj Z = A.add(new Complex(3, 2));
        Z.display();
        
        
        MathObj H = A.sub(new Complex(7, 1));
        H.display();

        MathObj G = A.mul(new Complex(2, 0));
        G.display();
        
    }
}