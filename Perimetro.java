/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema2;

import java.util.Scanner;

/**
 *
 * @author franv
 */
public class Perimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el área");
        double radio= sc.nextDouble();
        double area= Math.PI * Math.pow(radio, 2);
        System.out.println("Area es: " + area);
        
        
      /* Scanner sc = new Scanner (System.in);
        //declaracion de variables
         final double  valorpi = 3.14;
        //uso de math//
         double a = Math.PI;
         System.out.println(Math.sqrt(25));
         System.out.println(Math.pow(5, 3));
         System.out.println("valor pi: " + a);
         
         System.out.println("Introduce el radio: ");
         double radio = sc.nextDouble();*/
        /* System.out.println("El area del circulo es: " + (valorpi * radio * radio));
         System.out.println("El perimetro del circulo es: " + (2 * valorpi * radio));*/
         
 // así sería declarando todas las variables y no usando la formula en el sout
 
/*      double area = valorpi * radio * radio;
        //area = Math.Pi * Math.pow (radio, 2);//
        double  perimetro = 2 * valorpi * radio;
        System.out.println("perimetro es: " + perimetro);  
*/

    }
    
}
