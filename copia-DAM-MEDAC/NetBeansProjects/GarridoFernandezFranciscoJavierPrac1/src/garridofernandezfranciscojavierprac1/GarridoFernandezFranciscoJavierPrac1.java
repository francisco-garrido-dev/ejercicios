/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garridofernandezfranciscojavierprac1;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class GarridoFernandezFranciscoJavierPrac1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumaNotas = 0;
        double notaAlta = 0;
        double input = 1;
        int contador = 0;

        do {
            System.out.println("Introduce las notas. (Si desea salir del programa, introduzca un número negativo)");
            input = sc.nextDouble();

            if (input > 10) { //Comprueba que las notas no sean mayores que 10.
                System.out.println("¡La nota no puede ser mayor que 10!");
                
            } else if (input > 0 && input <= 10) { //Si se encuentra dentro den rango, entonces entra en este codigo.

                if (input > notaAlta) { 
                    notaAlta = input; //Guarda el valor de la nota mas alta.
                }

                sumaNotas = sumaNotas + input;

                contador++;
            }

        } while (input >= 0);

        System.out.println("Número total de alumnos evaluados: " + contador);
        System.out.println("Nota media de la clase: " + (1.0 * sumaNotas / contador));
        System.out.println("Nota más alta de la clase: " + notaAlta * 1.0);
    }

}
