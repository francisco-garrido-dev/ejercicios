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
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad = 0, entrada5 = 0, entrada10 = 0;

        do {

            System.out.println("Introduce las edades de los que han entrado");
            edad = sc.nextInt();

            if (edad > -1) { //Para evitar que cuente la salida del programa como un input corriente.

                if (edad < 12) {
                    entrada5++; //Contador de entradas de 5 euros.

                } else if (edad < 65) {
                    entrada10++; //Contador de entradas de 10 euros.

                }

            }

        } while (edad != -1);

        System.out.println("La recaudacion total es de " + ((entrada5 * 5) + (entrada10 * 10)) + " euros."); //Numero de entradas multiplicado por el valor de cada una.
        System.out.println("El total de niños es de " + entrada5 + " niño(s).");

    }

}
