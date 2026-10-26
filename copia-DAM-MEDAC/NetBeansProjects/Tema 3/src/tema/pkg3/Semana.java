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
public class Semana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* L, M, X, J, V, S, D. Si pone L, debe imprimir lunes, y así con todo.
        
         */

        System.out.println("Introduce un día de la semana (L, M, X, J, V, S o D)");
        char day = sc.next().charAt(0);

        /*  if (day == 'L' || day == 'l') {
            System.out.println("lunes");
            
        } else if ( day == 'M' || day == 'm') {
            System.out.println("martes");
            
        } else if (day == 'X' || day == 'x') {
            System.out.println("miércoles");
            
        } else if (day == 'J' || day == 'j') {
            System.out.println("jueves");
            
        } else if (day == 'V' || day == 'v') {
            System.out.println("viernes");
            
        } else if (day == 'S' || day == 's') {
            System.out.println("sábado");
            
        } else if (day == 'D' ||day == 'd') {
            System.out.println("domingo");
            
        } else {
            System.out.println("¡Introduce un día válido!");
        }
        
         */
        switch (day) { //Versión con switch. No se puede usar ni float ni double en la versión tradicional de switch.
            case 'L', 'l':
                System.out.println("lunes");
                break; //El "break;" hace que, cuando se cumple la función, pase a la siguiente llave o fragmento de código. 
            //Cumple la función y se va.
                
            case 'M', 'm':
                System.out.println("martes");
                break;
                
            case 'X', 'x': //Se pueden añadir "if" debajo de los case.
                System.out.println("miércoles");
                break;
                
            case 'J', 'j':
                System.out.println("jueves");
                break;
                
            case 'V', 'v':
                System.out.println("viernes");
                break;
                
            case 'S', 's':
                System.out.println("sábado");
                break;
                
            case 'D', 'd':
                System.out.println("domingo");
                break;
                
            default:
                System.out.println("¡Introduce un día válido!");
                break;
        }

    }

}
