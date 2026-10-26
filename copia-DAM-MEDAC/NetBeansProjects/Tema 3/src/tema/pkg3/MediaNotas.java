/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg3;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class MediaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, contador = 0, notas = 0;

        System.out.print("Introduce cuántas notas: ");
        int numeroNotas = sc.nextInt();

        if (numeroNotas == 0) {
            System.out.println("No se puede calcular.");
            
        } else {

            while (contador < numeroNotas) {
                System.out.print("Dame una nota: ");
                notas = sc.nextInt();
                suma = suma + notas;
                contador++;
            }
            
            System.out.println("La media es: " + (suma / numeroNotas));
        }

        
    }

}
