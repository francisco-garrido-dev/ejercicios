/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg2;

/**
 *
 * @author MEDAC
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double firstNum = 5.3;
        double secondNum = 4.2;
        double addingResult = firstNum + secondNum;
        double subsResult = firstNum - secondNum;
        double multResult = firstNum * secondNum;
        double divisionResult = firstNum / secondNum;
              
        System.out.println("La suma es: " + addingResult);
        System.out.println("La resta es: " + subsResult);
        System.out.println("La multiplicación es: " + multResult);
        System.out.println("La división es: " + divisionResult);
        
    }
    
}
