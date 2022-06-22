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
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
*/

public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar 2 números enteros");
        System.out.print("Nro. 1: ");
        int num1 = leer.nextInt();
        System.out.print("Nro. 1: ");
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        System.out.println("");
        System.out.println("El resultado de la suma es: "+suma);
        
    }
}
    