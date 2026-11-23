/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garridofernandezfranciscojavierprac2;

/**
 *
 * @author beetlepie
 */
public class EjerciciosPapel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 12, b = 5, res = 0;

        for (int i = 1; i <= a; i = i + 3) {
            if (i % 2 == 0) {
                res = res + i;
            } else {
                res = res - (b / 2);
            }

            b++;
        }

        System.out.println(res);

        int x = 20, y = 3, acum = 0;

        do {
            if (x % y == 0) {
                acum = acum + x;
            } else {
                acum = acum - y;
            }

            x = x - 6;
            y++;

        } while (x > 10);

        System.out.println(acum);

        int m = 15, n = 4, total = 10;

        while (m > n) {
            if (m % 3 == 0) {
                total = total + m;
            } else {
                total = total - n;
            }

            m = m - 4;
            n++;
        }

        System.out.println(total);
        
        

    }

}
