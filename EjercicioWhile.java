/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema3;

/**
 *
 * @author franv
 */
public class EjercicioWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


//dado d20     si sale 5 mensaje     si no sale tira de nuevo
      

       int dado = (int) ((Math.random()*20)+1);
       int  cont = 1; // porque puede no llegar a tirar
        System.out.println("tira un dado");
  
       
       while (dado !=5) {
           cont ++;  //cont = cont+1;
           System.out.println("el dado es: " + dado);
           dado = (int) ((Math.random()*20)+1);
       
       }
        System.out.println("El dado es: 5 y ha tardado: " + cont + " tiradas.");



    }
    
}
