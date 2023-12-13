public class Cercle extends Forme{

    @Override public double calculerPerimetre(double X){
        double P;
        P = Math.PI * Math.pow(X, 2);

        return P;
    }
    @Override public double calculerAire(double X){
        double A;
        A = Math.PI;
        return A;
    }

}
