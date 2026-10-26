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
public class HundirFlota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        El agua sería un guion medio (-). Tablero 10x10 con guion medio. Hundir la flota horizontal, no se juega en vertical.
        Pequeño: 1; mediano (destructor): 3; grande (portaviones) = 5.
         */
        char[][] tablero = new char[10][10];

        //Rellenar con guiones medios. 
        for (int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], '-');
        }

        //Mostrar guiones
        
        /*
        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }

            System.out.println("");
        }
        
        */

        //Colocar el portaviones.
        int fila = 0, col = 0;

        fila = (int) (Math.random() * 10);
        col = (int) (Math.random() * 6); //Tamaño máximo del destructor.

        for (int i = 0; i < 5; i++) {
            tablero[fila][col + i] = 'P';
            /*Esto solo coloca una por sí sola, así que se necesita un for para rellenar el resto.
                        La fila aquí es invariable, se van rellenando las columnas [col + i].
             */
        }

        //Colocar el destructor. Condiciones: que no se coloque en la posición del portaviones y...
        do {
            fila = (int) (Math.random() * 10);
            col = (int) (Math.random() * 8);

        } while (tablero[fila][col] == 'P' || tablero[fila][col + 2] == 'P'); //Repetir la fórmula de arriba mientras se encuentre una P en una posición o en la otra.
        
        tablero[fila][col] = 'D';
        
        do {
            fila = (int) (Math.random() * 10);
            col = (int) (Math.random() * 10);

        } while (tablero[fila][col] != '-'); //Hacer la fórmula de arriba mientras fila y columna no sean "-", es decir, mientras estén ocupadas por D o P.
        
        tablero[fila][col] = 'S';
        
       for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }

            System.out.println("");
        }
        
        
    }

}
