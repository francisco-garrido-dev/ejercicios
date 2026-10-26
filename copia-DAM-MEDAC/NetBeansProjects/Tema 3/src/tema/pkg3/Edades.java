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
public class Edades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int adult = 0;
        int count = 0;
        int sum = 0;

        System.out.println("Introduce una edad: ");
        int input = sc.nextInt();

        while (input >= 0) {

            count++;

            if (input >= 18) {
                adult++;
            }

            sum = sum + input;

            System.out.println("Introduce una edad: ");
            input = sc.nextInt();

        }

        System.out.println("Suma de edades: " + sum);
        System.out.println("Media de edades: " + (sum / count));
        System.out.println("Mayores de edad: " + adult);

    }

}
