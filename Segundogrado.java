/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author franv
 */
public class Segundogrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner sc = new Scanner (System.in);     
     
//Declaración de variables
    
     int a, b, c = 0;
     double x1, x2, d;
     System.out.println("Introduce un valor para a: ");
     a = sc.nextInt(); 
     System.out.println("Introduce un valor para b: ");
     b = sc.nextInt();
     System.out.println("Introduce un valor para c: ");
     c = sc.nextInt();
     d = b*b -4*a*c;    
     
//Condiciones especiales
  
        if (a == 0) {
            System.out.println("No existen soluciones reales");
        }else{
        } if (d<0) {
            System.out.println("No se puede");
        }else{
        }
        
 //formula
 
        x1 = (-b + Math.sqrt(d))/(2*a);
        x2 = (-b - Math.sqrt(d))/(2*a);
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);


    }
    
}
