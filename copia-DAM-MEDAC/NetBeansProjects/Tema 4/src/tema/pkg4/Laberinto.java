/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Laberinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] tablero = new char[5][5];

        rellenar(tablero); //Se llama al método "rellenar" y rellena el tablero según se le ha indicado abajo.
        mostrar(tablero);
        jugar(tablero);
    }

    private static void rellenar(char[][] tablero) {
        /*Al crear un método, Java ya sabe lo que es "rellenar". Se colocan dentro del método principal (main). 
    Se podría decir que los métodos habitan en su propio mundo. Los métodos pueden llevarse cosas del método principal, como puede ser la
    matriz "tablero". Es decir, si no se le pasa por parámetro el tablero, no se ve la variable del mundo principal (main). Los métodos se usan cuando se
    repite mucho código y evitar tener que reescribirlo de nuevo, así como para mejorar la legibilidad.
        
    Aquí dentro se programa con normalidad, como si fuera el método principal y lo hemos estado haciendo hasta ahora.
         */

        for (int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], 'X');
        }

        for (int i = 0; i < 4; i++) { //Camino horizontal vacío.
            tablero[0][i] = ' ';
        }

        for (int i = 0; i < 5; i++) { //Camino vertical vacío.
            tablero[i][3] = ' ';
        }

        tablero[0][0] = 'O'; //Posición de inicio del jugador.
        tablero[4][4] = ' '; //Casilla final de salida.

    }

    private static void mostrar(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }

    }

    private static void jugar(char[][] tablero) {
        Scanner sc = new Scanner(System.in);
        int coordX = 0, coordY = 0;

        do {
            System.out.println("1. Right | 2. Left | 3. Up | 4. Down");
            int resp = sc.nextInt();

            switch (resp) {
                case 1: //Ir a la derecha es cambiar de columna, si se mira el tablero. Podemos movernos hasta donde haya una X (es decir, en "fila 0, columna 4").
                    if (tablero[coordX][coordY + 1] != 'X') { //Si cuando yo le vaya a sumar + 1 me encuentro una X, entonces hay un problema. Si no, te puedes mover.
                        tablero[coordX][coordY] = ' '; //Se vacía la posición que se deja atrás.
                        coordY++; //Se avanza en por la coordenada Y.
                        tablero[coordX][coordY] = 'O'; //Se rellena la nueva posición.
                    } else {
                        System.out.println("You cannot do that movement!");
                    }

                    break;

                case 2:

                    if (coordY == 0 || (tablero[coordX][coordY - 1] == 'X')) {
                        System.out.println("You cannot move in that direction!");

                    } else {
                        tablero[coordX][coordY] = ' ';
                        coordY--;
                        tablero[coordX][coordY] = 'O';
                    }

                    break;

                case 3:
                    if (coordX == 0) { //Compruebo que la coordenadaX no sea 0, para evitar seguir yendo para arriba
                        System.out.println("You cannot do that...");
                    } else {
                        tablero[coordX][coordY] = ' ';
                        coordY--;
                        tablero[coordX][coordY] = 'O';
                    }

                    break;

                case 4:

                    if ((coordX == 4) || (tablero[coordX + 1][coordY] == 'X')) {

                        System.out.println("You cannot move in that direction!");

                    } else {

                        tablero[coordX][coordY] = ' ';
                        coordX++;
                        tablero[coordX][coordY] = 'O';

                    }

                    break;

                default:
            }

            mostrar(tablero); //Para mostrar el tablero al jugador tras cada ronda. Los métodos pueden invocarse entre ellos.

        } while (coordY != 4); //también: "coordX != 4 || coordY != 4" o "!(coordX == 4 && coordY == 4)"
        /*Esto es porque solo hay una coordenada 4 (Y) que sea válida, que es la última de la salida. 
        Por eso no hace falta especificar la coordenada X en la condición del while. */
        
        System.out.println("You've successfully escaped the labyrinth!");

    }

}
