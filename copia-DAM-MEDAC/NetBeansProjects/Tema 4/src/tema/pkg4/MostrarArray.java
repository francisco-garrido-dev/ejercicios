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
public class MostrarArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a; //No apunta a ninguna dirección en la memoria.
        int[] b = {2, 3, 7, 4, 5};

        a = b; //Con esto, ya apunta a la misma dirección de memoria que b.
        b[0] = 5;

        System.out.println("");
        System.out.println(a[0]); //Esto imprime 5 porque apunta a la misma dirección en la memoria que b.
        
        //Otro ejercicio

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Dame un número: ");
            numbers[i] = sc.nextInt();

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ""); //La i valdrá, como máximo, 2 (perfecto para las celdas, que empiezan en la posición 0).
        }

        System.out.println("");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + "");

        }

    }

}
