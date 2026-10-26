/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forarraysmatrices;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ContadorRepeticiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
         Pide al usuario que ingrese 15 números enteros en un array. Luego, 
        utiliza un ciclo for para contar cuántas veces se repite el número 3 
        (o cualquier otro número elegido) */
        
        System.out.println("Introduce 15 numbers!");
        int input = sc.nextInt();
        int [] numbers = new int [15];
        byte counter = 0;
        
        do {
            numbers[counter] = input;
            counter++;
            System.out.println("You introduced " + counter + "/15 numbers.");
            
            System.out.println("Introduce another one!");
            input = sc.nextInt();
            
            System.out.println("");
            
        } while (counter < numbers.length);
        
        counter = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) {
                counter++;
            }
           
        }
        
        System.out.println("Number 3 is found " + counter + " times.");
        
        
    }
    
}
