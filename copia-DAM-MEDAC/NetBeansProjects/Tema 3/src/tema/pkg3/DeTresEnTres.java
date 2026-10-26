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
public class DeTresEnTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startingPoint = 0;
        int sum = 0;

        while (startingPoint < 99) {
            startingPoint = startingPoint + 3;

            if (startingPoint == 99) { //Para poner un punto al terminar y no una coma.
                System.out.print(startingPoint + ".");
                sum = sum + startingPoint;
            } else {
                System.out.print(startingPoint + ", ");
                sum = sum + startingPoint;

            }
        }
        System.out.println(""); //Sirve para bajar la "suma total" a la siguiente línea.
        System.out.println("Suma total de los números: " + sum);
    }

}
