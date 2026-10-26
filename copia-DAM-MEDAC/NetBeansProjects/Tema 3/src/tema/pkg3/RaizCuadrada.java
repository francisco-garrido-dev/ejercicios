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
public class RaizCuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A no puede dividirse entre 0 y D no puede ser negativo
        System.out.println("Dame un valor: ");
        int firstNumb = sc.nextInt();

        System.out.println("Dame un segundo valor: ");
        int secondNumb = sc.nextInt();

        System.out.println("Dame un tercer valor: ");
        int thirdNumb = sc.nextInt();

        if (firstNumb == 0) {

            System.out.println("No se puede dividir entre 0.");

        } else {

            double discriminante = Math.pow(secondNumb, 2) - 4 * firstNumb * thirdNumb; //formula: d = b^2 - 4 * a * c

            if (discriminante < 0) { //Si discriminante < 0, entonces, se muestra este mensaje y el codigo se detiene.
                System.out.println("El discriminante no puede ser negativo.");

            } else { //Si discriminante > 0, entonces se ejecuta esta parte.

                double raiz = Math.sqrt(discriminante); //Se calcula la raiz cuadrada
                double solucionSuma = (-secondNumb + raiz) / (2 * firstNumb); //Variable secondNumb en negativo para representar "-b" de la formula de la raiz cuadrada.
                double solucionResta = (-secondNumb - raiz) / (2 * firstNumb);
                System.out.println("First result: " + solucionSuma);
                System.out.println("Second result: " + solucionResta);

            }

        }

    }

}

/* Este código no funciona:

int a = 5;

if (a > 2) {
int b = 0;
System.out.println("Hola");

}

System.out.println(a + "..." + b);

Esto es porque la variable "b" se queda dentro del if, por lo que Java no sabrá
a qué variable se refiere el código cuando se invoca a "b" en el último sout.
Para remediarlo, habría que declarar la variable "b" antes de entrar en el if.

*/
