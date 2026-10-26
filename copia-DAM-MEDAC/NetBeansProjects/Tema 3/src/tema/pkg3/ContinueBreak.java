/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg3;

/**
 *
 * @author MEDAC
 */
public class ContinueBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if ( i == 2) {
                break; //Rompe el bucle y se va a la llave que termina el bucle.
            }
            
            System.out.println("Hola");
        }
        
        System.out.println("-----------------------------------");
        
       for (int i = 0; i < 5; i++) {
            if ( i == 2) {
                continue; //Pasa de lo que hay debajo y se va a la siguiente iteración (i++).
            }
            
            System.out.println("Hola " + i);
        } 
    }
    
}
