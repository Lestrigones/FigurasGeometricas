package Figuras.Figuritas_Geometricas;

import Figuras.Figuritas_Geometricas.Cuadrado;
import Figuras.Figuritas_Geometricas.Figuras;

import java.util.Arrays;

import static Figuras.Figuritas_Geometricas.GestorFiguras.*;


public class Main {

    public static void main(String [] args){
        double radio= 3;
        double base= 4;
        double altura= 8;
        double lado1= 15;
        double lado2 =9;

        Circulo circulo= new Circulo(radio);
        Cuadrado cuadrado = new Cuadrado(lado1);
        Triangulo triangulo = new Triangulo(base, altura);
        Rectangulo rectangulo= new Rectangulo(lado1,lado2);

        Figuras[] figuras = new Figuras[4];
        figuras[0]= cuadrado;
        figuras[1]=circulo;
        figuras[2] = triangulo;
        figuras[4]=rectangulo;

        double suma;

        suma = suma(figuras);
        ordenar(figuras);
        System.out.println("Total de areas son:" +suma+"Y ordenadas son " +Arrays.toString(figuras));


    }
}

