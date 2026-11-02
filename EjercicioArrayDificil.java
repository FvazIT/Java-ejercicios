/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class EjercicioArrayDificil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//contraseña admin. el usuario va a ver xxxx, lo que yo quiero es obligar a usuario a poner la 1 posición. voy a poner un contador que
//añade las veces que lo intenta.
//primero pensar que los dos array se pueden crear el oculto y el que se muestra

        Scanner sc = new Scanner (System.in);  
         char [] pass = {'a', 'd', 'm', 'i', 'n'};
         char [] usuario = {'x', 'x', 'x','x', 'x'};
         char letra;
         int cont=0;
         
         
         for (int i = 0; i < usuario.length; i++) {
            
             do {
                 System.out.println("Introduce la letra de la posición: " +i);
                 letra=sc.next().charAt(0);
                 
                 if (letra!=pass[i]) {
                     System.out.println("Incorrecto");
                     cont++;
                 } else{
                     usuario[i]=pass[i];
                     
                     for (int j = 0; j < usuario.length; j++) {
                         System.out.print(usuario[j]);
                       
                     }
                 }
                 
                 
             } while (pass[i]!=usuario[i]);
           
        }
  System.out.println(" ");          
  System.out.println("Has fallado: " + cont + " veces.");
    }
    
}
