/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forarraysmatrices;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class BusquedaSecuencialMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Crea una matriz de 3 × 3. Pide al usuario un número entero y utiliza 
        ciclos for anidados para buscar si ese número existe dentro de la matriz,
        indicando en qué fila y columna se encuentra.
         */
        byte[][] matrix = new byte[3][3];

        for (byte i = 0; i < matrix.length; i++) {
            for (byte j = 0; j < matrix.length; j++) {
                byte random = (byte) (Math.random() * 9 + 1);
                matrix[i][j] = random;
            }

            System.out.println(Arrays.toString(matrix[i]));

        }

        System.out.println("");
        System.out.println("Tell me a number and I'll give you its position! ");
        int input = sc.nextInt();

        do {
            if (input < 1 || input > 9) {
                System.out.println("Only numbers between 1 and 9! Try again: ");
                input = sc.nextInt();
            }

        } while (input < 1 || input > 9);

        boolean found = false;

        for (byte i = 0; i < matrix.length; i++) {

            for (byte j = 0; j < matrix[i].length; j++) {
                if (input == matrix[i][j]) {
                    System.out.println("Number " + input + " was found in " + " line " + (i + 1) + " and column " + (j + 1) + ".");
                    found = true;

                }

            }

        }
        
        if (found == false) {
            System.out.println("Your number was not found...");
        }

    }

}
