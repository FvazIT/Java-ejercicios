/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Paresimpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


//meter nº enteros por consola. array de pares y de impares.

   
    Scanner sc = new Scanner (System.in);  
    
  //declaración del array
    
        int pares=0;
        int impares=0;
        int p=0; //indice pares
        int y=0; //indiceimpares
        int [] numeros = new int [10];
  

    //rellenar  
        for (int i = 0; i < numeros.length; i++) {   
            numeros[i]= (int)(Math.random()*10.);
            }
        
         System.out.println(Arrays.toString(numeros));
         
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0) {
             pares++;   
           }else {
             impares++;
           }
        }
        
        int[] arraypares = new int [pares];
        int[] arrayimpares = new int [impares];
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0) {
                arraypares[p]=numeros[i];
               p++;
            } else {
                arrayimpares[y]=numeros[i];
                y++;
            }
   
        }

      System.out.println(Arrays.toString(arraypares));
      System.out.println(Arrays.toString(arrayimpares));

        
        
        
        
        
        
        
        
    }
    
}
