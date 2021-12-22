/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.*;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo011 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String  valorIngresado;
        String [][] arreglo1 = new String[2][2];
        // i = fila
        // j = columna
        System.out.println("Presentación de valores iniciales del arreglo");
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                System.out.printf("%s\t", arreglo1[i][j]);
            }
            System.out.println(); // salto de línea
        }
        
        System.out.println("Ingreso de datos al arreglo");
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                System.out.printf("Ingrese valor para la posición [%d][%d]\t:",
                        i, j);
                valorIngresado = entrada.nextLine();
                arreglo1[i][j] = valorIngresado;
            }
            System.out.println(); // salto de línea
        }
        
        System.out.println("Presentación de valores del arreglo");
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                System.out.printf("%s\t", arreglo1[i][j]);
            }
            System.out.println(); // salto de línea
        }

    }
}
