/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasvoluntarias;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author beetlepie
 */
public class PruebaExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        int sum = 0, max = 0, min = 100;

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100 + 1);
            sum += randomArray[i];

            if (randomArray[i] > max) {
                max = randomArray[i];
            }

            if (randomArray[i] < min) {
                min = randomArray[i];
            }
        }

        System.out.println(Arrays.toString(randomArray));
        System.out.println("Sum of the numbers: " + sum + " | " + "average: " + (1.0 * sum / 10) + " | " + "highest number: " + max + " | lowest number: " + min);

        char[] word = {'h', 'o', 'l', 'a'};
        int vowels = 0;
        for (int i = 0; i < word.length; i++) {
            switch (word[i]) {
                case 'A', 'a':
                    vowels++;
                    break;
                case 'E', 'e':
                    vowels++;
                    break;
                case 'I', 'i':
                    vowels++;
                    break;
                case 'O', 'o':
                    vowels++;
                    break;
                case 'U', 'u':
                    vowels++;
                    break;
            }
        }

        System.out.println("Number of vowels: " + vowels);

        char[] dna = new char[12];

        for (int i = 0; i < dna.length; i++) {
            if (i < 3) {
                dna[i] = 'A';
            } else if (i < 6) {
                dna[i] = 'B';
            } else if (i < 9) {
                dna[i] = 'C';
            } else {
                dna[i] = 'D';
            }
        }

        System.out.println(Arrays.toString(dna));

        String palabra = "hola";

        System.out.println(palabra.length());

        char[][] chess = new char[6][6]; //Tablero de ajedrez

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if (i % 2 == 0) { //Si la fila es par
                    if (j % 2 == 0) { //Si la columna es par, se pone X
                        chess[i][j] = 'X';
                    } else {
                        chess[i][j] = 'B';
                    }

                } else { //Si la fila es impar
                    if (j % 2 != 0) { //Se invierte con respecto a la anterior, ahora las X se colocan en las impares
                        chess[i][j] = 'X';
                    } else {
                        chess[i][j] = 'B';
                    }
                }
            }

            System.out.println(Arrays.toString(chess[i]));
        }

        System.out.println("");
        //Suma de filas, de columnas y diagonal en un tablero de 5x5 aleatorio.
        int[][] randomMatrix = new int[5][5];
        fillRandomly(randomMatrix);
        for (int i = 0; i < randomMatrix.length; i++) {
            System.out.println(Arrays.toString(randomMatrix[i]));
        }

        sum = 0;
        byte sumDiag = 0;
        byte sumnColumns = 0;

        for (int i = 0; i < randomMatrix.length; i++) {
            sum = 0;
            sumnColumns = 0;
            sumDiag += randomMatrix[i][i];
            for (int j = 0; j < randomMatrix[i].length; j++) {
                sum += randomMatrix[i][j];
                sumnColumns += randomMatrix[j][i];
            }

            System.out.println("Sum of line " + i + ": " + sum);
            System.out.println("");
            System.out.println("Sum of column " + i + ": " + sumnColumns);

        }

        System.out.println("Sum diagonally: " + sumDiag);
        System.out.println(isNumber(randomMatrix));

    }

    private static void fillRandomly(int[][] randomMatrix) {
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix[i].length; j++) {
                randomMatrix[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
    }

    private static boolean isNumber(int[][] randomMatrix) {
        byte random = (byte) (Math.random() * 9 + 1);
        System.out.println("Number asked: " + random);
        boolean isThere = false;
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix[i].length; j++) {
                if (randomMatrix[i][j] == random) {
                    isThere = true;
                    System.out.println("Found in line " + i + " and column " + j);
                }
            }
            
            
        }
        
        return isThere;
    }

}
