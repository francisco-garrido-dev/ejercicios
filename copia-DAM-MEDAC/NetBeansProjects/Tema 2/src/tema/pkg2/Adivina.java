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
public class Adivina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /*Normas: no se puede usar "if".
        Se genera un número entero del 0 al 99.
        El usuario introduce el número del 0 al 99.
        ¿El número introducido es mayor? True o false.
        ¿El número introducido es menor? True o false.
        ¿El número " " igual? True o false.
        */
        
        double random = Math.random() * 100;
        int randomNumb = (int) random;
        
        System.out.println("Introduce un número del 0 al 99: ");
        int input = sc.nextInt();
        
        
        
        System.out.println("Número correcto: " + randomNumb);
        System.out.println("El número correcto era mayor: " + (randomNumb > input));
        System.out.println("El número correcto era menor: " + (randomNumb < input));
        System.out.println("El número correcto era igual: " + (randomNumb == input));
        
        
        
    }
    
}
