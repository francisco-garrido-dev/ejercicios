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
public class EjemploFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        
        for (int base = 1; base <= 10; base++) { //Se incrementa "base" en + 1 al terminar el bucle.
            for (int i = 1; i <= 10; i++) { //i es el número por el que se multiplica, que va aumentando en uno.
            System.out.print(base + " * " + i + " = " + (base * i) + " | ");
        }
            System.out.println("");
            
        }
        
    }
    
}
