/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;
import paquete01.*;

/**
 *
 * @author reroes
 */
public class Ejemplo101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Creación de arreglo bidimensionales

        //int[][] arreglo1 = {{-10, 41, 40}, {1, -2, -3}, {6, 8, -9}};
        int[][] arreglo1 = new int[3][4];
        /*
        -10      41      40
        1       -2       -3
        6       8       -9
         */
        System.out.println("Ingrese el valor a sumar");
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int valor;
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                System.out.printf("Ingrese el valor a sumar en la posicion %d %d \n"
                        , fila, col);
                valor = arreglo1[fila][col];
                valor = entrada.nextInt();
                if (valor > 0) {
                    sumaPositivos = sumaPositivos + valor;
                } else {
                    if (valor < 0) {
                        sumaNegativos = sumaNegativos + valor;
                    }
                }

            }
        }
        System.out.printf("Suma de valores de positivos: %d\n", sumaPositivos);
        System.out.printf("Suma de valores de negativos: %d\n", sumaNegativos);
    }

}
