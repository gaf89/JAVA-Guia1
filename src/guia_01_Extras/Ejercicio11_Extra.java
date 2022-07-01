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
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
*/
public class Ejercicio11_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar un número entero");
        int num = leer.nextInt();
        int cifras = 1;
        int aux = num;
        while (aux >= 10) {
            aux = (int) Math.floor(aux / 10);
            cifras++;
        }
        System.out.println("");
        System.out.println("El número "+num+" tiene "+cifras+" cifras");
    }
    
}
