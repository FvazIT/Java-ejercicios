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
public class Diadeprogramacionif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   char letra = 'L';
    Scanner sc = new Scanner (System.in);
    System.out.println("Dia de programación: ");
    letra = sc.next().charAt(0);
        
  if (letra == 'L' || letra =='l') {
         System.out.println("Lunes hay programación");
    }else  if (letra == 'X' || letra =='x') {
         System.out.println("Miércoles hay programación");
    }else  if (letra == 'V' || letra =='v') {
        System.out.println("Viernes hay programación");    
    }else {
        System.out.println("Ese día no hay programación");   
    }  

    }
    
}
