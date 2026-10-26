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
public class Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Los Array estáticos permiten guardar muchos valores en una sola variable. El tamaño lo definimos nosotros.
        Adicionalmente, se debe almacenar el mismo tipo de variable. La primera variable se guarda siempre en la 
        posición 0. Si guardamos las edades de 30 personas, la edad del primero estaría en la posición ', y la del
        último, en la posición 29*/

 /*Estructura 1: tipo de variable + corchete + nombre de la variable = new int [0];
        La estructura 1 asigna el valor 0 a todas las posiciones en un principio.
        Se usa si no se saben los valores que se van a guardar.
         */
        int[] arrayEdades = new int[30]; //Esta estructura llena las 30 posiciones (0-29) con ceros.
        
        /* Estructura 2: int [] array = {7, 5, 3, 7, 14};
        Esta se usa si ya se conocen los valores que se van a guardar de antemano.
        */

        System.out.print(arrayEdades);
        /*Esto imprime una dirección de memoria, que es lo que sería la variable
        arrayEdades, en realidad. Si se quiere ver las posiciones, habría que poner lo siguiente:
         */

        System.out.println(arrayEdades[20]);
        /* Sale 0 porque todos los huecos se rellenaron con el mismo. Si se pusiera
        [30], daría error porque no existe esa posición.
         */

        arrayEdades[12] = 24; //[12] es la posición y 24 es el valor que se guarda en esa posición.

        for (int i = 0; i < 30; i++) {
            System.out.print(arrayEdades[i] + " ");
        }

        int[] arrayNum = new int[5];

        for (int i = 0; i < arrayNum.length; i++) { /*Con arrayNum.length te aseguras de que no te salgas del número de celdas. 
                                                    Te devuelve el tamaño del Array. */
            System.out.print("Introduce un num en la pos: " + i);
            arrayNum[i] = sc.nextInt(); //Va a ir guardando los valores que introduzca el usuario en la posición indicada por "i".

        }
    }

}
