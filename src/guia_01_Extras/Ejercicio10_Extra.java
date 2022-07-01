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
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
*/
public class Ejercicio10_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        int num1,num2,resul,resp;
        
        num1 = (int) (Math.random()*10);
        num2 = (int) (Math.random()*10);
        resul = num1 * num2;
       
        do {
            System.out.println("");
            System.out.println("Adivine el resultado de la multiplicación:");
            System.out.print(num1+" * "+num2+" = ");
            resp = leer.nextInt();
            if (resp == resul) {
                System.out.println("Felicidades has encontrado el resultado");
            }else{
                System.out.println("Respuesta incorrecta, intentelo nuevamente");
            }
        }while (resp != resul);
    }
    
}
