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
public class WhoIsWho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*¿El personaje tiene gafas? true o false.
        No se puede usar String, se deben usar booleanos.
        Los booleanos son: sombrero, bigote, gafas, pelo y barba.
        Todos los booleanos los iniciamos en falso.
        */
        
        boolean hat = false;
        boolean stache = false;
        boolean glasses = false;
        boolean hair = false;
        boolean beard = false;
        
        System.out.println("Bienvenido a Who is Who ");
        Scanner sc = new Scanner (System.in);

        System.out.println("¿Tiene gafas? (true o false) ");
        glasses = sc.nextBoolean();
        
        System.out.println("¿Tiene barba? ");
        beard = sc.nextBoolean();
        
        System.out.println("¿Tiene bigote? ");
        stache = sc.nextBoolean();
        
        System.out.println("¿Tiene pelo? ");
        hair = sc.nextBoolean();
        
        System.out.println("¿Tiene sombrero? ");
        hat = sc.nextBoolean();
        
        
        
        if (!glasses && !beard && !stache && !hair && !hat) { /* !glasses es el equivalente a glasses == false;
                                                               la expresión "!" siempre pregunta si NO es verdadero,
                                                               o en otras palabras, si es falso. Esto es con independencia
                                                               de si las variables booleanas se declaran como verdaderas
                                                               o falsas previamente*/
            System.out.println("Es Lorenzo");
        
        } else if (!glasses && beard && !stache && !hair && !hat) {
            
            System.out.println("Es Kiko");
            
        } else if (stache == true && hat == true) {
            System.out.println("Es Ivan");
        
        } else if (stache && glasses && beard && hair) { /* Recuerda que el orden afecta y que, si una de las condiciones
                                                            se cumple primero, el programa se detiene sin comprobar las
                                                            que le siguen inmediatamente.*/
            
            System.out.println("Es Juan");
            
        } else if (stache && glasses) {
            System.out.println("Es Salva");
        
        } else {
            System.out.println("No existe.");
        } 
                   
  
        
        
        
        
    }
    
}
