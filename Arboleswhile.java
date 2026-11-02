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
public class Arboleswhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//control altura de arboles, alturas en cm, debemos comprobar cual es el más alto con etiqueta. -1 indica el final.
        
        Scanner sc = new Scanner (System.in);
        int altura=0;
        int masalto= 0;
        int etiqueta=1;
        int etiquetamax=0;
      
        
        System.out.println("Cual es la altura?: ");
        altura= sc.nextInt();
        
        while (altura!=-1){
           
            if (altura>masalto){
            masalto=altura;
            etiquetamax=etiqueta;
            } 
             System.out.println("Cual es la altura?: ");
             altura= sc.nextInt();
              etiqueta++;
        }
        
        System.out.println("El árbol más alto es: " + masalto + " y su etiqueta es: " + etiquetamax);
        
        


    }
    
}
