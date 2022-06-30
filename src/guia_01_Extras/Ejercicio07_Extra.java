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
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
*/
public class Ejercicio07_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("¿Cuantos números desea ingresar?");
        int n = leer.nextInt();
        int cont = 1;
        int num;
        int may = 0;
        int min = 99999;
        int suma = 0;
        
        while (cont != n) {
            System.out.println("Ingrese un número entero positivo ("+cont+"/"+n+")");
            num = leer.nextInt();
            if (num > 0) {
                cont++;
                suma = suma + num;
                if (may < num) {
                    may = num;
                }
                if (min > num) {
                    min = num;
                }
            }else{
                System.out.println("Número no válido, ingreselo nuevamente");
            }
        }
        
        System.out.println("El valor máximo es: "+may);
        System.out.println("El valor mínimo es: "+min);
        System.out.println("El promedio es: "+(suma / n));
    }
    
}
