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
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // declaracion de variables
        
        Scanner sc = new Scanner (System.in);
        double num1 = 0.0, num2 = 0.0;
        System.out.println("Introduce el número 1: ");
        num1 = sc.nextDouble();
        System.out.println("Introduce el número 2: ");
        num2 = sc.nextDouble();
        
        //operaciones
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));   
    
    
    }
    
}
