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
public class Relojif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
    Scanner sc = new Scanner (System.in);
    int segundos = 0;
    int minutos = 0;       
    int hora = 0;
        System.out.println("Introduzca hora: ");
         hora = sc.nextInt() ;
            System.out.println("Introduzca minutos: ");
        minutos = sc.nextInt() ;
            System.out.println("Introduzca segundos: ");
        segundos = sc.nextInt(); 
        
        segundos = segundos+1;
        
        if (segundos>=60) {
        segundos = segundos -60;
        minutos = minutos+1;
        if (minutos>=60) {
        minutos= minutos-60;
        hora = hora+1;
        if (hora>=23) {
        hora= hora-24;
        }
        }      
        }
        System.out.println(hora + ":" + minutos + ":" + segundos);
       




    }
    
}
