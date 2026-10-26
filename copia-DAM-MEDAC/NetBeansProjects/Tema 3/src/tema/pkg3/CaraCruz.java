/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg3;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class CaraCruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0; //Opción a elegir del menú
        char letra = 'b'; //Para elegir entre C o X.
        boolean cara = false;
        int random = (int) (Math.random() * 2);

        if (random == 0) { //Si random vale 0, entonces cara = true.
            cara = true;

        } else {
            cara = false; //Si random NO vale 0, entonces cara = false (cruz).
        }

        System.out.println("¿Es 'c'? (debug): " + cara); //Debug para saber qué valor sale.

        System.out.println("¡Bienvenido/a al juego de Cara o Cruz!");
        System.out.println("");

        do {
            System.out.print("¡Pulsa 1 para jugar, 2 para ajustar o 3 para salir del programa!: ");
            option = sc.nextInt();
            System.out.println("");

            switch (option) {

                case 1:
                    do {
                        System.out.println("¿c o x?");
                        letra = sc.next().charAt(0);

                        if (letra == 'c' || letra == 'C' || letra == 'x' || letra == 'X') {

                            if (cara && (letra == 'c' || letra == 'C') || (!cara && (letra == 'x' || letra == 'X'))) { //Si la elección coincide con random, entonces pierdes.
                                System.out.println("¡Pierdes!");

                            } else {
                                System.out.println("¡Ganas!"); //Si la elección NO coincide con random, entonces ganas.
                            }

                        } else {
                            System.out.println("¡Letra no válida!"); //Si no se introducen los caracteres adecuados, se imprime este mensaje.
                        }

                    } while ((letra != 'c' && letra != 'x') && (letra != 'C' && letra != 'X')); //Preguntar entre c o x mientras el jugador siga metiendo un input diferente.

                case 2:
                    System.out.println("Ajustando...");
                    random = (int) (Math.random() * 2); //Si se pulsa 2, se recalcula el valor de random.

                    if (random == 0) { //Se reasigna el valor de verdadero o falso.
                        cara = true;

                    } else {
                        cara = false;
                    }

                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("¡Escoge un número correcto!");
                    System.out.println("");

            }

        } while (option != 3);

    }

}
