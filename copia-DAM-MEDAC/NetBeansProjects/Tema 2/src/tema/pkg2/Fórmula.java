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
public class Fórmula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Y = A * X^2 + B * X + C
        System.out.println("Dame un número entero: ");
        int firstNumb = sc.nextInt();
        
        System.out.println("Dame otro número entero: ");
        int secondNumb = sc.nextInt();

        System.out.println("Dame un tercer número entero: ");
        int thirdNumb = sc.nextInt();
        
        System.out.println("Dame un último número decimal: ");
        double lastNumb = sc.nextDouble();
        
        double result =  (firstNumb * Math.pow(lastNumb, 2)) + (secondNumb * lastNumb) + thirdNumb;
        
        System.out.println(result);
        
    }
    
}
