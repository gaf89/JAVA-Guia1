/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_01_Manos_a_la_Obra;

import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;
import sun.security.util.Length;

/**
 *
 * @author Gaston
 */

/*
EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        //int longi = frase.length() - 1;
        //char let = frase.charAt(longi);
        
        if (frase.charAt(frase.length() - 1) == '.') {
            System.out.println("La frase codificada es:");
            System.out.println(Codificar(frase));
        } else {
            System.out.println("La frase no finaliza en punto(.)");
        }
    }
    
    public static String Codificar(String f){
        String fraseCod = "";
        for (int i = 0; i < f.length(); i++){
            switch (f.charAt(i)) {
                case 'a':
                case 'A': fraseCod = fraseCod + "@";
                    break;
                case 'e':
                case 'E': fraseCod = fraseCod + "#";
                    break;
                case 'i':
                case 'I': fraseCod = fraseCod + "$";
                    break;
                case 'o':
                case 'O': fraseCod = fraseCod + "%";
                    break;
                case 'u':
                case 'U': fraseCod = fraseCod + "*";
                    break;
                default:
                    fraseCod = fraseCod + f.charAt(i);
            }
        }
        return fraseCod;
    }

}
