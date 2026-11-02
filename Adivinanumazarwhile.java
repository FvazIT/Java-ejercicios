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
public class Adivinanumazarwhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//num random y usuario introduce un numero, si es mayor o menor le dice si el random es + o -, hasta que adivine

    Scanner sc = new Scanner (System.in);
    int numazar = (int) (Math.random()*100);
    int num=0;
       //System.out.println("El dado al azar sacó: " + numazar);
        
    System.out.println("Introduce un número: ");
    num=sc.nextInt();
        
   while (num!=numazar){
       if (num<numazar) {
       System.out.println("El número introducido es menor");    
       } else{
       System.out.println("El número introducido es mayor");    
       }
       System.out.println("Introduce otro número: ");
     num=sc.nextInt();
   }     
        System.out.println("Has acertado, el número era: " + num);  
        







    }
    
}
