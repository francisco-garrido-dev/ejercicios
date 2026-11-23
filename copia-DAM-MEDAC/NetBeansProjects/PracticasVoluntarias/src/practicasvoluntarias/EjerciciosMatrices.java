/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasvoluntarias;

/**
 *
 * @author beetlepie
 */
public class EjerciciosMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crea una matriz de caracteres de 4x4. Rellénala de forma que los caracteres 'B' y 'N' se alternen como en un tablero de ajedrez 
           (la primera casilla es 'B', la segunda 'N', la tercera 'B', etc.). Imprime el resultado final.

         */

        char[][] ajedrez = new char[4][4];

        for (int i = 0; i < ajedrez.length; i++) {
            for (int j = 0; j < ajedrez[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    ajedrez[i][j] = 'B';
                } else {
                    ajedrez[i][j] = 'N';
                }

                System.out.print(ajedrez[i][j]);
            }

            System.out.println("");
        }

        System.out.println("");

        /*2. El número mayor: crea una matriz de números enteros de 3x3 y llénala con valores aleatorios entre 1 y 100 utilizando Math.random(). 
          Busca cuál es el número más alto de toda la matriz y muéstralo por pantalla.
        
         */
        int[][] mayor = new int[3][3];
        int highest = 0;

        for (int i = 0; i < mayor.length; i++) {
            for (int j = 0; j < mayor[i].length; j++) {
                mayor[i][j] = (int) (Math.random() * 100 + 1);
                if (highest < mayor[i][j]) {
                    highest = mayor[i][j];
                }

                System.out.print(mayor[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("El número más alto es: " + highest);

        System.out.println("");

        /*3. Suma por filas: Declara una matriz de 4 filas y 3 columnas con valores enteros predefinidos. 
            Calcula la suma de los elementos de cada fila por separado y muestra el resultado de cada una 
            (deberías imprimir cuatro totales distintos).

         */
        int[][] sumaFilas = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}; // Concepto: sumaFilas[0][0] + sumaFilas[0][1] + sumaFilas[0][2].

        for (int i = 0; i < sumaFilas.length; i++) {
            int sum = 0; //Reinicia la suma.

            for (int j = 0; j < sumaFilas[i].length; j++) {
                sum = sum + sumaFilas[i][j];
            }

            System.out.println(sum);

        }

        System.out.println("");

        /* 4. Crea una matriz de caracteres de 5x5 rellena con el carácter '-'. Coloca una 'X' en una posición completamente aleatoria. 
        A continuación, busca esa 'X' y, cuando la encuentres, imprime un mensaje indicando en qué fila y en qué columna exacta estaba.
        EL programa debe buscar la X, no vale chivar las coordenadas.
         */
        char[][] position = new char[5][5];
        int fila = (int) (Math.random() * position.length);
        int columna = (int) (Math.random() * position.length);
        position[fila][columna] = 'X';

        int location1 = 0, location2 = 0;

        for (int i = 0; i < position.length; i++) {

            for (int j = 0; j < position[i].length; j++) {
                if (position[i][j] != position[fila][columna]) {
                    position[i][j] = '-';
                }

                if (position[i][j] == 'X') {

                    location1 = i;
                    location2 = j;

                }

                System.out.print(position[i][j]);
            }

            System.out.println("");
        }

        System.out.println("La 'X' se encuentra en la fila " + (location1 + 1) + " y la columna " + (location2 + 1) + ".");

        /* 5. Genera una matriz de enteros de 4x4. Llena con el número 1 todas las
            casillas donde el índice de la fila y el índice de la columna coincidan. El resto de las casillas 
            deben contener el número 0. Imprime la matriz resultante.
         */
        int[][] exercise5 = new int[4][4];

        for (int i = 0; i < exercise5.length; i++) {
            for (int j = 0; j < exercise5[i].length; j++) {

                if (i == j) {
                    exercise5[i][j] = 1;
                } else {
                    exercise5[i][j] = 0;
                }

                System.out.print(exercise5[i][j]);
            }

            System.out.println("");
        }

        System.out.println("");

        /*6. Crea una matriz de 3x3 con los números del 1 al 9. Crea una segunda matriz vacía del mismo tamaño. Copia los datos de la primera matriz en la segunda, 
          pero invirtiendo sus posiciones: lo que en la primera era una fila, en la segunda debe convertirse en una columna. Imprime la segunda matriz.
        
         */
        int[][] exercise6 = new int[3][3];
        int[][] emptyMatrix = new int[3][3];
        byte assignNumbers = 1;

        for (int i = 0; i < exercise6.length; i++) {
            for (int j = 0; j < exercise6[i].length; j++) {
                exercise6[i][j] = assignNumbers;
                assignNumbers++;
                System.out.print(exercise6[i][j]);
            }

            System.out.println("");
        }
        
        System.out.println("");

        for (int i = 0; i < emptyMatrix.length; i++) {
            for (int j = 0; j < emptyMatrix[i].length; ++j) {
                emptyMatrix[i][j] = exercise6[j][i];
                System.out.print(emptyMatrix[i][j]);
            }
            
            System.out.println("");
        }

    }

}
