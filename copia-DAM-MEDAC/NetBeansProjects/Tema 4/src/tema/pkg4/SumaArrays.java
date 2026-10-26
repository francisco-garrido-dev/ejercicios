/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg4;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class SumaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Enunciado: el usuario decide el tamaño del Array (le preguntamos antes). El usuario irá rellenando posición a posición. 
        Una vez relleno, lo mostramos para ver que esté bien. Finalmente, se hace la suma de los números.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Array size? ");
        int[] maxNumbers = new int[sc.nextInt()];
        int sum = 0;

        for (int i = 0; i < maxNumbers.length; i++) {
            System.out.println("Dime un número: ");
            maxNumbers[i] = sc.nextInt();
            sum = sum + maxNumbers[i];
        }

        for (int i = 0; i < maxNumbers.length; i++) {
            System.out.print(maxNumbers[i] + " | ");
        }

        System.out.println("Suma de los números: " + sum);

    }

}
