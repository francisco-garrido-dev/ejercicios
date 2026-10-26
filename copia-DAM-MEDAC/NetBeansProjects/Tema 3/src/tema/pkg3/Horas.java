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
public class Horas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* el usuario va a introducir la hora, el minuto y el segundo.
        Por ejemplo: hora 12, minuto 10 y 22 segundos. El programa va a representarlo
        así "12:10:23" (sumando siempre un segundo más). Hay que contemplar el 59. No hay que contemplar
        cosas fueras de rango ni números negativos.
         */

        System.out.println("Dime una hora: ");
        int hours = sc.nextInt();

        System.out.println("Dime un minuto: ");
        int minutes = sc.nextInt();

        System.out.println("Dime los segundos: ");
        int seconds = sc.nextInt();
        seconds++;

        if (seconds == 60) {
            seconds = 0;
            minutes++;

            if (minutes == 60) { /* es mejor anidar los "if" para que luego pueda hacer cómodamente el "else" al final.
                                    no se puede hacer "else if" porque, en el momento en que el primer if fuera cierto,
                                    no se comprueban los demás.
                                */
                minutes = 0;
                hours++;

            }

            if (hours == 24) {
                hours = 0;
            }
            
            System.out.println(hours + ":" + minutes + ":" + seconds);

        } else {

            System.out.println(hours + ":" + minutes + ":" + seconds);

        }


    }

}
