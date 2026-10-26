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
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Bienvenido al taller de patinetes, introduce los minutos que has estado con el patinete: ");
        int minutos = sc.nextInt();

        if (minutos <= 0) { //Para evitar que el usuario introduzca un valor no valido.
            System.out.println("La cantidad de minutos no puede ser menor o igual que 0.");

        } else {
            if (minutos <= 15) { //Comprueba que se encuentre dentro del primer rango de precios.
                System.out.println("El precio es " + ((minutos * 0.20) + 1.5) + " euros.");

            } else {
                int diferencia = minutos - 15; //Se calcula la diferencia para aplicar la nueva tarifa a partir de los 15 minutos.
                System.out.println("El precio es " + ((15 * 0.2) + (diferencia * 0.15) + 1.5) + " euros.");
            }
        }
    }

}
