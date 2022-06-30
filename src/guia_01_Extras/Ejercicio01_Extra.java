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
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*/
public class Ejercicio01_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar un tiempo en minutos:");
        int min = leer.nextInt();
        
        int hor = (int) Math.floor(min / 60);
        int dias = (int) Math.floor(hor / 24);
        
        System.out.println(min+" minutos son equivalesnte a "+dias+" dia/s, "+hor % 24+" horas.");
    }
    
}
