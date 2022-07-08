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
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
*/
public class Ejercicio15_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar 2 Números");
        System.out.print("Número 1: ");
        int num1 = leer.nextInt();
        System.out.print("Número 2: ");
        int num2 = leer.nextInt();
        
        System.out.println("");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("");
        
        System.out.print("Elegir Una opcion: ");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("El Resultado es: "+Suma(num1, num2));
                break;
            case 2:
                System.out.println("El Resultado es: "+Resta(num1, num2));
                break;
            case 3:
                System.out.println("El Resultado es: "+Multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println("El Resultado es: "+Division(num1, num2));
                break;
            default: System.out.println("Opcion no válida");
        }
        
    }
    
    public static int Suma(int n1, int n2) {
        int suma;
        suma = n1 + n2;        
        return suma;
    }
    
    public static int Resta(int n1, int n2) {
        int resta;
        resta = n1 - n2;
        return resta;
    }
        
    public static int Multiplicacion(int n1, int n2) {
        int multi;
        multi = n1 * n2;
        return multi;
    }
    
    public static double Division(int n1, int n2) {
        double division;
        division = n1 / n2;
        return division;
    }

    
}
