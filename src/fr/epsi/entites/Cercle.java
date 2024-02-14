package fr.epsi.entites;
import static java.lang.Math.PI;

public class Cercle {
    double r;

    public Cercle(double rayon) {
        this.r = rayon;
    }
    public double CalculSurface(double r){
        return Math.PI * this.r * this.r;
    }
    public double CalculPerimetre(double r){
        return 2 * PI * this.r;
    }


}
