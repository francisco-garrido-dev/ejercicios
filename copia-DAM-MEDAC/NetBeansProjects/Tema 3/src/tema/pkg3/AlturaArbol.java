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
public class AlturaArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tallestTree = 0;
        int label = 0;
        int specialLabel = 0;

        System.out.println("Introduce una altura de un árbol: ");
        int treeHeight = sc.nextInt();

        if (treeHeight <= 0) {
            System.out.println("No hay árbol.");
        } else {
            while (treeHeight != -1) {
                
                label++; //Debe ir aquí para contabilizar el primero que se pidió arriba, y luego se sincroniza al empezar de nuevo el bucle.

                if (tallestTree < treeHeight) {
                    tallestTree = treeHeight; //Guarda el valor del árbol más alto.
                    specialLabel = label; //Almacena la etiqueta asociada al árbol más alto.

                }

                System.out.println("Introduce una altura de un árbol: ");
                treeHeight = sc.nextInt();
            }
            
            System.out.println("El árbol más alto es " + tallestTree + "cm de alto, con la etiqueta número " + specialLabel + " asociada.");
        }
        
       /* if (label == 0) { //Estructura alternativa por si se quiere dejar al usuario introducir números y que el programa continúe.
            System.out.println("No hay árbol.");
        } else {
            System.out.println("El árbol más alto es " + tallestTree + "cm de alto, con la etiqueta " + specialLabel + "."); 
        } */
        
        

    }

}
