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
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
*/
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        
        String FDE = "";
        int cor = 0, inc = 0;
        
        while (!"&&&&&".equals(FDE)) {
            System.out.println("Ingrese una cadena");
            FDE = leer.nextLine();
            if (FDE.length() == 5) {
                if (FDE.substring(0, 1).equals("X") && FDE.substring(4).equals("O")) {
                    cor++;
                } else {
                    inc++;
                }
            } else {
                inc++;
            }
        }
        System.out.println("La cantidad de lecturas Correctas es: "+cor);
        System.out.println("La cantidad de lecturas Incorrectas es: "+inc);
    }
    
}
