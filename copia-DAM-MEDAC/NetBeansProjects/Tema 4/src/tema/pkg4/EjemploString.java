/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class EjemploString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String palabra = "hola";
        String palabra2 = "adios";
        String palabra3 = palabra + " " + palabra2;
        
        System.out.println(palabra3);
        
        System.out.println(palabra3.length()); //Esto devuelve el tamaño del Array interno del String.
        System.out.println(palabra3.equals(palabra)); //Se comparan dos palabras para ver si son iguales. En este caso, es falso.
        System.out.println(palabra3.equalsIgnoreCase(palabra)); //Compara con independencia de si son mayúsculas o minúsculas, solo el contenido.
        System.out.println(palabra3.charAt(2)); //Devuelve el valor/letra específica en esa posición.
        System.out.println(palabra3.indexOf("adios")); //Te devuelve la posición del elemento indicado, puede ser un caracter o una palabra entera.
        System.out.println(palabra3.isEmpty()); //Comprueba si está vacío o no.
        System.out.println(palabra3.lastIndexOf(palabra3)); //Última posición de la expresión indicada.
        System.out.println(palabra3.replace('o', 'a')); //Cambia un caracter por otro, pasaría de "hola" a "hala".
        System.out.println(palabra3.substring(0,5)); //Para quedarte con un trozo solamente, en este caso, de 0 a 5.
        System.out.println(palabra3.toUpperCase()); //Lo convierte todo a mayúsculas.
        System.out.println(palabra3.toLowerCase()); //Lo convierte todo a minúsculas.
        System.out.println(palabra3.contains("ola")); //Comprueba si se encuentra la cadena de caracteres especificada dentro de un String. 
        
        System.out.println("");
        
        System.out.print("Introduce una palabra: ");
        
        String palabra4 = sc.next(); //Recoge el input del usuario.
        
        System.out.println(palabra4);
        
        int numero = 1234;
        
        String palabra5 = String.valueOf(numero); //Convierte un número en una cadena de texto.
        System.out.println(palabra5);
        
        System.out.println(palabra5.compareTo("123")); /*Sirve para comparar un String con otro: si los dos son iguales, devuelve un 0. 
        Si devuelve un positivo (no tiene que ser un "1" necesariamente), indica que la cadena es mayor alfabéticamente, y si es negativo, 
        lo contrario (tiene más minúsculas). */
        
        String palabra6 = "aaa";
        String palabra7 = "AAA";
        
        System.out.println(palabra6.compareTo(palabra7)); //Da positivo 32. palabra 7 tiene más palabras mayúsculas que palabra6.
        System.out.println(palabra7.compareTo(palabra6));
        
        char [] array = palabra7.toCharArray(); //Para guardar la palabra en un Array.
        
        System.out.println(Arrays.toString(array));
        
        
    }
    
}
