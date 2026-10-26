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
public class Character {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        char letra = 'a';
        System.out.println("La leña es: " + letra);
        
        */
        
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Quieres continuar? y o n" );
        char respuesta = sc.next().charAt(0); //sc.next()coge una palabra entera, mientras que .charAt(0) 
                                              //coge el primer caracter, indicado entre paréntesis (0).
        
        System.out.println("La respuesta es: " + respuesta);
        
        boolean dato = true;
        
        System.out.println("El dato es: " + dato);
    }
    
}
