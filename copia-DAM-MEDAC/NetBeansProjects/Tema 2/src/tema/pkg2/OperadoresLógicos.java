/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg2;

/**
 ! = NO
 && = and
 || = or
 
 */
public class OperadoresLógicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          boolean dato1 = false;
          
        System.out.println("El dato es: " + !dato1);
        
        boolean dato2 = true;
        System.out.println("And: " + (dato1 || dato2));
        
        /* El operador && solo dará por true una declaración si ambas son verdaderas
           por eso, si una de ellos es falso, como ocurre arriba, sale falso.
           
           Con el operador ||, basta con que una de las condiciones sea verdadera
           para que devuelva true.
        */
    }
    
}
