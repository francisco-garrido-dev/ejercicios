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
public class EjerciciosCortos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     //Par o impar.
        
     /* System.out.println("Introduce un valor: ");
        
        int input = sc.nextInt();
        
        if (input % 2 == 0) { //El resto de una división entre un número par y dos es siempre 0.
            System.out.println("¡Es par!");
        } else {
            System.out.println("¡Es impar!");
        }

        */
        
     
        //Ejercicio: mayor que
        
        System.out.println("Introduce un valor: ");
        int firstNumb = sc.nextInt();
        
        System.out.println("Introduce otro valor: ");
        int secondNumb = sc.nextInt();
        
        if (firstNumb == secondNumb) {
            System.out.println("Son iguales");
            
        } else if (firstNumb > secondNumb) {
            System.out.println(firstNumb + " es mayor que " + secondNumb);
            
        } else {
            System.out.println(secondNumb + " es mayor que " + firstNumb);
        }
        
        
        
    }
    
}
