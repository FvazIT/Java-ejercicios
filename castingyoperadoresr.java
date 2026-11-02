/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema2;

/**
 *
 * @author franv
 */
public class castingyoperadoresr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
   //CASTING;
        //(int para forzar double)
        double  real = 3.25;
        int entero = (int) real;
        System.out.println("numero: " + entero);
        
        int n = 63;
        char letra = 'n';
        char letraa = 'p';
        int num = (int)letraa;
        System.out.println("letra es: " + num);
        
        //operadores relacionales
        
        int x = 5;
        int y = 3;
        System.out.println("Es mayor?: " + (x>y));
        System.out.println("Es mayor o igual?: " + (x>=y));
        System.out.println("Es mayor?: " + (x>y));
        System.out.println("Es igual?: " + (x==y));


    }
    
}
