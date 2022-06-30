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

/*EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
*/

public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una nota");
        int nota = leer.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("Nota no válida, Ingrese una nueva nota");
            nota = leer.nextInt();
        }
        
        System.out.println("Nota valida");
    }
    
}
