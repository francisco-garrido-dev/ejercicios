/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg4;

/**
 *
 * @author MEDAC
 */
public class CharArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [] letras = {'h', 'o', 'l', 'a'}; //Casillas de 0 a 3.
        char [] letras2 = new char [letras.length + 1];
        
        for (int i = 0; i < letras.length; i++) { /*Recorre el pequeño para no irse de tamaño. Esto siempre se hace al comparar
            dos arrays de tamaño diferente
            */
            letras2[i] = letras[i]; //Guarda el contenido de letras en letras2.
        }
        
        letras2[letras.length] = 's'; //Guarda 's' en la casilla 4. Esto es porque .length dice el tamaño real.
        
        for (int i = 0; i < letras2.length; i++) {
        System.out.println(letras2[i]);
    }
        
        
    }
    
}
