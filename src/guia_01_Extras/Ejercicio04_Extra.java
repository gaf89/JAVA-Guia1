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
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
*/
public class Ejercicio04_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un Número entre 1 y 10: ");
        int num = leer.nextInt();
        
        switch (num) {
            case 1: System.out.println("Su equivalente en romano es I");
                    break;
            case 2: System.out.println("Su equivalente en romano es II");
                    break;
            case 3: System.out.println("Su equivalente en romano es III");
                    break;
            case 4: System.out.println("Su equivalente en romano es IV");
                    break;
            case 5: System.out.println("Su equivalente en romano es V");
                    break;
            case 6: System.out.println("Su equivalente en romano es VI");
                    break;
            case 7: System.out.println("Su equivalente en romano es VII");
                    break;
            case 8: System.out.println("Su equivalente en romano es VIII");
                    break;
            case 9: System.out.println("Su equivalente en romano es IX");
                    break;
            case 10: System.out.println("Su equivalente en romano es X");
                    break;
            default: System.out.println("El valor ingresado NO es válido");
        }
    }
    
}
