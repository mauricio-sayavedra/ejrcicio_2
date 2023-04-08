package Calcular;

import java.util.Scanner;

public class Pricipal {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double precio,iva;





       System.out.println("ingrese el valor del producto");
       precio=entrada.nextDouble();


        iva=operacion(precio);
        System.out.println("el total con iva es "+(iva+precio));



    }
   public static double operacion(double calcular){
        double iva;
        iva = calcular*0.08;
        return iva;


    }






}
