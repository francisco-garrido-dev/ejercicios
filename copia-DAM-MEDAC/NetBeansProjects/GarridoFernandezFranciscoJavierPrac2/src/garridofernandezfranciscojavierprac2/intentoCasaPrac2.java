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
public class intentoCasaPrac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1
        String[][] ejercicio1 = new String[4][4];
        rellenar(ejercicio1);
        mostrar(ejercicio1);

        //Ejercicio 2
        int[][] ejercicio2 = {{1, 2}, {3, 4}};
        System.out.println(isFound(ejercicio2));

        //Ejercicio 3
        System.out.println("Dime una palabra y te digo si es palíndroma o no");
        String usrWord = sc.nextLine();
        System.out.println(esPalindromo(usrWord));

        //Ejercicio 4
        System.out.println("Introduce tu nombre completo y te digo sus iniciales: ");
        String fullName = sc.nextLine();
        iniciales(fullName);
        System.out.println("");

        //Ejercicio 5
        int[] ejercicio5 = new int[5];
        for (int i = 0; i < ejercicio5.length; i++) {
            ejercicio5[i] = (int) (Math.random() * 9 + 1);
        }
        System.out.println("Debug: " + Arrays.toString(ejercicio5));
        calc(ejercicio5);

        //Ejercicio 6
        String cadena = "mejor";
        String[] ejercicio6 = {"mejor", "ejemplo", "mejor"};
        System.out.println(isRepeated(ejercicio6, cadena));

        //Ejercicio 7
        int[] ejercicio7 = {1, 2, 3, 4, 5};
        System.out.println(esAscendente(ejercicio7));

        //Ejercicio 8
        int[][] ejercicio8 = new int[3][5];
        for (int i = 0; i < ejercicio8.length; i++) {
            for (int j = 0; j < ejercicio8[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    ejercicio8[i][j] = i + j;
                } else {
                    ejercicio8[i][j] = -(i + j);
                }

                System.out.print(ejercicio8[i][j] + " ");
            }
            System.out.println("");
        }

        //Ejercicio 9
        String ejerccio9 = "samplepassword1234567";
        System.out.println(meetsReq(ejerccio9));

        //Ejercicio 10
        int[] ejercicio10 = {20, 30, 40, 50};
        desplazar(ejercicio10);
    }

    private static void rellenar(String[][] ejercicio1) {
        for (int i = 0; i < ejercicio1.length; i++) {
            for (int j = 0; j < ejercicio1[i].length; j++) {
                if (i == 0 && j == 0) {
                    ejercicio1[0][0] = "INICIO ";
                } else if ((i == ejercicio1.length - 1) && (j == ejercicio1.length - 1)) {
                    ejercicio1[ejercicio1.length - 1][ejercicio1.length - 1] = " FIN";
                } else {
                    ejercicio1[i][j] = " LIBRE ";

                }
            }
        }
    }

    private static void mostrar(String[][] ejercicio1) {
        for (int i = 0; i < ejercicio1.length; i++) {
            for (int j = 0; j < ejercicio1[i].length; j++) {
                System.out.print(ejercicio1[i][j]);
            }

            System.out.println("");
        }
    }

    private static boolean esPalindromo(String usrWord) {

        char[] converted = usrWord.replace(" ", "").toLowerCase().toCharArray();
        int coincidences = 0;

        for (int i = 0; i < converted.length; i++) {
            if (converted[i] == converted[converted.length - 1 - i]) {
                coincidences++;

            }

        }

        return coincidences == converted.length;

    }

    private static boolean isFound(int[][] ejercicio2) {
        byte randomNumb = (byte) (Math.random() * 9 + 1);
        boolean isFound = false;
        for (int i = 0; i < ejercicio2.length; i++) {
            for (int j = 0; j < ejercicio2.length; j++) {
                if (randomNumb == ejercicio2[i][j]) {
                    isFound = true;
                }
            }
        }

        return isFound;
    }

    private static void iniciales(String fullName) {
        String initial = "";

        for (int i = 0; i < fullName.length(); i++) {
            if (i == 0) {
                initial = initial + fullName.charAt(0) + ". ";
            } else if (fullName.charAt(i) == ' ') {
                initial = initial + fullName.charAt(i + 1) + ". ";

            }

        }

        System.out.print(initial.toUpperCase());
    }

    private static void calc(int[] ejercicio5) {
        int[] filteredArray = new int[3];
        byte highest = 0, lowest = 10;
        int average = 0;

        for (int i = 0; i < ejercicio5.length; i++) {
            if (ejercicio5[i] > highest) {
                filteredArray[0] = (byte) ejercicio5[i];
            }

            if (ejercicio5[i] < lowest) {
                filteredArray[2] = (byte) ejercicio5[i];
            }

            average += ejercicio5[i];
        }

        filteredArray[1] = average / ejercicio5.length;

        System.out.println(Arrays.toString(filteredArray));
    }

    private static int isRepeated(String[] ejercicio6, String cadena) {
        int count = 0;
        for (int i = 0; i < ejercicio6.length; i++) {
            if (ejercicio6[i].equals(cadena)) {
                count++;
            }
        }
        return count;
    }

    private static boolean esAscendente(int[] ejercicio7) {
        for (int i = 1; i < ejercicio7.length; i++) {
            if (ejercicio7[i] < ejercicio7[i - 1]) {
                return false;
            }

        }

        return true;
    }

    private static boolean meetsReq(String ejerccio9) {
        if (ejerccio9.length() < 8) {
            return false;
        }

        for (int i = 0; i < ejerccio9.length(); i++) {
            char c = ejerccio9.charAt(i);
            if (c >= '0' && c <= '9') {
                return true;
            }
        }

        return false;
    }

    private static void desplazar(int[] ejercicio10) {
        int lastPos = ejercicio10[ejercicio10.length - 1]; //Se guarda la última posición en una variable.

        for (int i = ejercicio10.length - 1; i > 0; i--) { //La condición es mayor a 0 porque esa posición no interesa tocarla realmente, basta con llegar a 1.
            ejercicio10[i] = ejercicio10[i - 1];

        }

        ejercicio10[0] = lastPos; //Se pone la variable guardada (lastPos) en la posición 0.

        System.out.println(Arrays.toString(ejercicio10));

    }

}
