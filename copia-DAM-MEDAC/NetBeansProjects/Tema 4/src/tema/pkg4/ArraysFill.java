/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg4;

import java.util.Arrays;

/**
 *
 * @author MEDAC
 */
public class ArraysFill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] password = {'a', 'b', 'c'};
        char[] array2 = new char[3];
        char[] array3 = {'a', 'b', 'c'};
        
        Arrays.fill(array2, 'x'); //Rellena el array2 con 3 'x'.
        System.out.println(Arrays.toString(array2));
        
        Arrays.equals(password, array3); /*Compara si el CONTENIDO es el mismo. Sin embargo, seguirán estando
                                           en direcciones de memoria distintas. En este caso, es true.
        */
    }
    
}
