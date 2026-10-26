/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garridofernandezfranciscojavierprac1;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calzado = 0, ropa = 0, accesorios = 0;
        char item = 'c';
        int prendasValidas = 0;

        do {
            System.out.println("Introduce el tipo de producto, pulsa 'C' (calzado) 'R' (ropa) o 'A' para accesorios. Pulsa 'F' para terminar la compra.");
            item = sc.next().charAt(0);

            switch (item) {
                case 'C': case 'c':
                    calzado = calzado + 5; /* 5 es el valor de cada calzado.
                                              El programa va sumando 5 euros por
                                              cada calzado introducido. */
                    prendasValidas++;                        
                    break;
                    
                case 'R': case 'r':
                    ropa = ropa + 10;
                    prendasValidas++;
                    break;
                    
                case 'A': case 'a':
                    accesorios = accesorios + 2;
                    prendasValidas++;
                    break;
                    
                default:
                    if (item != 'F' && item != 'f') { //Para evitar que imprima "Categoría no valida" al salir del programa pulsando F.
                        
                        System.out.println("Categoria no valida");
                        
                        break;
                        
                    }   
            }

        } while (item != 'f' && item != 'F');

        System.out.println("El precio total es: " + (calzado + ropa + accesorios) + " euros."); //Suma total de precios.
        System.out.println("Prendas válidas: " + prendasValidas + ".");

    }

}
