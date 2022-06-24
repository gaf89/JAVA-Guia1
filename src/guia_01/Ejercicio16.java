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
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
*/
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingresar el tamaño del vector");
        int N = leer.nextInt();
        
        int vector[] = new int[N];
        
        for (int i = 0; i < N; i++){
            vector[i] = (int) (Math.random()*10);
            System.out.print(vector[i]+" ");
        }
        System.out.println("Ingrese un numero a buscar");
        int bus = leer.nextInt();
        int cont = 0;
        for (int i = 0; i < N; i++) {
            if (vector[i] == bus) {
                System.out.println("Se encontro el número "+bus+" en la posición "+i);
                cont++;
            }
        }
        if (cont > 1) {
            System.out.println("El número buscado se encuentra repetido");
        }
    }
    
}
