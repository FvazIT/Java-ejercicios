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
public class Donandosangredowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


            //van entrando personas a donar hasta 100ml, cada persona decide
            //cuántos mililitros puede sacar entre 0 y 10. cuando llegue a 100
            //el programa acaba y te dice cuantas personas han hecho falta para llegar
            //a cien
            
          Scanner sc = new Scanner (System.in);
          int donacion = 100;
          int ml = 0;
          int contador = 0;
          
          do{
         System.out.println("Cuánto quieres donar?: ");
         ml= sc.nextInt();     
         
              if (ml<1 || ml>10) {
                  System.out.println("Error, fuera de rango");
                  contador--;
              } else {
                donacion=ml;
                System.out.println("Queda por donar: " + donacion);
              }
              
         contador++;
          }while (donacion>0);   
          
          System.out.println("Han hecho falta " + contador + " personas para llegar a la cifra.");    
              



    }
    
}
