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
EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
*/

public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingresar segundo número");
        int num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);
    }
    
    public static void EsMultiplo(int n1,int n2) {
        
        if (n1 % n2 == 0){
            System.out.println(+n1+" es multiplo de "+n2);
        } else {
            System.out.println(+n1+" NO es multiplo de "+n2);
        }
    }    
}
