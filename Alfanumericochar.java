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
public class Alfanumericochar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
        System.out.println("Introduce una letra: ");
        char letra  = 'a';
        letra = sc.next().charAt(0);
        System.out.println("La letra es: " + letra);
        
        char letra2 = 'a';
        int num = letra2;
        System.out.println(("numero" )+ letra2) ;    }
    
}
