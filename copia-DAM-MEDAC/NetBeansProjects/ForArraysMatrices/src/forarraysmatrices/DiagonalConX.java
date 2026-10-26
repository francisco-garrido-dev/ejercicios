/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forarraysmatrices;

import java.util.Arrays;

/**
 *
 * @author PC
 */
public class DiagonalConX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        : Crea una matriz cuadrada de tamaño N × N (por ejemplo, 5 × 5). 
        Usa ciclos for para colocar una letra 'X' en su diagonal principal y
        un guion '-' en el resto de las posiciones
         */

        int[][] matrix = new int[3][3];

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 9 + 1);
                System.out.print(matrix[i][j]);
            }

            System.out.println("");
        }

        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][i];
        }

        System.out.println("Suma en diagonal (derecha): " + sum + ".");

        sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][matrix.length - 1 - i];
        }

        System.out.println("Suma en diagonal (izquierda): " + sum + ".");
        
        System.out.println("");

        char[][] matrix2 = new char[5][5];

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = '-';
                matrix2[i][i] = 'X';
                System.out.print(matrix2[i][j]);
            }
            
            System.out.println("");

        }

    }
    
}
