/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_01_Extras;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Gaston
 */
/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
*/
public class Ejercicio12_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                for (int k = 0; k < 9; k++){
                TimeUnit.MILLISECONDS.sleep(400);
                    if (i == 3){
                        System.out.println("E-"+j+"-"+k);
                    }else{
                        if (j == 3) {
                            System.out.println(i+"-E-"+k);
                        }else{
                            if (k == 3) {
                                System.out.println(i+"-"+j+"-E");
                            }else{
                                System.out.println(i+"-"+j+"-"+k);
                            }
                        }
                    }                    
                }
            }
        }
    }
    
}
