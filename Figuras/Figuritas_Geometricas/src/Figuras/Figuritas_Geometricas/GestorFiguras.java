package Figuras.Figuritas_Geometricas;

import Figuras.Figuritas_Geometricas.Figuras;

import java.util.Arrays;

public class GestorFiguras {

    public static double suma(Figuras[] figuras){
        double res=0;
        for(Figuras l : figuras){
            res += l.area();
        }
        return res;
    }
    public static void ordenar(Figuras[] fig){
        Arrays.sort(fig);
    }



}
