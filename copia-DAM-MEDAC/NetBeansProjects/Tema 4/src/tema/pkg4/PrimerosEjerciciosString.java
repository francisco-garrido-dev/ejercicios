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
public class PrimerosEjerciciosString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Introduce la palabra que quieras. Se tiene que cargar las vocales (da igual que sea mayúsculas o minúsculas) e imprimir solo las consonantes.
        String palabra = sc.next(); //Se puede resolver con un String palabra = palabra.replaceAll("[a e i o u]");
        
        String palabra2 = palabra.replaceAll("[a e i o u]"," ");
        
        System.out.println(palabra2);
        
        esVocal(palabra);

        /*El usuario va introduciendo palabra a palabra, cuando se coloque la palabra ?fin? (mayus o minus), el programa termina. 
        En ese momento, salen todas las palabras que se han ido introduciendo con un espacio en blanco en medio.*/
        System.out.println("Introduce palabras. 'FIN' termina el programa.");
        String word = sc.next();
        String sumOfWords = "";

        while (!(word.equalsIgnoreCase("fin"))) { //Es probable que el usuario ponga FIN de primeras y no se ejecute, por lo que es mejor que un do while.
            sumOfWords = sumOfWords + " " + word;
            System.out.print("Introduce más palabras: ");
            word = sc.next();
            
        }

        System.out.println(sumOfWords);
        
        //-------------------------------------------

        System.out.print("Dame la palabra 1: ");
        String firstWord = sc.next();

        System.out.print("Dame la palabra 2: ");
        String secondWord = sc.next();

        if (firstWord.length() > secondWord.length()) {
            System.out.println("La palabra más larga es " + firstWord + ".");
        } else if (firstWord.length() == secondWord.length()) {
            System.out.println("Son iguales.");

        } else {
            System.out.println("La palabra más larga es " + secondWord + ".");
        }

        //Usuario introduce una palabra, una contraseña. Le damos la primera y última letra, y el usuario debe averiguar la palabra que es.
        System.out.print("Introduce una palabra: ");
        String input = sc.next();

        System.out.println("La primera letra es " + input.charAt(0) + " y la última " + input.charAt(input.length() - 1) + ".");
        System.out.println("Dime la contraseña: ");
        String input2 = sc.next();

        if (input.equals(input2)) {
            System.out.println("Adivinaste la contraseña.");
        } else {
            System.out.println("Fallaste.");
        }

        //Para comparar cuál es mayor alfabéticamente:
        if (input.compareTo(input2) == 0) {
            System.out.println("Son iguales");
        } else if (input.compareTo(input2) < 0) {
            System.out.println("Inferior alfabéticamente");
        } else {
            System.out.println("Son iguales");
        }

    }

    private static void esVocal(String palabra) {
        
    }

}
