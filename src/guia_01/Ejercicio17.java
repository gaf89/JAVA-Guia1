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
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
*/
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el tamaño del vector");
        int N = leer.nextInt();
        
        int vector[] = new int[N];
        
        for (int i = 0; i < N; i++){
            System.out.println("Ingres un número para la posición "+i);
            int num = leer.nextInt();
            vector[i] = num;
        }
        
        int cif1 = 0; 
        int cif2 = 0;
        int cif3 = 0;
        int cif4 = 0;
        int cif5 = 0;
        
        for (int i = 0; i < N; i++){
            int aux = vector[i];
            if (aux/10 == 0){
                cif1++;
            }else{
                if (aux/100 == 0){
                    cif2++;
                }else{
                    if (aux/1000 == 0){
                    cif3++;
                    }else{
                        if (aux/10000 == 0){
                        cif4++;
                        }else{
                            if (aux/100000 == 0){
                            cif5++;
                            }
                        }
                    }   
                }
            }
        }
        
        System.out.println("Se encontraron:");
        System.out.println(cif1+" números de 1 cifra");
        System.out.println(cif2+" números de 2 cifra");
        System.out.println(cif3+" números de 3 cifra");
        System.out.println(cif4+" números de 4 cifra");
        System.out.println(cif5+" números de 5 cifra");
    }
    
}
