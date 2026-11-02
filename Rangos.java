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
public class Rangos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


//el usuario por teclado introduce rango min y máximo, inteligente, luego va a pedir introducir nº y cuando este en rango sale del 
        //bucle
        
    Scanner sc = new Scanner (System.in);
    int rangomin=0;
    int rangomax=0;
    int num=0;
        System.out.println("Introduce rango mínimo: ");
        rangomin=sc.nextInt();
        System.out.println("Introduce rango máximo: ");
         rangomax=sc.nextInt();
         System.out.println("Introduce un número: ");
         num=sc.nextInt();
         while  (num<rangomin || num>rangomax) {
             System.out.println("Introduce otro");
             num=sc.nextInt();
         }
         System.out.println("Lo has clavado, tu número está entre " + rangomin + " y " + rangomax);
         


    }
    
}
