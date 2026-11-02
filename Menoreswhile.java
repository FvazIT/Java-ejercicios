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
public class Menoreswhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//entran alumnos y preguntamos edades. si hay un -1 el programa se termina y hace un contador de menores de edad.
        
       Scanner sc = new Scanner (System.in);
       int edad= 0;
       int cont=0;
        System.out.println("Introduce tu edad: ");
        edad=sc.nextInt();
       
        
        while (edad!=-1){
            if (edad>0 && edad<18) {
            cont++;  
            }
        System.out.println("Introduce tu edad: ");
        edad=sc.nextInt(); 
        }
       System.out.println("El número de alumnos menores de edad es: " + cont); 
    }
    
}
