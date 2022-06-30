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
EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
EJERCICIO 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
*/

public class Ejercicio13_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner leer = new Scanner(System.in);
        
        String Equipo[] = new String[3];
        
        for (int i = 0; i < 3; i++){
            System.out.println("Ingresar el nombre de un integrante del equipo");
            Equipo[i] = leer.nextLine();
        }
        
        for (int i = 0; i < 3; i++){
            System.out.print("["+Equipo[i]+"] ");
        }
        System.out.println("");
    }
    
}
