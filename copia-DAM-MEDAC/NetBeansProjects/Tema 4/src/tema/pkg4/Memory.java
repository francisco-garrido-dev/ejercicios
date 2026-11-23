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
public class Memory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Matriz de 2x4 con strings. Los elementos dentro están duplicados. La primera parte del ejercicio es:
        crea un método que se llame "rellenar" que meta los valores como se han dado. Crea un método para mostrar
        por consola el resultado de la matriz.
         */
        
        /*Crea un Array unidimensional de tamaño 5 que se rellene con valores aleatorios del 1 al 9.
        Después, introduce un nuevo número y desplaza todos los demás a la derecha. Anotación: hay que crear
        un segundo Array porque no se puede ampliar el tamaño del primero.
        */
        
        int [] base = new int [5];   
        fillRandomly(base);
        System.out.println(Arrays.toString(base));
        byte aux = 0;
        
        int [] extended = new int [base.length + 1];
        
        for (int i = 0; i < extended.length; i++) {
            if (i == 0) {
                extended[i] = (int) (Math.random() * 9 + 1);
            } else {
                extended[i] = base[aux];
                aux++;
            }
        }
        
        System.out.println(Arrays.toString(extended));
        
        

        String[][] animals = new String[4][2];

        rellenar(animals);
        mostrar(animals);

        String[][] tableroVacio = new String[4][2];
        guiones(tableroVacio);
        mostrar(tableroVacio);
        System.out.println(comprobar(animals));

        //Vas pidiendo coordenadas, y si coinciden, se van rellenando los valores de la matriz vacía.
        jugar(animals, tableroVacio); //Se necesitarán ambos tableros en el nuevo método.
        

    }

    private static void rellenar(String[][] animals) {
        animals[0][0] = "gato";
        animals[0][1] = "perro";
        animals[1][0] = "serpiente";
        animals[1][1] = "vaca";
        animals[2][0] = "perro";
        animals[2][1] = "gato";
        animals[3][0] = "vaca";
        animals[3][1] = "serpiente";

    }

    private static void mostrar(String[][] animals) {

        for (int i = 0; i < animals.length; i++) {
            System.out.println((Arrays.toString(animals[i])));
        }

        /*
        Alternativa:
        
        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                System.out.print(animals[i][j] + " ");
            }

            System.out.println("");
        }
         */
    }

    private static void guiones(String[][] tableroVacio) {
        for (int i = 0; i < tableroVacio.length; i++) {
            Arrays.fill(tableroVacio[i], " _ _ _ _ ");
        }

    }

    private static void jugar(String[][] animals, String[][] tableroVacio) {
        Scanner sc = new Scanner(System.in);
        int aciertos = 0;

        do {

            System.out.print("Dame una coordenada X: ");
            int coordX = sc.nextInt();
            System.out.print("Dame una coordenada Y: ");
            int coordY = sc.nextInt();

            System.out.print("Dame la otra coordenada X: ");
            int coordX2 = sc.nextInt();

            System.out.print("Dame la otra coordenada Y: ");
            int coordY2 = sc.nextInt();

            for (int i = 0; i < animals.length; i++) {

                if (animals[coordX][coordY].equals(animals[coordX2][coordY2])) {
                    tableroVacio[coordX][coordY] = animals[coordX][coordY];
                    tableroVacio[coordX2][coordY2] = animals[coordX2][coordY2];
                    animals[coordX][coordY] = "empty"; //Para que el usuario no sume aciertos con el mismo resultado todo el rato.
                    aciertos++;

                }

            }

            mostrar(tableroVacio);

        } while (aciertos < 4);
        
        System.out.println("Ganaste");
        
        

    }

    private static boolean comprobar(String[][] animals) {
        boolean answer = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una palabra y te digo si está en el tablero: ");
        String isWord = sc.next();
        
        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                if (animals[i][j].equals(isWord)) {
                    answer = true;
                }
            }
        }
        
        return answer;
          
    }

    private static void fillRandomly(int[] base) {
        for (int i = 0; i < base.length; i++) {
            base[i] = (int) (Math.random() * 9 + 1);
        }
        
    }

}
