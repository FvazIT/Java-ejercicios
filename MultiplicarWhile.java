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
public class MultiplicarWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


         Scanner sc = new Scanner (System.in);
         int num=0;
         int auxiliar=1;
         
      
         do{
         System.out.println("Introduce tu número");
         num=sc.nextInt(); 
        
         }while (num<0 || num>10); 
         
         while  (auxiliar<11){
             System.out.println(num + " x " +auxiliar + " = " + (num*auxiliar));
             
             auxiliar++;
         }



    }
    
}
