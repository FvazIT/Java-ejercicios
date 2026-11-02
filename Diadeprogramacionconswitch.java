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
public class Diadeprogramacionconswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    
//Ahora con SWITCH: estructura equivalente a IF (no siempre se puede). 
  
      char letra = 'L';
     Scanner sc = new Scanner (System.in);
     System.out.println("Dia de programación: ");
     letra = sc.next().charAt(0);
        
        switch (letra) {
            case 'L', 'l':
                System.out.println("Lunes hay programación");
                break;
            case 'X', 'x':
                System.out.println("Miércoles hay programación");
                break;
            case 'V', 'v':
                System.out.println("Viernes hay programación");   
                break;
            default:
                System.out.println("No hay programación");
                break;

     
    }
   }
  }

//los break dan salto hacia el final del código.
  //si tiene decimales (double o float) mejor con if, ya que al añadir varios daría problemas por la coma del decimal.