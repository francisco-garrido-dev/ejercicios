/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasvoluntarias;

/**
 *
 * @author beetlepie
 */
public class PracticasVoluntarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Objetivo del ejercicio : guardar 'x' en todas las casillas.
        char[][] tabla = new char[3][3];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = 'x';
                System.out.print(tabla[i][j]);
            }

            System.out.println("");
        }

        System.out.println("");

        //Crear una matriz de 5x5 con la letra 'x' en todas sus casillas menos en una.
        //De manera aleatoria, se guarda una 'a' en una posición cualquiera.
        char[][] tabla2 = new char[5][5];
        tabla2[(int) (Math.random() * tabla2.length)][(int) (Math.random() * tabla2.length)] = 'a'; //Se guarda 'a' en una fila y columna aleatorios.

        for (int i = 0; i < tabla2.length; i++) {
            for (int j = 0; j < tabla2[i].length; j++) {
                if (tabla2[i][j] != 'a') { //Se guarda una 'x' solo cuando no haya una 'a'.
                    tabla2[i][j] = 'x';
                }

                System.out.print(tabla2[i][j]);
            }

            System.out.println("");
        }

        //Lo mismo que el anterior, pero añadiendo una B también.
        System.out.println("");

        char[][] tabla3 = new char[5][5];
        int fila = (int) (Math.random() * tabla3.length);
        int columna = (int) (Math.random() * tabla3.length);

        tabla3[fila][columna] = 'a';

        do {
            fila = (int) (Math.random() * tabla3.length);
            columna = (int) (Math.random() * tabla3.length);
            tabla3[fila][columna] = 'b';
        } while (tabla3[fila][columna] == 'a');

        for (int i = 0; i < tabla3.length; i++) {
            for (int j = 0; j < tabla3[i].length; j++) {
                if (tabla3[i][j] != 'a' && tabla3[i][j] != 'b') { //Se guarda una 'x' solo cuando no haya una 'a'.
                    tabla3[i][j] = 'x';
                }

                System.out.print(tabla3[i][j]);
            }

            System.out.println("");
        }

        System.out.println("");

        //Sumar números en diagonal.
        int[][] tabla4 = new int[3][3];

        int assignNumbers = 0;

        //Sumar números en diagonal: derecha.
        for (int i = 0; i < tabla4.length; i++) { //Generar tabla de números.
            for (int j = 0; j < tabla4[i].length; j++) {
                assignNumbers++;
                tabla4[i][j] = assignNumbers;
                System.out.print(tabla4[i][j]);
            }

            System.out.println("");
        }

        int sum = 0;

        for (int i = 0; i < tabla4.length; i++) {
            sum += tabla4[i][i]; //Idea central: sum = tabla4[0][0] + tabla4[1][1] +  tabla4[2][2]; 

            System.out.println("");
        }
        System.out.println("Suma hacia la derecha: " + sum);

        System.out.println("");

        //Al revés, suma hacia la izquierda:
        
        sum = 0;
        
         for (int i = 0; i < tabla4.length; i++) {
            
            sum += tabla4[i][tabla4.length - 1 - i]; //Idea central: sum = tabla4[0][0] + tabla4[1][1] +  tabla4[2][2];

            System.out.println("");
        }
         
        System.out.println("Suma hacia la izquierda: " + sum);

        System.out.println("");
    }

}
