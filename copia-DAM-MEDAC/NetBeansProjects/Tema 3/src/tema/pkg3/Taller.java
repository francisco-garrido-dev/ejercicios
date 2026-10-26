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
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*A un coche se le pincha la rueda y va al taller. En el programa:
        número de horas en el taller. Si las horas son <= 5, las horas valen 10?;
        pero a partir de 5, esas horas valen 15?. El simple hecho de llevar el coche
        tiene un depósito de 20?. 8 horas serían 5 * 10 + 3 * 15 + 20. No puede meter ni 0
        ni números negativos.
         */

        System.out.print("Bienvenido MEDAC Auto, ¿cuántas horas ha estado tu coche en reparación? ");
        int hours = sc.nextInt();

        if (hours <= 0) {
            System.out.println("La cantidad de horas no puede ser menor o igual que 0.");

        } else {
            if (hours <= 5) {
                System.out.println("El precio es " + (hours * 10 + 20) + " euros.");

            } else {
                int diferencia = hours - 5;
                System.out.println("El precio es " + (5 * 10 + diferencia * 15 + 20) + " euros.");
            }
        }

    }

}
