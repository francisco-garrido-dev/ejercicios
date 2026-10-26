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
public class NegroBlanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int black = 0;
       int white = 0;
       int count = 0;
       
        System.out.println("Escoge entre 'b' (blanco) o 'n' (negro) hasta diez veces.");
        
        while (count < 10) {
            char input = sc.next().charAt(0);
            
            if (input == 'b' || input == 'B') {
                white++;
                
            } else if (input == 'n' || input == 'N') {
                black++;
                
            } else {
                System.out.println("¡Introduce un valor correcto!");
                count--; //Resta -1 al contador para que el fallo no cuente como un intento más.
            }
            
            count++;
            
        }
        
        if (white > black) {
            System.out.println("La bola es blanca.");
            
        } else if (black < white){
            System.out.println("La bola es negra.");
            
        } else {
            System.out.println("!Empate!");
        }
        
        
    }
    
}
