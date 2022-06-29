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
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
*/
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int matriz[][] = new int[3][3];
        int sumaHor[] = new int[3];
        int sumaVer[] = new int[3];
        int sumaDia[] = new int[3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingresar un Número del 1 al 9 para la posicion ["+i+"]["+j+"]: ");
                int num = leer.nextInt();
                if (num < 10 && num > 0){
                    matriz[i][j] = num;
                }else{
                    System.out.println("Número no válido");
                    j--;                    
                }
            }
        }
        
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]   ");
                sumaHor[i] = sumaHor[i] + matriz[i][j];
                sumaVer[j] = sumaVer[j] + matriz[i][j];
                if (i == j){
                    sumaDia[0] = sumaDia[0] + matriz[i][j];
                }
                if (i + j == 2) {
                    sumaDia[1] = sumaDia[1] + matriz[i][j];
                }
            }
            System.out.println("");
        }
        
        System.out.println("");
        boolean compIgual;
        int contIgual = 0;
        for (int i = 0; i < 3; i++) {
            compIgual = sumaHor[i] == sumaVer[i] && sumaHor[i] == sumaDia[0] && sumaVer[i] == sumaDia[1];
            //System.out.println("["+sumaHor[i]+"]   ["+sumaVer[i]+"]   ["+sumaDia[i]+"]");
            if (compIgual == true) {
                contIgual++;
            }
        }
        
        System.out.println("");
        if (contIgual == 3){
            System.out.println("La Matriz es Mágica");
        }else{
            System.out.println("La Matriz NO es Mágica");
        }
        
    }
    
}
