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
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/
public class Ejercicio16_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String eleccion, nombre;
        int edad;
        eleccion = "Si";
        
        while (eleccion.equals("Si")) {
            System.out.print("Ingrese un Nombre: ");
            nombre = leer.next();
            System.out.print("Ingrese la edad: ");
            edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println(nombre+" de "+edad+" años es mayor de edad");
            }else{
                System.out.println(nombre+" de "+edad+" años es meno**r de edad");
            }
            System.out.println("");
            System.out.println("¿Desea seguir ingresarndo personas? (Si/No)");
            eleccion = leer.next();
            System.out.println("");
        }
    }
    
}
