/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema3;

/**
 *
 * @author franv
 */
public class CosasconIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

/*if no se cierra. + pregunta entre paréntesis, está se tendrá que comprobar si se cumple
para añadir varias (y)Método 1: puedo añadir más if's dentro de otro (anidados)y el sout al final, no suele ser correcto porque es más lioso.
también puedo Método 2: usar "&&"(and) dentro del mismo para añadir o || (or)para si es uno u otro. Se pueden usar dobles paréntesis para no 
        liarnos
//Método 1:
        int x = 1;
        int y = 5;
        
        if  (x==1){
         if (y == 5){
        System.out.println("tanto x es 1 como y es 5");
         }
      }
        */
 //Método 2:
            
        int x = 0;
        int y = 5;
 
          if ((x==0) && (y==5)) {
          System.out.println("dentro");    
            
            //else NUNCA va con expresión (pregunta), no se pone nada entre else y la llave.
            
        }else {
            System.out.println("fuera");
        }


    }
    
}
