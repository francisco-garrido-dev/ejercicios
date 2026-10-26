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
public class Discoteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Davante quiere que montemos una discoteca. Quieren controlar que hay dos puertas:
        La 1ª: si eres mayor de edad, entras. Si no, hay que decirle que no tiene la edad.
        Si es mayor de edad, hay que comprobar si tiene carné davante (y o n).
        Si escribe cualquier otra letra, se le dice que solo "y o n".
        No vale el String.
         */
        System.out.println("Bienvenido a la discoteca Davante, dime tu edad: ");
        int age = sc.nextInt();
        char card;
        
        if (age < 18) {
            System.out.println("No tienes la edad suficiente.");
        
        } else {
            System.out.println("¿Tienes carné de socio?");
            card = sc.next().charAt(0);
            
            if (card == 'y') { //para los caracteres individuales, se usa (') y no ("), como pasa con los Strings.
                System.out.println("Dentro");
                
            } else if (card == 'n') {
                System.out.println("Fuera");
                
            } else {
                System.out.println("Letra incorrecta.");
            }
            
        }
        
        
    }

}
