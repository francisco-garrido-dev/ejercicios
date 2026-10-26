/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg3;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class NumeroDeCifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Introduce un número entero entre 0 a 99.999
        y tiene que decirte el nº de cifras que tiene el número
         */

        System.out.print("Dime un número entre 0 y 99999: ");
        int number = sc.nextInt();

        if (number < 0 || number > 99999) {
            System.out.println("¡Fuera de rango!");

        } else if (number < 10) {
            System.out.println("1 cifra");

        } else if (number < 100) {
            System.out.println("2 cifras");

        } else if (number < 1000) {
            System.out.println("3 cifras");

        } else if (number < 10000) {
            System.out.println("4 cifras");

        } else {
            System.out.println("5 cifras");
        }

    }

}
