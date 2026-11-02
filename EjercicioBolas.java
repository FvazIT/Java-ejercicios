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
public class EjercicioBolas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


//10 personas votan: b o n, quiero que me diga quien ha ganado y ponga "han ganado las blancas"
  //o "han ganado las negras, o si hay empate que lo diga
  
    Scanner sc = new Scanner (System.in);
    char bolas = 0;
    int contn = 0, contb = 0;
    int votos= 0;
  
    
    while (votos<4){        
       System.out.println("Introduzca su voto: ");
        bolas=sc.next().charAt(0);
        if (bolas=='b') {
        contb++;   
            }else if (bolas=='n') {
        contn++;      
        } else {
            votos= votos-1;
        }  
        votos++;
        }
        
        if (contb > contn) {
        System.out.println("Ganan las Blancas");  
        }
         if (contn > contb) {
        System.out.println("Ganan las Negras");  
        }else if (contn==contb) {
             System.out.println("Es un empate");
            }







    }
    
}
