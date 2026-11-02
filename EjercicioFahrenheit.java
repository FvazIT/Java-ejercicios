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
public class EjercicioFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Pasar de ºF a ºC
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el valor en Farenheit: ");
        final double valor = 32;
        double  f = sc.nextDouble();
        double  c = 0.0;
        c = (f - valor)*5/9;
        System.out.println("El valor ºF de f es en ºC: " + c);

    }
    
}
