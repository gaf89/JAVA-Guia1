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
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
*/
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                        
        int matrizM[][] = new int[10][10];
        int matrizP[][] = new int[3][3];
        
        CargarMatrizM(matrizM);
        IngresarMatrizP(matrizP);
        MostrarMatriz(matrizM, 10);
        MostrarMatriz(matrizP, 3);
        
        int contIgual = 0;
        int ubicFil = 0;
        int ubicCol = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j =0; j < 8; j++) {
                if (matrizP[0][0] == matrizM[i][j] && contIgual < 9) {
                    ubicFil = i;
                    ubicCol = j;
                    contIgual = 0;
                    for(int k = 0; k < 3; k++) {
                        for(int l = 0; l < 3; l++) {
                            if (matrizM[ubicFil+k][ubicCol+l] == matrizP[k][l]) {
                                contIgual++;
                            }
                        }
                    }
                }
            }
        }
       
        if (contIgual == 9) {
            System.out.println("Se ha encontrado la matriz P en la ubicación: "+ubicFil+","+ubicCol);
        }else{
            System.out.println("No se encontrado la matriz P");
        }
        
    }
    
    public static void MostrarMatriz(int M[][], int N) {
        System.out.println("");
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if (M[i][j] < 10) {
                    System.out.print("[ "+M[i][j]+"]  ");
                }else{
                    System.out.print("["+M[i][j]+"]  ");
                }
                
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void IngresarMatrizP(int P[][]) {
        Scanner leer = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Ingresar un Número para la posición "+i+","+j+": ");
                P[i][j] = leer.nextInt();
            }            
        }
        System.out.println("");
    }
    
    public static void CargarMatrizP(int P[][]) {
        P[0][0] = 36;
        P[0][1] = 5;
        P[0][2] = 67;
        P[1][0] = 89;
        P[1][1] = 90;
        P[1][2] = 75;
        P[2][0] = 14;
        P[2][1] = 22;
        P[2][2] = 26;
        
    }
    
    public static void CargarMatrizM(int M[][]) {
        M[0][0] = 1;
        M[0][1] = 26;
        M[0][2] = 36;
        M[0][3] = 47;
        M[0][4] = 5;
        M[0][5] = 6;
        M[0][6] = 72;
        M[0][7] = 81;
        M[0][8] = 95;
        M[0][9] = 10;
        M[1][0] = 11;
        M[1][1] = 12;
        M[1][2] = 13;
        M[1][3] = 21;
        M[1][4] = 41;
        M[1][5] = 22;
        M[1][6] = 67;
        M[1][7] = 20;
        M[1][8] = 10;
        M[1][9] = 61;
        M[2][0] = 56;
        M[2][1] = 78;
        M[2][2] = 87;
        M[2][3] = 90;
        M[2][4] = 9;
        M[2][5] = 90;
        M[2][6] = 17;
        M[2][7] = 12;
        M[2][8] = 87;
        M[2][9] = 67;
        M[3][0] = 41;
        M[3][1] = 87;
        M[3][2] = 24;
        M[3][3] = 56;
        M[3][4] = 97;
        M[3][5] = 74;
        M[3][6] = 87;
        M[3][7] = 42;
        M[3][8] = 64;
        M[3][9] = 35;
        M[4][0] = 32;
        M[4][1] = 76;
        M[4][2] = 79;
        M[4][3] = 1;
        M[4][4] = 36;
        M[4][5] = 5;
        M[4][6] = 67;
        M[4][7] = 96;
        M[4][8] = 12;
        M[4][9] = 11;
        M[5][0] = 99;
        M[5][1] = 13;
        M[5][2] = 54;
        M[5][3] = 88;
        M[5][4] = 89;
        M[5][5] = 90;
        M[5][6] = 75;
        M[5][7] = 12;
        M[5][8] = 41;
        M[5][9] = 76;
        M[6][0] = 67;
        M[6][1] = 78;
        M[6][2] = 87;
        M[6][3] = 45;
        M[6][4] = 14;
        M[6][5] = 22;
        M[6][6] = 26;
        M[6][7] = 42;
        M[6][8] = 56;
        M[6][9] = 78;
        M[7][0] = 98;
        M[7][1] = 45;
        M[7][2] = 34;
        M[7][3] = 23;
        M[7][4] = 32;
        M[7][5] = 56;
        M[7][6] = 74;
        M[7][7] = 16;
        M[7][8] = 19;
        M[7][9] = 18;
        M[8][0] = 24;
        M[8][1] = 67;
        M[8][2] = 97;
        M[8][3] = 46;
        M[8][4] = 87;
        M[8][5] = 13;
        M[8][6] = 67;
        M[8][7] = 89;
        M[8][8] = 93;
        M[8][9] = 24;
        M[9][0] = 21;
        M[9][1] = 68;
        M[9][2] = 78;
        M[9][3] = 98;
        M[9][4] = 90;
        M[9][5] = 67;
        M[9][6] = 12;
        M[9][7] = 41;
        M[9][8] = 65;
        M[9][9] = 12;
        
    }
}
