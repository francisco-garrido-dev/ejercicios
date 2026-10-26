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
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Matrices bidimensionales

        int[][] matriz = new int[3][3]; //Primer corchete: filas. Segundo corchete: columnas.
        /*Si es cuadrada, se ponen los mismos números. En este caso, sería 
                                          un cuadrado de 3 filas y 3 columnas.
        
        
        ¡¡MUY IMPORTANTE PARA TENER EN CUENTA!!
        
        matriz.length = número de filas. En un array unidimensional, devolvería el total de elementos, no de filas.
        matriz[i].length = número de columnas/elementos de la fila i.
        matriz[i][j] = casilla exacta (en qué fila y columna se encuentra valor guardado).
        
        Para mostrar el contenido, primera forma:
        
         */

        for (int i = 0; i < matriz.length; i++) { //Se encarga de recorrer las filas (3 en este caso).

            for (int j = 0; j < matriz[i].length; j++) { //matriz[i] cantidad de elementos que hay en la fila i. Recorre cada columna.
                System.out.print(matriz[i][j]);//Se encarga de imprimir los valores de la fila (i) y la columna (j), el valor ubicado en esa posición.
            }

            System.out.println("");
        }
        
        /* Desgranando el bucle interno: el único propósito de esta estructura es recorrer todos los números de una matriz. Ese .length se refiere al tamaño total de la fila e [i] 
           se adapta a cada una de ellas con cada vuelta para hacer un recorrido adaptado a su tamaño... No se moverá de a la siguiente fila (i + 1) hasta que 
           haya recorrido todas las columnas con j. 
        
        */

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i])); //Alternativa con Arrays.toString.
        }

        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //Crear matriz con valores predefinidos.

        for (int i = 0; i < matriz2.length; i++) { //Se encarga de recorrer las filas.

            for (int j = 0; j < matriz2[i].length; j++) { //matriz[i] columnas.
                System.out.print(matriz2[i][j]); //Se encarga de imprimir los valores de la fila.
            }

            System.out.println("");
        }

        //Crear una matriz de 5x5 con la letra X en todas sus casillas.
        char[][] tablero = new char[5][5];

        for (int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], 'x');
        }

        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }

        //Crear una matriz de 5x5 con la letra X en todas sus casillas menos en una.
        //De manera aleatoria, se guarda una 'a' en una posición cualquiera.
        char[][] tablero2 = new char[5][5];
        int fila = (int) (Math.random() * tablero.length);
        int columna = (int) (Math.random() * tablero.length);
        tablero2[fila][columna] = 'A';

        for (int i = 0; i < tablero2.length; i++) {
            Arrays.fill(tablero2[i], 'x');
            tablero2[fila][columna] = 'A';
            System.out.println(Arrays.toString(tablero2[i]));
        }
        
        System.out.println("");

        //Lo mismo que el anterior, pero añadiendo una B aleatoria.
        do {
            fila = (int) (Math.random() * tablero.length);
            columna = (int) (Math.random() * tablero.length);

        } while (tablero[fila][columna] == 'A'); //Posición fila aleatoria y posición columna aleatoria. Por ejemplo: pos 1 en fila y pos 3 en columna.

        for (int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], 'x');
            tablero2[fila][columna] = 'B';
            System.out.println(Arrays.toString(tablero2[i]));
        }

    }

}
