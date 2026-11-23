/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasvoluntarias;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author beetlepie
 */
public class SimulacroMina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Parte 1 - plant bomb position randomly
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce line length: ");
        char[] customArray = new char[sc.nextInt()];
        Arrays.fill(customArray, 'X');
        int random = (int) (Math.random() * customArray.length);
        customArray[random] = 'B';
        System.out.println(Arrays.toString(customArray));
        System.out.println("");

        //Parte 2: ask bomb position
        char[] arrayGame = new char[customArray.length];
        Arrays.fill(arrayGame, 'X');

        int attempts = 0;
        boolean isBomb = false;

        do {
            printGameLine(arrayGame);
            System.out.println("");
            System.out.print("Where is the bomb? ");
            int userChoice = sc.nextInt();
            if (customArray[userChoice] != customArray[random]) {
                arrayGame[userChoice] = 'A';
                isBomb = false;

            } else {
                isBomb = true;
            }

            attempts++;

        } while ((attempts != 3) && (isBomb == false));

        if (isBomb == true) {
            System.out.println("You won and the bomb was disabled!");
        } else {
            System.out.println("You failed and the bomb exploded!");
        }

        //Parte 3: counting elements + inverting array
        char[] fixArray = {'A', 'X', 'A', 'X', 'X', 'A', 'B', 'X'};
        int amountOfA = 0, amountOfX = 0, amountOfB = 0;

        for (int i = 0; i < fixArray.length; i++) {

            switch (fixArray[i]) {
                case 'A':
                    amountOfA++;
                    break;
                case 'X':
                    amountOfX++;
                    break;
                default:
                    amountOfB++;
                    break;
            }

        }

        System.out.println("Number of A elements: " + amountOfA + " | " + "number of X elements: " + amountOfX + " | " + "Number of B elements: " + amountOfB);

        char[] invertedArray = new char[fixArray.length];

        for (int i = 0; i < fixArray.length; i++) {
            invertedArray[i] = fixArray[i];

            switch (invertedArray[i]) {
                case 'A':
                    invertedArray[i] = 'X';
                    break;
                case 'X':
                    invertedArray[i] = 'A';
                    break;
            }

        }

        System.out.println(Arrays.toString(invertedArray));

        char[] even = new char[fixArray.length / 2];
        char[] odd = new char[fixArray.length / 2];
        byte evenIndex = 0;
        byte oddIndex = 0;

        for (int i = 0; i < fixArray.length; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = fixArray[i];
                evenIndex++;
            } else {
                odd[oddIndex] = fixArray[i];
                oddIndex++;
            }
        }

        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

        System.out.println("");

        //Parte 4: movement to user's specified position
        char[] exercise4 = new char[8];
        Arrays.fill(exercise4, 'X');
        exercise4[random] = 'B';
        int position = 0;
        System.out.println(Arrays.toString(exercise4));

        for (int i = 0; i < exercise4.length; i++) {
            if (exercise4[i] == 'B') {
                position = i;
            }
        }

        System.out.print("How many moves for B? ");
        int userMovement = sc.nextInt();

        while (userMovement < 0 || userMovement > 99) {
            System.out.print("Input error, introduce a value between 0 and 99: ");
            userMovement = sc.nextInt();

        }

        exercise4[position] = 'X';
        int newPosition = (position + userMovement) % exercise4.length;
        exercise4[newPosition] = 'B';
        System.out.println(Arrays.toString(exercise4));

        //Parte 5: distance from bomb
        char[] lastArray = new char[16];
        Arrays.fill(lastArray, 'X');
        random = (int) (Math.random() * lastArray.length);
        lastArray[random] = 'B';
        System.out.println("Debug de random: " + random);
        System.out.println(Arrays.toString(lastArray));
        int[] distance = new int[lastArray.length];

        for (int i = 0; i < distance.length; i++) {
            if (i < random) {
                distance[i] = random - i; //Se asume la posición de random y se va restando desde ahí.
            } else {
                distance[i] = i - random; //
            }

        }

        System.out.println(Arrays.toString(distance));

    }

    private static void printGameLine(char[] arrayGame) {
        for (int i = 0; i < arrayGame.length; i++) {
            System.out.print(i + "." + arrayGame[i] + " ");

        }
    }

}
