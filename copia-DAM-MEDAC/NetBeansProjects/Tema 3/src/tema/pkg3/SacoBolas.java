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
public class SacoBolas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalBalls = 0, numberOfBalls = 0, machineNumbOfBalls = (int) (Math.random() * 3 + 1);

        do {
            System.out.println("¡Introduce un número de bolas mayor a 6!");
            totalBalls = sc.nextInt();

        } while (totalBalls < 6); //Repetir mientras totalBalls sea inferior a 6.

        do {
            do {
                System.out.println("¿Cuántas bolas quieres sacar del saco? (mínimo 1 y máximo 3)");
                numberOfBalls = sc.nextInt();

            } while (numberOfBalls > 3 || numberOfBalls < 1); //Repetir mientras numberOfBalls no esté dentro del rango de 1 a 3.

            totalBalls = totalBalls - numberOfBalls; //Se resta el total a la elección del jugador.

            if (totalBalls <= 0) { //Se comprueba si el total ha llegado a 0.
                System.out.println("¡Ganas la partida!"); //Se detiene si se cumple la condición.

            } else { //Si el total no es 0, se muestran las que han quedado.
                System.out.println("¡Quedan " + totalBalls + " bolas!");

                machineNumbOfBalls = (int) (Math.random() * 3 + 1); //Se genera la elección de la máquina.
                totalBalls = totalBalls - machineNumbOfBalls; //Se resta el total a la elección de la máquina.

                if (totalBalls <= 0) { //Se comprueba si el total vale 0 de nuevo.
                    System.out.println("¡Gana la máquina!");
                    
                } else {
                    System.out.println("¡La máquina ha quitado " + machineNumbOfBalls + " bolas!. ¡Quedan " + totalBalls + "!"); //Si el total no vale 0, entonces se muestran las restantes.
                }

            }

        } while (totalBalls > 0); //Repetir mientras totalBalls no llegue a 0.

    }

}
