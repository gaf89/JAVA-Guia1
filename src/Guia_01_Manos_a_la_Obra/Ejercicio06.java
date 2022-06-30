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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    
    /*Implementar un programa que le pida dos números enteros al usuario y determine
    si ambos o alguno de ellos es mayor a 25.*/

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar 2 números enteros");
        System.out.print("Nro 1: ");
        int num1 = leer.nextInt();
        System.out.print("Nro 2: ");
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25) {
         
            System.out.println("Ambos números son mayores a 25");
                     
        }else{
            
            if (num1 > 25 || num2 > 25){
            
                System.out.println("Alguno de ellos es mayor a 25");
            
            }else{
                
                System.out.println("Ninguno de los números es mayor a 25");
            }
        
    }
            
    }
    
}
