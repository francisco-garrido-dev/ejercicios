/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasvoluntarias;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class MoveEverything {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] exercise4 = {10, 20, 30, 40};
        System.out.println(Arrays.toString(exercise4));

        System.out.print("How many moves for everything? ");
        int userMovement = sc.nextInt();

        while (userMovement < 0 || userMovement > 99) {
            System.out.print("Input error, introduce a value between 0 and 99: ");
            userMovement = sc.nextInt();

        }

       int n = exercise4.length;
        
        // Optimizamos los movimientos por si el usuario introduce un número mayor que el tamaño del array
        int k = userMovement % exercise4.length; 

        // Repetimos el desplazamiento "k" veces
        for (int j = 0; j < k; j++) {
            
            // 1. Guardamos el último número para que no se pierda
            int ultimo = exercise4[n - 1];
            
            // 2. Desplazamos todos los números un hueco a la derecha (empezando desde el final)
            for (int i = n - 1; i > 0; i--) {
                exercise4[i] = exercise4[i - 1];
            }
            
            // 3. Ponemos el número que estaba al final en la primera posición
            exercise4[0] = ultimo;
        }

        System.out.println("Movido: " + Arrays.toString(exercise4));
        
        //En dos Array:
         int [] exercise5 = {10, 20, 30, 40};
         while (userMovement < 0 || userMovement > 99) {
            System.out.print("Input error, introduce a value between 0 and 99: ");
            userMovement = sc.nextInt();
        }

        // 1. Creamos un array temporal del mismo tamaño
        int[] tempArray = new int[exercise5.length];

        // 2. Calculamos la nueva posición y guardamos el valor real del array
        for (int i = 0; i < exercise5.length; i++) {
            int newPosition = (i + userMovement) % exercise5.length;
            tempArray[newPosition] = exercise5[i]; 
        }

        // 3. Copiamos el array temporal de vuelta al original
        exercise5 = tempArray;

        System.out.println("Movido: " + Arrays.toString(exercise4));
    }
}
    

    

