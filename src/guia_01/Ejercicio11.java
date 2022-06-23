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
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
*/
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar 2 Números Enteros Positivos");
        System.out.print("Nro. 1: ");
        int num1 = leer.nextInt();
        System.out.print("Nro. 2: ");
        int num2 = leer.nextInt();
        boolean salir = false;
               
        while (salir == false) {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividit");
            System.out.println("5. Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1: System.out.println("La Suma es igual a: "+(num1+num2));
                    System.out.println("");
                        break;
                case 2: System.out.println("La Resta es igual a: "+(num1-num2));
                    System.out.println("");
                        break;
                case 3: System.out.println("La Multiplicacion es igual a: "+(num1*num2));
                    System.out.println("");
                        break;
                case 4: System.out.println("La División es igual a: "+(num1/num2));
                    System.out.println("");
                        break;
                case 5: 
                    System.out.println("¿Está suguro que desea salir del programa(S/N)?");
                    char ele = leer.next().charAt(0);
                        if (ele == 'S' || ele == 's') {
                            salir=true;
                            break;                            
                        } else {
                            break;
                        }
                    
            }
        }
    }
    
}
