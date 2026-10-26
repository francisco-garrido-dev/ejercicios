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
public class PeleaMaquinaResuelto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resp = 0, dado = 0, vidaUsuario = 10, fuerzaUsuario = 10, vidaMaq = 10, fuerzaMaq = 10, menu = 0;

        System.out.println("Bienvenido al juego");

        do {
            System.out.println("1. Jugar | 2. Ajustes | 3. Stats | 4. Salir");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("1. Pelear | 2. Descansar | 3. Entrenar");
                    resp = sc.nextInt();

                    switch (resp) {
                        case 1:
                            vidaMaq = vidaMaq - (dado * fuerzaUsuario) / 10;
                            break;

                        case 2:
                            dado = (int) (Math.random() * 6 + 1);
                            if (dado < 5) {
                                vidaUsuario = vidaUsuario + 2;

                            } else {
                                vidaUsuario = vidaUsuario + 1;
                            }

                            for (int i = 0; i < dado; i++) {
                                System.out.println("Entrenando: " + i);
                            }

                            break;

                        case 3:

                            dado = (int) (Math.random() * 6 + 1);
                            if (dado < 5) {
                                fuerzaUsuario = fuerzaUsuario + 2;
                            } else {
                                fuerzaUsuario = fuerzaUsuario + 1;
                            }

                            for (int i = 0; i < dado; i++) {
                                System.out.println("Entrenando: " + i);
                            }
                            break;
                    }

                    dado = (int) (Math.random() * 3);

                    switch (dado) {
                        case 1:
                            vidaUsuario = vidaUsuario - (dado * fuerzaMaq) / 10;
                            break;

                        case 2:
                            dado = (int) (Math.random() * 6 + 1);
                            if (dado < 5) {
                                vidaUsuario = vidaUsuario + 2;

                            } else {
                                vidaUsuario = vidaUsuario + 1;
                            }

                            break;

                        case 3:
                            dado = (int) (Math.random() * 6 + 1);
                            if (dado < 5) {
                                fuerzaMaq = fuerzaMaq + 2;
                            } else {
                                fuerzaMaq = fuerzaMaq + 1;
                            }

                            for (int i = 0; i < dado; i++) {
                                System.out.println("Entrenando: " + i);
                            }
                            break;
                    }

                    break;

                case 2:

                    System.out.println("1. Facil | 2. Medio | 3. Dificil");
                    resp = sc.nextInt();

                    switch (resp) {
                        case 1:
                            vidaMaq = 8;
                            fuerzaMaq = 8;
                            break;

                        case 2:
                            vidaMaq = 10;
                            fuerzaMaq = 10;
                            break;

                        case 3:
                            vidaMaq = 12;
                            fuerzaMaq = 12;
                            break;

                        default:

                    }

                    break;

                case 3:
                    System.out.println("Vida del jugador: " + vidaUsuario + " y fuerza de usuario: " + fuerzaUsuario);
                    System.out.println("Vida de la IA: " + vidaMaq + " y fuerza de la IA: " + fuerzaMaq);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Respuesta no valida");

            }

        } while (menu != 4);

    }

}
