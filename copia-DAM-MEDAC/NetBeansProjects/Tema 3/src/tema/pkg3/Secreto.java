/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg3;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Secreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Genera un número secreto del 1 al 100.
        Usuario -> adivina número -> mayor o menor -> termina al poner un negativo o acertando.
         */

        int randomNumber = (int) ((Math.random() * 100) + 1);
        System.out.println("Número secreto: " + randomNumber);

        System.out.println("¡Adivina el número! Pulsa 0 para salir");
        int input = sc.nextInt();

        while (input > 0 && input != randomNumber) { /*El propósito de este while es mantener el bucle ejecutándose mientras se cumplan dos cosas al mismo tiempo:
            que el usuario siga jugando (introduciendo un número positivo) y que todavía no haya acertado el número secreto. Con el operador "||", el bucle se
            mantendría activo mientras CUALQUIERA de las dos opciones fuera verdadera. Con "&&", el bucle continúa únicamente si ambas condiciones se cumplen
            simultáneamente.
            */

            if (input > randomNumber) {

                System.out.println("¡El número es menor que el introducido!");
            } else {
                System.out.println("¡El número es mayor que el introducido!");
            }

            System.out.println("¡Adivina el número!");
            input = sc.nextInt();

        }

        if (input == randomNumber) {
            System.out.println("¡Acertaste el número!");

        } else {
            System.out.println("¡Te rendiste!");
        }

    }

}
