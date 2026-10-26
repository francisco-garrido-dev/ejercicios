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
public class DeMayoraMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int firstNumb = sc.nextInt();

        System.out.println("Introduce un segundo número: ");
        int secondNumb = sc.nextInt();

        System.out.println("Introduce un tercer número: ");
        int thirdNumb = sc.nextInt();

        if (firstNumb > secondNumb && secondNumb > thirdNumb) {
            System.out.println(firstNumb + ">" + secondNumb + ">" + thirdNumb);

        } else if (firstNumb > thirdNumb && thirdNumb > secondNumb) {
            System.out.println(firstNumb + ">" + thirdNumb + ">" + secondNumb);

        } else if (secondNumb > firstNumb && firstNumb > thirdNumb) {

            System.out.println(secondNumb + " > " + firstNumb + " > " + thirdNumb);

        } else if (thirdNumb > firstNumb && firstNumb > secondNumb) {
            System.out.println(thirdNumb + " > " + firstNumb + " > " + secondNumb);

        } else {
            System.out.println(thirdNumb + " > " + secondNumb + " > " + firstNumb);
        }

    }

}
