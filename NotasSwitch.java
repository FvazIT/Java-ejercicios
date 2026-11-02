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
public class NotasSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Scanner sc = new Scanner (System.in);
        System.out.println("Introduce tu nota: ");
        int nota = sc.nextInt();
        
        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("Suspenso");
                break;
                case 5:
                System.out.println("Aprobado");
                break;
            case 6:
                System.out.println("Bien");   
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");   
                break;
            default:
                System.out.println("No es una nota válida");
                break;
            }




    }
    
}
