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
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
*/

public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un número intero");
        int num = leer.nextInt();
                
        System.out.println("Doble: "+(num*2));
        System.out.println("Triple : "+(num*3));
        System.out.println("Raíz Cuadrada: "+(Math.sqrt(num)));
    }
    
}
