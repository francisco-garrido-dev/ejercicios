/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg2;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class CalculadoraScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce el primer valor: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Introduce el segundo valor: ");
        double num2 = sc.nextDouble();
        
        System.out.println("La suma es: " + (num1 + num2));
        System.out.println("La resta es: " + (num1 - num2));
        System.out.println("La multiplicación es: " + (num1 * num2));
        System.out.println("La división es: " + (num1 / num2));
        /* */
        
    }
    
}
