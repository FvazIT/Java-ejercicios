/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class EjercicioconFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//usuario introduce un número. tiene que salir la tabla de multiplicar.

    /* Scanner sc = new Scanner (System.in);
        
   
         int num=0;
         int auxiliar=1;
        
       
         System.out.println("Introduce un número para la tabla:");
         num=sc.nextInt(); 
         for (int i = 0; i < 11; i++) {
             System.out.print(num + "x" + i + "= " + num*i + " ");  //no es ln
        }*/
         
 //puedo hacer que salga directamente la tabla? queremos que no haga falta usuario, que lo haga solo.        

        for ( int num = 1; num < 11; num++) {
             for (int i = 1; i < 11; i++) {
             System.out.print(num + "x" + i + "= " + num*i + " ");  //no es ln
         }
             System.out.println("");
        }
        
        
        }
    
}



