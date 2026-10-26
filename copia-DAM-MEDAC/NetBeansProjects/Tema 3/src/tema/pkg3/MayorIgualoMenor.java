/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg3;

/**
 *
 * @author MEDAC
 */
public class MayorIgualoMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int randomNumber = (int) (Math.random() * 10);
       
        System.out.print("El número aleatorio es " + randomNumber + ", ");
       if (randomNumber >= 5) {
           System.out.println("por lo que es mayor o igual que 5.");
       } else {
           System.out.println("por lo que es menor que 5.");
       }
        
        
    }
    
}
