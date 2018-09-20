
package Figuras.Figuritas_Geometricas;
import java.lang.Math;
public class Circulo extends Figuras{

    private double radio;

    public Circulo (double radio){

        this.radio= radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double area(){
        double area;
        area= 2*Math.PI*this.radio;
        return area;
    }

    @Override
    public int compareTo(Figuras o) {
        return 0;
    }
}
