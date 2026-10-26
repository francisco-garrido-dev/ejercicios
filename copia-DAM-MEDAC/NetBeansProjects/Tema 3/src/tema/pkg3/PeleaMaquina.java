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
public class PeleaMaquina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0, secondIpunt = 0, dice = 0, strength = 10, health = 10, machineStrength = 10, machineHealth = 10, machineChoice = 0;

        System.out.println("Bienvenido al juego de DAVANTE");

        do {
            System.out.println("Pulsa 1 para jugar | 2 para ajustar la dificultad | 3 para ver las stats | 4 para salir.");
            input = sc.nextInt();

                System.out.println("Vida de la IA: " + machineHealth);
                System.out.println("Vida del humano: " + health);

                switch (input) {
                    case 1:
                        System.out.println("Elige tu estrategia: 1. Pelear | 2. Descansar | 3. Entrenar.");
                        secondIpunt = sc.nextInt();

                        switch (secondIpunt) {
                            case 1:
                                dice = (int) (Math.random() * 6 + 1);
                                machineHealth = machineHealth - (dice * strength) / 10;

                                break;

                            case 2:
                                dice = (int) (Math.random() * 6 + 1);
                                if (dice < 5) {
                                    health = health + 1;
                                } else {
                                    health = health + 2;
                                }
                                break;

                            case 3:
                                dice = (int) (Math.random() * 6 + 1);
                                if (dice < 5) {
                                    strength = strength + 1;
                                } else {
                                    strength = strength + 2;
                                }
                                break;

                            default:
                                System.out.println("Elige una opción correcta.");
                        }

                        machineChoice = (int) (Math.random() * 3 + 1);

                        switch (machineChoice) {
                            case 1:
                                dice = (int) (Math.random() * 6 + 1);
                                health = health - (dice * machineStrength) / 10;
                                break;

                            case 2:
                                dice = (int) (Math.random() * 6 + 1);
                                if (dice < 5) {
                                    machineHealth = machineHealth + 1;
                                } else {
                                    machineHealth = machineHealth + 2;
                                }
                                break;

                            case 3:
                                if (dice < 5) {
                                    machineStrength = machineStrength + 1;
                                } else {
                                    machineStrength = machineStrength + 2;
                                }

                                break;

                        }

                        break;

                    case 2:
                        System.out.println("Selecciona dificultad: 1. Fácil | 2. Medio | 3. Difícil");
                        secondIpunt = sc.nextInt();

                        switch (secondIpunt) {
                            case 1:
                                machineHealth = 8;
                                break;
                            case 2:
                                machineHealth = 10;
                                break;
                            case 3:
                                machineHealth = 12;
                                break;
                            default:
                                System.out.println("Introduce un valor correcto.");
                                break;
                        }

                        break;

                    case 3:
                        System.out.println("Humano: " + "fuerza " + strength + " y vida " + health);
                        System.out.println("IA: " + "fuerza " + machineStrength + " y vida " + machineHealth);
                        break;

                    default:
                        System.out.println("Elige entre las opciones disponibles.");
                        break;
                }

        } while (input != 4);

    }

}
