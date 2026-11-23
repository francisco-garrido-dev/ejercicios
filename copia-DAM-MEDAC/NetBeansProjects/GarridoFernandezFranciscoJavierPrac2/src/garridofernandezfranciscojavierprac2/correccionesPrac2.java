/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garridofernandezfranciscojavierprac2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class correccionesPrac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1
        
        String [][] matriz = new String [4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            Arrays.fill(matriz[i], "LIBRE");
        }
        
        matriz[0][0] = "INICIO";
        matriz[3][3] = "FIN";
        //Falta el método para mostrar
        
        //Ejercicio 2
        int [] [] matrix = {{1,1}, {2,2}};
        System.out.println(encontrar(matrix));
        
        //Ejercicio 5
        int [] array5 = new int [5];
        int [] array2 = new int [3];
        int vmax = 0, vmin = 0, media = 0;
        
        for (int i = 0; i < array2.length; i++) {
            if (array5[i] > vmax) {
                vmax = array5[i];
            } else if (array5[i] < vmin) {
                vmin = array5[i];
            }
            
            media = media + array5[i];
        }
        
        array2[0] = vmax;
        array2[1] = vmin;
        array2[2] = media / 5;
        
        /*
        
        //Ejercicio 9, revisar en casa la función
        String palabra = sc.next();
        System.out.println(validar(palabra));
        
        //Ejercicio 4, revisar en casa
        String nombre = "juan gomez perez";
        iniciales(nombre);
        
        */
        
        //Ejercicio 3
        String palabra = sc.next();
        System.out.println(palindromo(palabra));
        
        //Ejercicio 10
        int [] array10 = {7, 5, 4, 9};
        int ultimo = array10[array10.length - 1];
        
        
        
        
        
        
      
    }

    private static boolean encontrar(int[][] matrix) {
        int rand = (int) (Math.random () * 10);
        boolean respuesta = false;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == rand) {
                    respuesta = true;
                }
            }
        }
        
        return respuesta;
    }
/*
    private static boolean validar(String palabra) {
        
         A revisar código que ha puesto Kiko en casa:
        
       int longitud = palabra.length();
       boolean estado = false;
       char letra = 'c';
       for (int i = 0; i < longitud; i++) {
           letra = palabra.charAt(i);
           
           if (letra(i) <= 9) {
               estado = true;
           }
       }
       
       return estado;
    } 
    
}
*/
    
    /*

    private static void iniciales(String nombre) {
     char letra2=nombre.charAt(0);
    Character.toLowerCase(letra2);
    String palabra3=letra2+".";
        char letra;
        for (int i = 0; i < nombre.length(); i++) {
            letra = nombre.charAt(i);
            if (letra2 == '') {
            palabra3 = palabra3(nombre.charAt( i + 1).toUppercase() + ".";
        }
        }
        
        System.out.println(palabra);
    }
*/

    private static boolean palindromo(String palabra) {
        int indIzq = 0;
        int indDer = palabra.length() - 1;
        
        while (indIzq < indDer) { //Que el indice izquierdo no sea menor que el derecho.
            if (palabra.charAt(indIzq) != palabra.charAt(indDer)) {
            return false;
        }
            indIzq++;
            indDer--;
            
        }
        
        return true;
    }
    
}
