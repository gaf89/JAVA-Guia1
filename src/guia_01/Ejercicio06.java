/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_01;

import java.util.Scanner;

/**
 *
 * @author Gaston
 */

/*
Crear un programa que dado un numero determine si es par o impar.
*/
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un Número:");
        int num = leer.nextInt();
        
        if (num % 2 == 0){
            System.out.println(num+" Es Par");
        } else {
            System.out.println(num+" Es Impar");
        }
    }
    
}
