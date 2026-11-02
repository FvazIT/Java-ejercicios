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
public class Alsalirdeclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    //quieres salir? y o n. Si contesta n vuelve a preguntar, si contesta p te sale "letra incorrecta" y quieres salir
    //si sale s, fin


    Scanner sc = new Scanner (System.in);
        char letra;
        System.out.println("Quieres salir?: ");
        letra=sc.next().charAt(0);
        
        while (letra!='y' && letra!='Y') {
         if (letra!='n') {
           System.out.println("Letra incorrecta");
          }
            System.out.println("Quieres salir?: ");
            letra=sc.next().charAt(0);
        }
        System.out.println("Hasta pronto!");


    }
    
}
