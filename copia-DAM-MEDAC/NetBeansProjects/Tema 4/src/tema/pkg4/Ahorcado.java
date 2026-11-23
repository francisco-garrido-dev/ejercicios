/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author beetlepie
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        char letra;
        int intentos = 0, logros = 0;

        System.out.println("Introduce palabra: ");

        int longitud = sc.nextInt();
        char[] guiones = new char[longitud];

        char[] palabra = new char[longitud];

        for (int i = 0; i < guiones.length; i++) { //Se define el número máximo de guiones.
            guiones[i] = '_';

        }

        for (int i = 0; i < palabra.length; i++) { //Se ha escrito la palabra.
            System.out.print("Introduce posicion" + (i + 1));
            palabra[i] = sc.next().charAt(0);

        }

        do {
            System.out.print("Adivina la palabra: ");

            for (int i = 0; i < palabra.length; i++) { //Se imprimen los guiones
                System.out.print(guiones[i] + " ");

            }

            System.out.print("Introduce una letra: ");
            letra = sc.next().charAt(0);

            for (int i = 0; i < palabra.length; i++) {

                if (letra == palabra[i]) { //Sustituye cada guion por una nueva letra.
                    guiones[i] = letra;

                } else {
                    System.out.print("Has fallado. Tienes un intento menos.");
                    intentos++;

                }

            }

        } while (intentos != 5 && Arrays.equals(palabra, guiones));

        if (intentos == 5) {
            System.out.println("Pierdes");
        } else {
            System.out.println("Ganas");
        }
    }
    
}
