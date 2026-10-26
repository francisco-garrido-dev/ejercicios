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
public class CírculoMathDado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Inroduce un radio: ");
        final double pi = 3.14; /*Se le pone un "final" porque es un valor constante
                                  no se busca que cambie a lo largo del programa, así que
                                  de esta forma se previenen cambios futuros */
        
        double radio = sc.nextDouble();
        double area = pi * (radio * radio);
        double perimetro = 2 * pi * radio;
        
        System.out.println("Área: " + area);
        /*También se puede hacer System.out.println("Área: " + (Math.PI * Math.pow(radio, 2)));
          Math.PI = pone el 3.14 automáticamente; Math.pow = potencia; número + el número al que se eleva
          "Math" es una clase disponible en el código que no necesita implementación.
          "Math" tiene varios métodos, entre ellos, "pow".
        
           También se puede hacer la raíz cuadrada de algo con "Math.sqrt(valor)" 
           Por otro lado, "Math.random()" da valores de 0 a 1 con decimales sin 
           incluir el 1. Si se quiere hacer entre 0 a 10, se puede hacer lo siguiente:
           "Math.Random() * 10", lo que incluiría todos los números decimales menos el 10
        
           Si quisiéramos hacer un dado y que salga un número aleatorio, se puede usar "Math.Random() * valor"
           y luego castearlo para que se guarde un valor entero, sin decimales. Como un dado empieza siempre por uno,
           se debe hacer la siguiente fórmula:
        
           double random = Math.random() * 6; (6 es el máximo de números que tendrá el dado)
           int dado = (int) (random + 1);
           sout(dado);
           
           alternativa: int dado = (int) (Math.random() * 6 + 1);
        
        */
        
        System.out.println("Perímetro: " + perimetro);
        
    }
    
}
