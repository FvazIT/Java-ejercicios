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
public class NotasDowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//usuario introduce 5 notas y salen por consola las suspensas

         Scanner sc = new Scanner (System.in);
         int notas=0;
         int suspenso=0;
         int aux=0;

         do{
         System.out.println("Introduce la notas: ");
         notas=sc.nextInt();
             if (notas<5) {
                 suspenso++;
             }
             aux++;
         } while (aux<5);
         System.out.println("Las suspensas son: " + (suspenso) );
         


    }
    
}
