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
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        int matriz[][] = new int[3][3];
        int traspuesta[][] = new int[3][3];
                
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Ingresar Número para la posición ["+i+"]["+j+"]: ");
                int num = leer.nextInt();
                matriz[i][j] = num;
                traspuesta[j][i] = num;
            }
        }
        System.out.println("");
        System.out.println("Matriz");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Matriz Traspuesta");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("["+traspuesta[i][j]+"] ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        int comp = 0;
        
        for (int j = 0; j < 3; j++){
            for (int i = 0; i < 3; i++){
                //System.out.print("["+(matriz[i][j]+traspuesta[i][j])+"] ");
                if (matriz[i][j]+traspuesta[i][j] == 0){
                    comp++;
                }
            }
            //System.out.println("");
        }
        
        if(comp == 9) {
            System.out.println("La Matriz es Anticimétrica");
        }else{
            System.out.println("La Matriz NO es Anticimétrica");
        }
        
    }
    
}

