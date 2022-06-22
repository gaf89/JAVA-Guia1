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
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/

public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar una temperatura en grados Centigrados");
        double C = leer.nextDouble();
        
        double F = 32 + (9 * C / 5);
        
        System.out.println(C+" grados Centigrados equivalen a "+F+" grados Fahrenheit");
    }
    
}
