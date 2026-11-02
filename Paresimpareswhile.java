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
public class Paresimpareswhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


//el usuario introduce números y para cuando encuentre un negativo
        //si el número que introducres positivo es par que lo diga y si es impar que lo diga.
        //quiero también saber cuantos introduzco y si son pares o impares
        
        Scanner sc = new Scanner (System.in);
        int num =0;
        int cont=0;
        int contpares=0;
        int contimpares=0;
        System.out.println("Introduce un número: ");
        num= sc.nextInt();
        
     
        
       while (num>=0) {
       cont ++;
       if ( num%2 == 0) {
       System.out.println("El número es par");
       contpares++;
       } else if (num%2!=0){
       System.out.println("El número es impar");
       contimpares++;
       }System.out.println("Introduce un número: ");
       num= sc.nextInt();
        }
        System.out.println("Número de vueltas: " + cont + " Número de pares: " + contpares + " Número impares: " + contimpares);

    }
    
}
