/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_01_Extras;

/**
 *
 * @author Gaston
 */

/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/
public class Ejercicio02_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int A,B,C,D,aux;
        A = 3;
        B = 8;
        C = 4;
        D = 2;
        
        System.out.println("Valores Iniciales:");
        System.out.println("A = "+A+", B = "+B+", C = "+C+", D = "+D);
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("Valores Finales");
        System.out.println("A = "+A+", B = "+B+", C = "+C+", D = "+D);
    }
    
}
