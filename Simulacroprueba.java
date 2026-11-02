/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema4;

import java.util.Arrays;

/**
 *
 * @author MEDAC
 */
public class Simulacroprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //declara e inicializa 4 array staticos de char
                    
           char [] hebra1 = new char [16]; 
           char [] hebra2 = new char [16]; 
           char [] hebra3 = new char [16]; 
           char [] hebra4 = new char [16]; 
           char [] hebra5 = new char [16]; 
           char [] hebra6 = new char [32]; 
           int  cont=0;
           int  conta=0;
           int  contc=0;
           int  contg=0;
           int  contt=0;
          
           Arrays.fill(hebra1, 'A');
           Arrays.fill(hebra2, 'T');
           Arrays.fill(hebra3, 'C');
           
           for (int i = 4; i < hebra1.length; i++) {
              if (i>3 && i<8) {
                   hebra1[i]= 'T';
                   hebra2[i]= 'A';
                   hebra3[i]= 'G';  
               }else if (i>7 && i<12) {
                   hebra1[i]= 'G';
                   hebra2[i]= 'G';
                   hebra3[i]= 'T';
                }else {
                   hebra1[i]= 'C';
                   hebra2[i]= 'C';
                   hebra3[i]= 'A';
                  }
              }
           
            //Rellenar hebra4
           for (int i = 0; i < hebra4.length; i++) {
             int rand = (int) (Math.random()*4);
               
             switch (rand){
             
                 case 0:
                     hebra4[i]='A';
                      break;
                 case 1:
                     hebra4[i]='T';
                      break;
                 case 2:
                     hebra4[i]='G';
                     break;
                 case 3:
                     hebra4[i]='C';
                     break;
                             }
                  }           
             //contador letras hebra 4
             
               for (int i = 0; i < 16; i++) {
                   if (hebra4[i]=='A') {
                       conta++;
                    }else if(hebra4[i]=='C') {
                       contc++;
                   } else if (hebra4[i]=='G') {
                       contg++;
                   } else{
                       contt++;
                   }
   
               }
             
            /* Forma corta
                     
             char [] arrayAux = {'A', 'G, 'C, 'T'};
            
             for (int i = 0; i < hebra4.length; i++) {
                   int rand = (int) (Math.random()*4);
                   hebra4[i]=arrayAux[rand];     
             }*/
           
               for (int i = 15; i >= 0; i--) {
               hebra5[cont]=hebra2[i];
               cont++;
               } //puedes ahorrarte la variable aux de cont poniendo hebra5[15-i]=hebra2[i];
               
           
//Añadimos hebra 1 y hebra 3 en una unica hebra6

                //una manera
                /*for (int i = 0; i < 16; i++) {
                 hebra6[i]=hebra1[i];
                 hebra6[16+i]=hebra2[i];
                }*/
               
               for (int i = 0; i < 32; i++) {
                   if (i<16) {
                  hebra6[i]= hebra1[i]; 
                   } else {
                   hebra6[i]=hebra3[i-16];
                   }
                   
                  }
               
               
            //mostrar
            System.out.println(Arrays.toString(hebra1));
            System.out.println(Arrays.toString(hebra2));
            System.out.println(Arrays.toString(hebra3));
            System.out.println(Arrays.toString(hebra4));
            System.out.println(Arrays.toString(hebra5));
            System.out.println(Arrays.toString(hebra6));
            
            System.out.println("nº de A en la Hebra 4: " + conta);
            System.out.println("nº de C en la Hebra 4: " + contc);
            System.out.println("nº de G en la Hebra 4: " + contg);
            System.out.println("nº de T en la Hebra 4: " + contt);
           
          
      
          
     

        
           
           
           
           
           
           
           
           
           

    }
    
}
