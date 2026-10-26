/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg4;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class GuessPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Tenemos una contraseña. La contraseña se conoce, no la pone el usuario. Lo que le muestra al usuario son ?x?. Le dice ?introduce la primera posición? 
        y no te deja irte hasta que no se averigüe la letra. Cada intento fallido irá sumando. Con un acierto, se mostrará ?a x x x x?, y así se irá desvelando. */
        char[] password = {'a', 'd', 'm', 'i', 'n'};
        char[] hidden = {'x', 'x', 'x', 'x', 'x'};
        int failed = 0;
        char input;

        for (int i = 0; i < password.length; i++) { //5 vueltas max, que es la cantidad de caracteres que tiene la contraseña.

            do {

                System.out.println("Guess the right letter: ");
                input = sc.next().charAt(0);

                if (input != password[i]) {
                    System.out.println("You failed, try again!");
                    failed++;
                }

            } while (input != password[i]); //Repetir mientras el input no coincida con password[i].

            hidden[i] = password[i]; //Esto irá sustituyendo las 'x' almacenadas en hidden por las letras adecuadas, (solo cuando el input coincide con password[i]).

            for (int count = 0; count < password.length; count++) { //Imprime cada uno de los caracteres de hidden[count].
                System.out.print(hidden[count]);
            }

            System.out.println("");

        }

        System.out.println("Number of failures: " + failed + ".");

    }

}
