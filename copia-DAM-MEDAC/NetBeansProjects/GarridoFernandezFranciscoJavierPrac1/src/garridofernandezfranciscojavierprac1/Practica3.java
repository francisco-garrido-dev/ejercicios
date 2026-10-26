/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garridofernandezfranciscojavierprac1;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ronda = 0;
        char letra = 'p'; //Para elegir entre P o T.
        boolean papel = false;
        int random = (int) (Math.random() * 2);

        if (random == 0) { //Si random vale 0, entonces papel = true.
            papel = true;

        } else {
            papel = false; //Si random NO vale 0, entonces papel = false (es decir, tijera).
        }

        System.out.println("¿Es 'p'? (DEBUG): " + papel); //Debug para saber el valor que guarda la máquina.

        System.out.println("Bienvenido al juego de papel o tijera! Introduce 'p' (papel) o 't' (tijera): ");
        letra = sc.next().charAt(0);

        do {

            if ((letra == 'p' || letra == 'P') && (letra == 't' || letra == 'T')) { //Comprueba primero que el input sea adecuado.

                do { //Repite en bucle hasta introducir un input adecuado.
                    System.out.println("Introduce un valor correcto");
                    letra = sc.next().charAt(0);

                } while ((letra != 't' && letra != 'T') && (letra != 'p' && letra != 'P')); //No deja de repetirse hasta que el input sea adecuado.

            } else { //Si el input es adecuado, entonces se ejecuta este código.

                    if (papel && (letra == 'p' || letra == 'P') || (!papel && (letra == 't' || letra == 'T'))) { /*Si el input del usuario coincide 
                                                                                                                   con el de la maquina, el jugador gana.
                                                                                                                    */
                        System.out.println("Ganas la partida.");

                    } else {
                        System.out.println("Gana la maquina.");
                    }

                

                ronda++; //Suma +1 a la ronda para terminar el programa.

            }

        } while (ronda != 1);

    }

}
