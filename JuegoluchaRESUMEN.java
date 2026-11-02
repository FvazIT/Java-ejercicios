/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class JuegoluchaRESUMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 
        //Declaración de variables
          Scanner sc = new Scanner (System.in);       
          int resp=0 , dado=0 , vidajug=10 , vidabot=10;
          boolean ajuste = true;
         
          
        System.out.println("Bienvenido al Superjuego de lucha");
        
        do {
            System.out.println("1.jugar, 2.Ajustes, 3.Estadísticas, 4.Salir.");    
            resp=sc.nextInt();
            switch  (resp){
            
                case 1:
                  //jugar  
                    if (!ajuste) {    //puedo jugar
                        
                        //jugador
                        System.out.println("1. Pelear  2. Descansar"); 
                        resp=sc.nextInt();
                        if (resp==1) {
                        dado= (int) (Math.random()*6+1);
                        vidabot=vidabot-dado;    
                        } else {
                        vidajug=vidajug+1;
                        }
                        
                        //máquina
                        
                        int eleccion= (int) (Math.random()*2);
                        if (eleccion==0) { //pelear
                          dado= (int) (Math.random()*6+1);
                          vidajug=vidajug-dado;
                        } else { //descansar
                        vidabot++;
                        }
  
                    } else {
                        System.out.println("Pasa por ajustes");
                    } 
            
                break;
                case 2:
                    //ajustes
                    
                  if (ajuste) {
                     do{
                        System.out.println("1. Fácil  2. Normal  3. Difícil");
                        resp=sc.nextInt();
                        switch (resp){ 
                            
                         case 1:
                         vidabot=8;
                         break;
                        
                         case 2: 
                         vidabot=10; 
                         break;
                        
                         case 3: 
                         vidabot=12; 
                        break;
                        }
                      }while (resp<1 || resp>3);
                     ajuste=false; //para que solo cambie 1 vez y no pueda venir sin entrar primero 
                        
                   }else {
                        System.out.println("Ya estás jugando, no puedes cambiar ajustes");
                        }
                   
                break;    
                case 3:
                    //estadísticas
                    System.out.println("Vida del jugador: " + vidajug);
                    System.out.println("Vida del Bot: " + vidabot);
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                              if (i==1 && j==1) {
                                System.out.print(" O");
                             } else if (i==1 && j==2) {
                                System.out.print(" O");
                             } else {
                                System.out.print(" X");
                                }
                           }
                        System.out.println(" ");
                     }  

                break;    
                case 4:
                    //saliendo
                    
                break;
                
                default:
                    System.out.println("Número incorrecto");
            
            
            
            
            
            
            
            
            
            
            }
        } while (resp!=4 && vidajug>0 && vidabot>0);
        
        
        
        
 



        
        
        
        
        
        



    }
    
}
