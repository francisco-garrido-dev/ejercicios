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
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int count = 1;

        System.out.println("Dame un número entre 1 y 10:");
        input = sc.nextInt();

        if (input < 1 || input > 10) {

            do {
                System.out.println("Dame un número correcto entre 1 y 10:");
                input = sc.nextInt();

            } while (input < 1 || input > 10); /*Imprimir mensaje mientras esto sea verdad, es decir, mientras el valor
            proporcionado no se encuentre en 1 y 10
            */

        }

        while (count <= 10) {
            System.out.print(input + " * " + count + " = " + (input * count) + " | ");
            count++;
        }

        System.out.println("");
    }

}
