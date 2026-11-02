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
public class QuienesBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


//Declaración de variables
       Scanner sc = new Scanner (System.in);
       boolean gafas = false , sombrero = false, bigote = false, barba = false, pelo = false;

//Juego
       
       System.out.println("Bienvenido al MedacQuien");
      
       System.out.println("Tiene gafas?");
       gafas = sc.nextBoolean();
       System.out.println("Tiene sombrero?"); 
       sombrero = sc.nextBoolean();
       System.out.println("Tiene bigote?");
       bigote = sc.nextBoolean();
       System.out.println("Tiene barba?");
       barba = sc.nextBoolean();
       System.out.println("Tiene pelo?");
       pelo = sc.nextBoolean();

        if (bigote && sombrero && pelo  && !gafas && !barba) {
        System.out.println("Es Pops");
         } else if (!bigote && !sombrero && pelo  && !gafas && barba){
            System.out.println("Es Victor");
          }else if (bigote && !sombrero && !pelo  && gafas && !barba) {
            System.out.println("Es Salva");
           }else if (!bigote && sombrero && !pelo  && gafas && !barba) {
            System.out.println("Es Juan");
             }else if (!bigote && !sombrero && !pelo  && !gafas && !barba) {
             System.out.println("Es Eggs");
             }
                    


    }
    
}
