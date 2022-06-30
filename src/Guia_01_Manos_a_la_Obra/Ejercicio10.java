/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_01_Manos_a_la_Obra;

import java.util.Scanner;

/**
 *
 * @author Gaston
 */

/*
EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/

public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, num3, num4;
        
        System.out.println("Ingresar 4 nùmeros enteros (entre 1 y 20)");
        System.out.print("Nro. 1: ");
        num1 = leer.nextInt();
        System.out.print("Nro. 2: ");
        num2 = leer.nextInt();
        System.out.print("Nro. 3: ");
        num3 = leer.nextInt();
        System.out.print("Nro. 4: ");
        num4 = leer.nextInt();
        
        System.out.print(num1+" ");
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(num2+" ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(num3+" ");
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(num4+" ");
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
