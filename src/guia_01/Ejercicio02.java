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
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
*/

public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nom = leer.nextLine();
        
        System.out.println("Tu nombre es "+nom);
    }
    
}
