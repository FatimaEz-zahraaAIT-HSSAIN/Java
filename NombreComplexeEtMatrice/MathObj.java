public abstract class MathObj {

    int X;
    int Y;

    public MathObj( int X, int Y){
        this.X = X;
        this.Y = Y;
    }

    public abstract void display();
    public abstract MathObj add(MathObj o);
    public abstract MathObj sub(MathObj o);
    public abstract MathObj mul(MathObj o);

}