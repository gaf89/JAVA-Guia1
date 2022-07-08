/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_01_Extras;

import java.util.Scanner;

/**
 *
 * @author norae
 */
/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
*/
public class Ejercicio14_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de familias");
        int N = leer.nextInt();
        int M, hijosTot, edad, edadSuma;
        hijosTot = 0;
        edadSuma = 0;
        
        for (int i = 1; i <= N; i++){
            System.out.println("Ingrese la cantidad de hijos de la familia ("+i+"/"+N+")");
            M = leer.nextInt();
            hijosTot = hijosTot + M;
            for (int j = 1; j <= M; j++){
                System.out.print("Ingresar edad hijo ("+j+"/"+M+"): ");
                edad = leer.nextInt();
                edadSuma = edadSuma + edad;
            }
            System.out.println("");
        }
        System.out.println(edadSuma+" / "+hijosTot);
        System.out.println("La media de edad de hijos de todas las familias es: "+(edadSuma / hijosTot));
    }
    
}
