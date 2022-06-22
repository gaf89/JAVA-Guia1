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
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor límite positivo");
        int lim = leer.nextInt();
        int suma = 0;
        
        while (suma < lim) {
            System.out.println("Ingresar un número");
            int num = leer.nextInt();
            suma = suma + num;
            
        }
        System.out.println("Limite superado, Suma igual a: "+suma);
    }
    
}
