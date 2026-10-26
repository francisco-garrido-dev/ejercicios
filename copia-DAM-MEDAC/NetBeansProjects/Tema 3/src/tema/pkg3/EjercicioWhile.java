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
public class EjercicioWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Tiro un dado (1-20), quiero que cuando salga un 5,
        me diga "has sacado un cinco" y termine el programa. 
        Mientras tanto, va mostrando los números que salen.
         */

 /* int dado = 0;
        int count = 0;

        while (dado != 5) {

            dado = (int) ((Math.random() * 20) + 1);
            System.out.println("Dado es " + dado);
            count++;
        }

        System.out.println("¡Ha salido 5!" + " Ha tomado " + count + " intento(s)..."); */
        int input = 1;
        int pares = 0;
        int impares = 0;

        while (input != 0) {
            System.out.println("Introduce un número: ");
            input = sc.nextInt();

            if (input % 2 == 0) {
                if (input != 0) {
                    System.out.print("¡El número es par!");
                    pares++;
                }

            } else {
                System.out.println("¡El número es impar!");
                impares++;
            }
            
            
        }
        
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

    }

}
