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
public class Calculadora2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el primer valor que calcular: ");
        int firstValue = sc.nextInt();

        System.out.print("Dame el segundo valor que calcular: ");
        int secondValue = sc.nextInt();

        System.out.println("Introduce la operación a realizar:");
        System.out.println("1 = sumar; 2 = restar; 3 = multiplicar; 4 = dividir; 5 = salir del programa");
        int operation = sc.nextInt();

        switch (operation) {
            case 1:
                System.out.println(firstValue + secondValue);
                break;

            case 2:
                System.out.println(firstValue - secondValue);
                break;

            case 3:
                System.out.println(firstValue * secondValue);
                break;

            case 4:
                if (secondValue == 0) {
                    System.out.println("Error, no se puede dividir entre 0.");
                    break;
                    
                } else {
                    double division = (double) firstValue / secondValue;
                    System.out.println(division);
                    break;

                }

            case 5:
                System.out.println("Salida del programa exitosa.");
                break;

            default:
                System.out.println("Error al elegir operación a realizar.");
        }

        /*if (operation <= 0 || operation > 5) {
            System.out.println("Operación no válida.");
        } else {
            
            if (operation == 5) {
                System.out.println("Salida exitosa.");
                
            } else if (operation == 1) {
                System.out.println(firstValue + secondValue);

            } else if (operation == 2) {
                System.out.println(firstValue - secondValue);

            } else if (operation == 3) {
                System.out.println(firstValue * secondValue);

            } else if (operation == 4 && firstValue == 0 || secondValue == 0) {
                System.out.println("No se puede dividir entre 0.");

            } else {
                System.out.println(firstValue / secondValue);
            }

        }

         */
    }

}
