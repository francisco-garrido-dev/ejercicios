/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garridofernandezfranciscojavierprac2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author beetlepie
 */
public class EjerciciosMétodosString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1
        String[] mensajes = {"Yesterday I installed Windows. I would never use ", "Linux", "or MacOS"};
        String forbiddenWord = "Windows";
        findForbidden(mensajes, forbiddenWord);

    }

    private static void findForbidden(String[] mensajes, String palabraProhibida) {
        String censorship = "*";
        for (int i = 0; i < palabraProhibida.length() - 1; i++) {
            censorship += "*";
        }

        for (int i = 0; i < mensajes.length; i++) {
            if (mensajes[i].toLowerCase().contains(palabraProhibida.toLowerCase())) {
                mensajes[i] = mensajes[i].replace(palabraProhibida, censorship);
            }

        }
        
        System.out.println(Arrays.toString(mensajes));

    
    }

}
