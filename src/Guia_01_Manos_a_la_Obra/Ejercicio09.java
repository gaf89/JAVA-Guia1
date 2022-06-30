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

/*EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
*/

public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int num;
        int suma = 0;
        int cont = 0;
        
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            cont++;
            if (num > 0) {
            suma = suma + num;
            }
            if (num == 0) {
            System.out.println("Se capturó el numero cero");
            break;
            }
                    
        }while (cont != 20);
                
        System.out.println("El resultado de la suma es: "+suma);
    }
    
}
