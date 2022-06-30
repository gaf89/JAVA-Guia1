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
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
*/
public class Ejercicio03_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar una letra");
        String let = leer.nextLine();
        
        let = let.toLowerCase();
                
        if(let.equals("a") || let.equals("e") || let.equals("i") || let.equals("o") || let.equals("u")) {
            System.out.println("La letra ingresada es una vocal");
        }else{
            System.out.println("La letra ingresada NO es una vocal");
        }
                
    }
    
}
