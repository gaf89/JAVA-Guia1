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
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
*/
public class Ejercicio13_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar la altura de la escalera:");
        int N = leer.nextInt();
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j <= i) {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }
    
}
