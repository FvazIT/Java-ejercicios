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
public class Menujuegocase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         //crear menu de jugar-ajustes-salir
         Scanner sc = new Scanner (System.in);
         int respuesta=0;
        System.out.println("Bienvenido al juego de ejemplo.");
        
        do{
       
        System.out.println("1. Jugar");
        System.out.println("2. Ajustes");
        System.out.println("3. Salir");
        respuesta= sc.nextInt();
        
        switch (respuesta){
        case 1:
        System.out.println("Jugando");
        break;
        
        case 2:
        System.out.println("Ajustando");

        break;
        
        case 3:
        System.out.println("Saliendo");

        break;
        }
        }while (respuesta!=3);







    }
    
}
