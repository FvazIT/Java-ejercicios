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
public class Caraocruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//menú. jugador introduce una letra en "jugar", c o x, si no es c o x (o mayusculas) vuelve a preguntar
        
        
        
     Scanner sc = new Scanner (System.in);
         int respuesta=0;
         char mon=0;
         int rand=0;
         char monmaquina;
         
     
        
        do{
        System.out.println("Bienvenido al juego de ejemplo.");
        System.out.println("1. Jugar");
        System.out.println("2. Ajustes");
        System.out.println("2. Ajustes");
        System.out.println("3. Salir");
        respuesta= sc.nextInt();
        
        switch (respuesta){
        case 1:
            
            do {
                System.out.println("Introduce cara o cruz: ");
                mon=sc.next().charAt(0);
               } while (mon!='c' && mon!='x' && mon!='C' && mon!='X');
            
                rand=(int) (Math.random()*2);
                System.out.println("dado ha sacado: " + rand);
                if (rand==0) {
                      monmaquina='c';              
                } else {
                    monmaquina='x';
                }
                
                if (mon=='c' || mon=='C' && monmaquina=='c') {
                System.out.println("Ganas");  
                } else if (mon=='x' || mon=='X' && monmaquina=='x') {
                    System.out.println("Ganas");
                } else {
                    System.out.println("Pierdes");
                }
                
                 respuesta=3; 
        
         break;
         
        case 2:
        
        System.out.println("Ajustando");

        break;
        
        case 3:
        System.out.println("Saliendo");

        break;
        }
        }while (respuesta!=3);{
        }
        
 
    }
    
}


