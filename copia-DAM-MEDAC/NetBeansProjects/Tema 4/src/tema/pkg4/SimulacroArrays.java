/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg4;

import java.util.Arrays;

/**
 *
 * @author MEDAC
 */
public class SimulacroArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] primerADN = new char[16];
        char[] segundoADN = new char[16];
        char[] tercerADN = new char[16];
        char[] cuartoADN = new char[16];
        char[] hebra5 = new char[16];
        char[] hebraUnida = new char[segundoADN.length + primerADN.length];
        byte k = 15, a = 0, t = 0, g = 0, c = 0;

        for (int count = 0; count < 16; count++) {

            if (count < 4) { //Primeras cuatro hebras.

                primerADN[count] = 'A';
                segundoADN[count] = 'T';
                tercerADN[count] = 'G';

            } else if (count < 8) { //Las cuatro siguientes, y así sucesivamente...
                primerADN[count] = 'T';
                segundoADN[count] = 'A';
                tercerADN[count] = 'C';
            } else if (count < 12) {
                primerADN[count] = 'G';
                segundoADN[count] = 'G';
                tercerADN[count] = 'T';
            } else {
                primerADN[count] = 'C';
                segundoADN[count] = 'C';
                tercerADN[count] = 'A';
            }
        }

        for (int count = 0; count < 16; count++) {
            int random = (int) (Math.random() * 4);

            switch (random) {
                case 0:
                    cuartoADN[count] = 'G';
                    g++;
                    break;
                case 1:
                    cuartoADN[count] = 'C';
                    c++;
                    break;
                case 2:
                    cuartoADN[count] = 'T';
                    t++;
                    break;
                default:
                    cuartoADN[count] = 'A';
                    a++;
                    break;
            }
        }

        System.out.println(Arrays.toString(primerADN));
        System.out.println(Arrays.toString(segundoADN));
        System.out.println(Arrays.toString(tercerADN));
        System.out.println(Arrays.toString(cuartoADN));

        System.out.println("");

        for (int i = 0; i < segundoADN.length; i++) {
            hebra5[i] = segundoADN[k];
            //alternativa: hebra5[i] = segundoADN[segundoADN.length - 1 - i];
            //otra alternativa: hebra5[i] = segundoADN[15 - i];
            k--;
        }
        System.out.println("Hebra 2:");
        System.out.println(Arrays.toString(segundoADN));
        System.out.println("");
        System.out.println("Hebra 5:");
        System.out.println(Arrays.toString(hebra5));
       
        System.out.println("");
        System.out.print("A se repite " + a + ", " + "T se repite " + t + ", " + "G se repite " + g + ", " + "C se repite " + c);
        
         for (int i = 0; i < hebraUnida.length; i++) {
            if (i < 16) {
                hebraUnida[i] = primerADN[i];
            } else {
                hebraUnida[i] = segundoADN[31 - i];
            }
        }
         
         System.out.println(Arrays.toString(hebraUnida));

    }
}
