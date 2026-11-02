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
public class EjemploArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        
       /*   
        
     int [] /* array   edades = new int [30]; //el 30 es el tamaño del array
//nombre de la variable + el new int es asignar la memoria
                //otra alternatuva
   /*
       int [] edades2={ 18,25,44,12,20};
       //tamaño 5
//System.out.println(edades);
//no sale ni mierda, sale un espacio de memoria de nombre a saber
//para recorrerlo
    
        for (int i = 0; i < 30; i++) { //30 por nuestro array
            System.out.print(edades[i]);
            
        }


        System.out.println("");


//System.out.println(edades2);

        for (int i = 0; i < 5; i++) {
            System.out.println(edades2[i]);
        }

        System.out.println(" ");
        
        //si quisiera cambiar el valor de la posición 3 de 12 a 18:
        edades2[3]=18;
        
        
              for (int i = 0; i < 5; i++) {
            System.out.println(edades2[i]);
        }
        
                System.out.println("");
    */            
       // se puede hacer con char 
    /*   
       char [] nombres = {'a', 'b', 'c'};
         
      
      Scanner sc = new Scanner (System.in);       


      char [] nombres2=new char [3];
  
  //Rellenar
  
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce Letra: ");
            nombres2[i]=sc.next().charAt(0);
        }
  
  //mostrar
  
        for (int i = 0; i < 3; i++) {
            System.out.println(nombres2[i]);
            System.out.print(" ");
        }
 */
        Scanner sc = new Scanner (System.in);       
        System.out.println("Dame el tamaño:");
        int size=sc.nextInt();
        int media=0;
       
        
        
         int [] array=new int [size];    
         //System.out.println(array.length); se puede sustituir por i<size
         //rellenar array
        for (int i = 0; i < size; i++) {
            System.out.println("Introduce número en posición: "+i);
            array[i]=sc.nextInt();
        }
        //mostrar 
         for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
            
         }

    
    int [] array2 = new int [array.length+1];
    
        for (int i = 0; i < array.length; i++) {
            array2[i]=array[i];
        }
        
        array2 [array2.length-1]=8;
        
        //mostrar
            
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] +" ");
        }
         
       /*
   //calcular media
   
        for (int i = 0; i < array.length; i++) {
            media=media+array[i];    //es "array[i} y no [i] porque queremos el contenido, no la posición
        }
            media= media/array.length;
            System.out.println("La media es: " + media);
               
      //localizar nº más alto      
         int mayor=array[0]; //se pone así porque si no empieza en 0 y si son negagivos no los contempla.
        
        for (int i = 0; i < array.length; i++) {
            if (array[i]>mayor) {
                mayor=array[i];
            }
            System.out.println("El más alto es: " + mayor);
        }
    
        //añadir 8
        
        for (int i = 0; i < size.length; i++) {
            
        }
       
       
       
       
        
       //ejemploloco 
        int []a;
        int []b = new int [5];
        a=b;
        
        b[0]=10;
        System.out.println(a[0]);
        
        */
        

    }
    
}
