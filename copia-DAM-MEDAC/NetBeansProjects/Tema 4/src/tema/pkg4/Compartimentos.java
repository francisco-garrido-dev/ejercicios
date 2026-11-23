/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Compartimentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        boolean [] cerradura = new boolean [5];
        int [] compartimento = new int [5];
        String password = "4321";
        rellenar(compartimento);
        int resp = 0;
        int intentos = 3;
        String palabra = "";
        boolean salida = false;
        
        //Creamos el switch con un do while porque sabemos que se va a ejecutar una vez al menos
        do {
            System.out.println("1. Acceder caja | 2. Consultar compartimentos | 3. Salir");
            resp = sc.nextInt();
            switch (resp) {
                case 1:
                    do {
                        System.out.println("Introduce contraseña");
                        palabra = sc.next();
                        if (!(palabra.equals(password))) {
                            intentos--;
                        } else {
                            
                            salida = true;
                        }
                        
                    } while (intentos > 0 && !salida);
                    
                    if (intentos > 0) {
                        menu2(compartimento, cerradura);
                    } else {
                        System.out.println("La cagaste Burlancaster.");
                    }
                    
                    break;
                    
                case 2:
                    mostrar(cerradura);
                    break;
                    
                case 3:
                    break;
                    
                default:
                    System.out.println("No has introducido un valor correcto. Te recomiendo aprender a leer.");
            }
            
        } while(resp != 3);
    }

    private static void rellenar(int[] compartimento) {
        for (int i = 0; i < compartimento.length; i++) {
            compartimento[i] = (int) (Math.random() * 5 + 1);
        }
    }

    private static void mostrar(boolean[] cerradura) {
             System.out.println(Arrays.toString(cerradura));
    }

    private static void menu2(int[] compartimento, boolean[] cerradura) {
        Scanner sc = new Scanner(System.in);
        int resp = 0;
        int pos = 0;
        
        do {
            System.out.println("1. Abrir | 2. Cerrar comp | 3. Consultar estado | 4. Salir");
            resp = sc.nextInt();
            
            switch(resp) {
                case 1:
                    do {
                        System.out.println("Introduce pos");
                        pos = sc.nextInt();
                        
                    } while (resp < 0 || resp > 4);
                    if (cerradura[pos]) {
                        System.out.println("No se puede abrir");
                    } else {
                        System.out.println("Se abre");
                        cerradura[pos] = true;
                        System.out.println(compartimento[pos]);
                    }
                    
                    break;
                    
                case 2:
                     do {
                        System.out.println("Introduce pos");
                        pos = sc.nextInt();
                        
                    } while (resp < 0 || resp > 4);
                    if (!cerradura[pos]) {
                        System.out.println("No se puede cerrar");
                    } else {
                        System.out.println("Se cierra");
                        cerradura[pos] = false;
                    }
                    break;
                    
                case 3:
                    mostrar(cerradura);
                    break;
                    
                case 4:
                    break;
                    
                    default:
                        
            }
            
        } while (resp != 4);
    }
    
}
