/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema3;

/**
 *
 * @author franv
 */
public class Ejerciciobatería {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   int bateria=25;
   int rand=0;
   int cont=0;
   boolean avion=false;
   
    do{
        
     cont++; 
     rand= (int) (Math.random()*10+1);
     bateria=bateria-rand;
        if (cont==3) {
        avion=true;    
         }
         }while(bateria>0 && !avion);
          
          if (avion){
                System.out.println("La bateria es: " + bateria + " Modo avión: " + avion);    
            }else {
                System.out.println("La batería es: " + bateria);
            }  

    }
    
}
