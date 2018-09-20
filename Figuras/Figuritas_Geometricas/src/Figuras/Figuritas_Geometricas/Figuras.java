package Figuras.Figuritas_Geometricas;

abstract  public class Figuras implements Comparable<Figuras>{
    abstract public double area();
    public int compareto (Figuras f) {
        if (this.area()>=f.area())
            return 0;
        else
            return -1;


    }

}
