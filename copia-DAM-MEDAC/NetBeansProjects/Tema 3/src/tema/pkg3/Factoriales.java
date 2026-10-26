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
public class Factoriales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¡Dame un número y te calculo el factorial! ");
        int numero = sc.nextInt(); //Pide un número al usuario.
        int factorial = 1; //Para copiar el valor luego
        
        while (numero > 0) {
            factorial = factorial * numero;
            numero--;
        }
        
        System.out.println(factorial);
    }
    
}
