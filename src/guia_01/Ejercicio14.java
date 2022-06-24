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
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
      
        System.out.println("Ingresar la cantidad de euros a converitr");
        double euro = leer.nextDouble();
        System.out.println("A que moneda desea convertirla (dolares/yenes/libras)");
        String moneda = leer.next();
        
        Cambio (euro, moneda);
    }
    
    public static void Cambio (double eu, String mon) {
       
        switch (mon){
            case "dolares": 
                System.out.println(eu+" euros equivalen a: "+(eu * 1.28611)+" dólares");
                break;
            case "yenes": 
                System.out.println(eu+" euros equivalen a: "+(eu * 129.852)+" yenes");
                break;
            case "libras":
                System.out.println(eu+" euros equivalen a: "+(eu * 0.86)+" libras");
                break;
        }
    }
}


