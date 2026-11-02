/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema4;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author MEDAC
 */
public class Orden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//  ------------------- Un array de enteros. SORT ordena de mayor a menor. ------------------


   int[] array = {7, 9, 4, 3, 2};
    
    Arrays.sort(array);   
    System.out.println(Arrays.toString(array));

/* LETRAS
    Arrays.sort(letras);
    System.out.println(Arrays.toString(letras));

    */
//------------------------------------------FILL RELLENA EL ARRAY con lo que le digas ---------------------
    char [] letras = {'b', 'c', 'a'};

    char [] letras2 = new char [20];
    
    Arrays.fill (letras2, 'X');
    
        System.out.println(Arrays.toString(letras2));

        //---------------------------------EQUAL te compara el contenido de dos arrays para ver si son iguales ---
    char [] letras3 = {'b', 'c', 'a'};
    
    
        System.out.println(Arrays.equals(letras, letras3));

    }
    
}
