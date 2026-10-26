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
public class Redondeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* El usuario introduce un double y quiero que Java
        rendondee a un entero: 3,8 -> 4 o 3,2 -> 3.
        Norma: no se puede usar "Math.round" ni "if".
        */
        
        System.out.println("Dame un número: ");
        Scanner sc = new Scanner (System.in);
        double input = sc.nextDouble();
        int redondeado = (int) (input + 0.5);
        
        System.out.println(redondeado);
        
       
       
       
       
    }
    
}
