/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg4;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class EjemploMetodoFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5, b = 8;
        sumar(a, b); //Declaramos esta línea tal cual, y sale la bombilla para crear el método abajo.

        System.out.println("Introduce base");
        int base = sc.nextInt();

        System.out.println("Introduce exponente");
        int exp = sc.nextInt();

        double resp = potencia(base, exp);
        System.out.println(resp);

        int num = 0;

        do {
            System.out.println("Introduce un numero y te calculo el factorial");
            num = sc.nextInt();

        } while (!(num > 0 && num < 10));

        System.out.println(factorial(num));

        //El usuario te da un carácter. Mayúscula o minúscula, te dice si es vocal o consonante. La función se llamará esVocal.
        System.out.println("Dime una letra y te digo si es una vocal.");
        char letra = sc.next().charAt(0);
        
        if (esVocal(letra) == true) {
            System.out.println("Es vocal.");
    } else {
            System.out.println("No es vocal.");
        }
    }

    private static void sumar(int p, int q) {
        /* En el método main le estoy indicando que voy  a sumar dos parámetros. Me los llevo al método y los puede sumar. 
                                                 Lo que se hace en el método, en el otro mundo, es un molde o fórmula genérica. 
                                                 Por eso, las variables que se encuentren dentro del parámetro se pueden llamar como quieran. */
        System.out.println("La suma es " + (p + q) + ".");
    }

    private static double potencia(int base, int exp) {
        /*Esto es una función (no tiene "void"). Las funciones siempre devuelven un valor, además de hacer cosas. 
                                                          Los métodos hacen cosas, pero no devuelven ningún valor. 
                                                          El tipo de variable especificada entre "static" y el nombre de la función
                                                          debe ser coincidir con el valor que se devolverá con "return"*/
        return Math.pow(base, exp);

    }

    private static int factorial(int num) {
        int resultado = 1;
        for (int i = num; i > 0; i--) {
            resultado = resultado * i;
        }

        return resultado;

    }

    private static boolean esVocal(char letra) {
        boolean vocal = false;
        letra = Character.toLowerCase(letra); //Te convierte las mayúsucas en minúsculas. Letra guarda el nuevo valor.
        
        switch (letra) {
            case 'a':
                vocal = true;
                break;
                
                case 'e':
                vocal = true;
                break;
                
                case 'i':
                vocal = true;
                break;
                
                case 'o':
                vocal = true;
                break;
                
                case 'u':
                vocal = true;
                break;
                
                default:
                    vocal = false;

        }
        
        return vocal;
    }

}
