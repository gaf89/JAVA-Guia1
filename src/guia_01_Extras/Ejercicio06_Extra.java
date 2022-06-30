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
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
*/
public class Ejercicio06_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int N = leer.nextInt();
        double alt;
        double sumaTot = 0;
        double sumaDeb = 0;
        int contDeb = 0;
        
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese la altura de la persona "+(i+1)+"/"+N+":");
            alt = leer.nextDouble();
            sumaTot = sumaTot + alt;
            if (alt < 1.6){
                sumaDeb = sumaDeb + alt;
                contDeb++;
            }
        }
        
        System.out.println("El promedio de estaturas por debajo de 1,60 mts es: "+(sumaDeb/contDeb));
        System.out.println("El promedio de estaturas general es: "+(sumaTot/N));
    }
    
}
