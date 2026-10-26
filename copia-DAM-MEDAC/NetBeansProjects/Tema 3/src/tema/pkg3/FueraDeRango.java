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
public class FueraDeRango {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un valor mínimo: ");
        int min = sc.nextInt();

        System.out.println("Introduce un valor máximo: ");
        int max = sc.nextInt();

        int inRange = 0;

        if (max < min) {

            while (max < min) {
                System.out.println("¡El valor máximo no puede ser inferior que el valor mínimo! Escoge otro valor: ");
                max = sc.nextInt();
            }

        }

        while (inRange > max || inRange < min) {
            System.out.println("Dime un nuevo número: ");
            inRange = sc.nextInt();

            if (inRange > max || inRange < min) {
                System.out.println("¡Fuera de rango!");
            }
        }

        System.out.println("¡Está dentro del rango!");
    }

}
