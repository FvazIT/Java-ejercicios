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
public class Adivinadado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

                             //nº de 0 a 99//
         int dado = (int) (Math.random()*100);
//         System.out.println("Numero mio: " + dado);//
         System.out.println("Introducir numero: ");
         int Numerousuario = sc.nextInt();

         
         System.out.println("Numero usuario: " + Numerousuario);
         System.out.println("Es mayor?:" + (dado > Numerousuario));
         System.out.println("Es menor?:" + (dado < Numerousuario));
         System.out.println("Es igual:" + (dado == Numerousuario));

         
        
        
    }
    
}
 
