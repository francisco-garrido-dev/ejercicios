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
public class TerminadoPendiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //ESTA TAREA ES EXTRAOFICIAL
        Scanner sc = new Scanner(System.in);

        int t = 0, p = 0;
        String respuesta = "";

        while (true) {
            System.out.println("Introduce T (tarea terminada) o P (tarea pendiente). Para salir, introduce TERMINAR:");
            respuesta = String.valueOf(sc.nextLine());
       
             if (respuesta.equals("TERMINAR") || respuesta.equals("terminar")) {
                break;
            }
            
            if (respuesta.equals("T") || respuesta.equals("t")) {
                t++;
            }
            
            if (respuesta.equals("P") || respuesta.equals("p")) {
                p++;
            }
            
        }
        
        
        System.out.println("Tareas terminadas: " + t);
        System.out.println("Tareas pendientes: " + p);
        System.out.println("Total de tareas: " + (t + p));

    }

}
