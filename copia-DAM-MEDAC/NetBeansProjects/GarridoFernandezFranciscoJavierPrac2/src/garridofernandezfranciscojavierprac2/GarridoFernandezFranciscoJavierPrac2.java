/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garridofernandezfranciscojavierprac2;

import java.util.Arrays;

/**
 *
 * @author MEDAC
 */
public class GarridoFernandezFranciscoJavierPrac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1
        String[][] exercise1 = new String[4][4];
        rellenar(exercise1);
        mostrar(exercise1);

        //Ejercicio 2
        int[][] exercise2 = {{1, 2}, {3, 4}};
        boolean checkNumber = isNumber(exercise2);
        System.out.println(isNumber(exercise2));

        //Ejercicio 5
        int[] exercise5 = new int[5];
        for (int i = 0; i < exercise5.length; i++) { //Rellenarlo de números aleatorios
            exercise5[i] = (int) (Math.random() * 9 + 1);
        }
        System.out.println(Arrays.toString(exercise5)); //Mostrar lo que ha guardado por claridad.     
        calcular(exercise5);

        //Ejercicio 8
        int[][] exercise8 = new int[3][5];

        for (int i = 0; i < exercise8.length; i++) {
            for (int j = 0; j < exercise8[i].length; j++) {
                if (i + j % 2 == 0) {
                    exercise8[i][j] = (i + j);
                } else {
                    exercise8[i][j] = -(i + j);
                }
                
                System.out.print(exercise8[i][j]);
            }
            System.out.println("");
        }
        
        //Ejercicio 9
        String exercise9 = "contraseña9";
        boolean validar = esValida(exercise9);
        System.out.println(esValida(exercise9));
        
        //Ejercicio 10
        int [] numbers = {10, 20, 30, 40};
        
        for (int i = 0; i < 1; i++) { //Se repite el desplazamiento "k
            int ultimo = numbers[numbers.length - 1]; //Guarda el último número.
            for (int j = numbers.length - 1; j > 0; j--) { //Desplaza todos los números un hueco a la derecha (empezando desde el final)
                numbers[j] = numbers[j - 1];
            }
            
            numbers[0] = ultimo; //Se pasa el último número al principio (pos 0).
        }

        System.out.println("Numeros movidos: " + Arrays.toString(numbers));
        
        //Ejercicio 7
        int [] ascendente = {1, 2, 3};
        boolean arrayAscendente = esAscendente(ascendente);
        System.out.println(esAscendente(ascendente));
        
        //Ejercicio 6
         String [] ejercicio6 = {"hola", "hola", "caca"};
         System.out.println(numeroRepeticiones(ejercicio6));
         
         //Ejercicio 7
         
        
        
       

    }

    private static void rellenar(String[][] exercise1) {
        for (int i = 0; i < exercise1.length; i++) {
            for (int j = 0; j < exercise1[i].length; j++) {
                if (i == 0 && j == 0) {
                    exercise1[i][j] = "INICIO";
                } else if (i == 3 && j == 3) {
                    exercise1[i][j] = "FIN";
                } else {
                    exercise1[i][j] = "LIBRE";
                }
            }
        }
    }

    private static void mostrar(String[][] exercise1) {
        for (int i = 0; i < exercise1.length; i++) {
            System.out.println(Arrays.toString(exercise1[i]));
        }
    }

    private static boolean isNumber(int[][] exercise2) {
        int randomNumber = (int) (Math.random() * 9 + 1);
        boolean found = false;
        for (int i = 0; i < exercise2.length; i++) {
            for (int j = 0; j < exercise2[i].length; j++) {
                if (exercise2[i][j] == randomNumber) {
                    found = true;
                }
            }
        }

        return found;
    }

    private static void calcular(int[] exercise5) {
        int[] threeNumbers = new int[3];
        int highest = 0;
        int sum = 0;
        int lowest = 10; //Mayor que el número máximo introducido (9) del Array, para que pueda entrar en el "if" de lowest.

        for (int i = 0; i < exercise5.length; i++) {
            sum += exercise5[i];

            if (exercise5[i] > highest) {
                highest = exercise5[i];
                threeNumbers[0] = highest;
            }
            if (exercise5[i] < lowest) {
                lowest = exercise5[i];
                threeNumbers[1] = lowest;
            }
        }

        threeNumbers[2] = sum / exercise5.length;

        System.out.println(Arrays.toString(threeNumbers));

    }

    private static void iniciales(String nombre) {
        nombre.toUpperCase();

    }

    private static boolean esValida(String exercise9) {
        boolean isValid = false;
        char [] array = exercise9.toCharArray();
        int [] numbersArray = new int [20];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = i;
        }
        
        for (int i = 0; i < numbersArray.length; i++) {
            if (array.length > 8) { //No se me ocurre una forma de comprobar los números.
                isValid = true;
            }
        }
        
        return isValid;
        
        
    }

    private static boolean esAscendente(int[] ascendente) {
        boolean esAscendente = false;
        if ((ascendente[2] >= ascendente[1]) && (ascendente[1] >= ascendente[0])) {
            esAscendente = true;
        } else {
            esAscendente = false;
        }
        
        return esAscendente;
    }

    private static int numeroRepeticiones(String[] ejercicio6) {
        
        int count = 0;
        for (int i = 0; i < ejercicio6.length; i++) {
            if (ejercicio6[i].equals("hola")) {
                count++;
            }
        }
        
        return count;
    }

}
