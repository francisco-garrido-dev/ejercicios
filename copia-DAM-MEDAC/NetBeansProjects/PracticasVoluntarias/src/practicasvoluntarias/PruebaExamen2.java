/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasvoluntarias;

import java.util.Arrays;

/**
 *
 * @author beetlepie
 */
public class PruebaExamen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hundir la flota jugable

        char[][] gameTable = new char[8][8];
        for (int i = 0; i < gameTable.length; i++) {
            Arrays.fill(gameTable[i], '-'); //Agua
            for (int j = 0; j < gameTable[i].length; j++) {
                System.out.print(gameTable[i][j]);
            }

            System.out.println("");
        }
        
        System.out.println("GAME BELOW");

        byte line = (byte) (Math.random() * gameTable.length); //Random line
        byte column = (byte) (Math.random() * 5); //Max size of biggest ship
        
        for (int i = 0; i < 4; i++) {
            gameTable[line][column + i] = 'B';
        }
        
         for (int i = 0; i < gameTable.length; i++) {

            for (int j = 0; j < gameTable[i].length; j++) {
                System.out.print(gameTable[i][j]);
            }

            System.out.println("");
        }
        
        

    }

}
