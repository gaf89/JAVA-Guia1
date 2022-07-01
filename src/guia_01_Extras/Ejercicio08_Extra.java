/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_01_Extras;

import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/
public class Ejercicio08_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num;
        int cont = 0;
        int contPar = 0;
        int contImp = 0;
        
        do {
            System.out.println("Ingresar un número entero positivo");
            num = leer.nextInt();
            if (num <= 0) {
                continue;
            }
            if ((num % 5) == 0) {
                System.out.println("Fin");
                break;
            }
            
            if (num > 0){
                cont++;
                if ((num % 2) == 0){
                    contPar++;
                }else{
                    contImp++;
                }
            }           
        }while ((num % 5) != 0);
        
        System.out.println("La cantidad de números ingresados es: "+cont);
        System.out.println("La cantidad de números pares es: "+contPar);
        System.out.println("La cantidad de números impares es : "+contImp);
    }
    
}
