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
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {



   Scanner sc = new Scanner (System.in);
   int horas = 0;
   int valor = 10, resta =0;
   int  resultado = 0;
   
        System.out.println("Cuántas horas has estado en el taller?: ");
        horas = sc.nextInt();
        
        
        if (horas<=0) {
            System.out.println("Lo siento, no es posible");
            }else if (horas<6) {
             System.out.println("El precio es: " + (horas*10+valor));
             } else {
             resta = horas -5;
             resultado = 50+resta*15+10;
                System.out.println("El precio es: " + resultado);
            }

    }
    
}
