/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg4;

import java.util.Arrays;

/**
 *
 * @author MEDAC
 */
public class ArrayParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se generan diez números de forma aleatoria del 0 al 100. Dos arrays: uno para impares y otro para pares.

        int[] numeros = new int[10]; //Array base que crea las diez posiciones máximas.
        int[] arrayPares, arrayImpares;
        int contPares = 0, contImpares = 0, indicePares = 0, indiceImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101); //Se almacenan los 10 números sin discriminar en el Array numeros[i].
        }

        for (int i = 0; i < numeros.length; i++) { //Se imprimen los 10 números por claridad.
            System.out.print(numeros[i] + " ");
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contPares++; //Se cuentan los pares.
            } else {
                contImpares++; //Se cuentan los impares.
            }
        }

        arrayPares = new int[contPares]; //Se crea el Array según el número de pares máximo que hay.
        arrayImpares = new int[contImpares];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                arrayPares[indicePares] = numeros[i]; //Se añade el número par de numeros[indicePares] a arrayPares[i].
                indicePares++;
            } else {
                arrayImpares[indiceImpares] = numeros[i]; /*No puede ser arrayImpares[i] porque dicho contador no discrimina
                                                           entre par o impar, e irá guardando todo en posiciones incorrectas.
                                                           */
                indiceImpares++;
            }
        }
        
        System.out.println("");
        Arrays.sort(arrayPares);  //Ordena los números de menor a mayor.
        System.out.println("Números pares: ");
        System.out.println(Arrays.toString(arrayPares));
        
         /*
        La estructura "System.out.println(Arrays.toString(arrayPares));" es una alternativa al 
        siguiente bucle for:
        
        for (int i = 0; i < arrayPares.length; i++) {
            System.out.println(arrayPares[i]);
        }
        
        */
        
        System.out.println("Números impares: ");
        Arrays.sort(arrayImpares);
        System.out.println(Arrays.toString(arrayImpares));
        
        /*
        La estructura "System.out.println(Arrays.toString(arrayImpares));" es una alternativa al 
        siguiente bucle for:
        
         for (int i = 0; i < arrayImpares.length; i++) {
            System.out.println(arrayImpares[i]);
        }
           
        */
    }

}
