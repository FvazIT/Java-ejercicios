/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema3;

/**
 *
 * @author MEDAC
 */
public class Salto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

/*
        for (int i = 0; i < 5; i++) {
            if (i==2) {
                continue;           //Se la pela lo que haya abajo que se lo salta, no hace el 2.
            }
            System.out.println("Hola");
        }

        */
        
     for (int i = 0; i < 5; i++) {
            if (i==2) {
                break;           //Se la pela lo que haya se para y se sale del bucle.
            }
            System.out.println("Hola");
        }
   
        //Quedan RETURN y go to, de c++
        

    }
    
}
