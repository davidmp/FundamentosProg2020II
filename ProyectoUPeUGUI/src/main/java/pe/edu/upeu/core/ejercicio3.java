package pe.edu.upeu.core;

import java.util.Scanner;

public class ejercicio3 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz = new int[20][20];
        int dim, i, j, db, item;
        System.out.println("\nINGRESAR DIMENSION DE LA MATRIZ : ");
        dim = teclado.nextInt();
        System.out.println("\nIngresar Direccionamiento Base: ");
        db = teclado.nextInt();
        for (i = 0; i < dim; i++) {
            for (j = 0; j < dim; j++) {
                item = db + (i + j) * (i + j + 1) / 2 + j;
                matriz[i][j] = item;
            }
        }

        System.out.println("\nLECTURA DE ASIGNACION DE MATRIZ\n");
        for (i = 0; i < dim; i++) {
            for (j = 0; j < dim; j++) {
                if (j < dim - i) {
                    System.out.println(matriz[i][j]);
                } else {
                    System.out.println("\t ");
                }
            }
            System.out.println("\n");
        }

        System.out.println("\nQue posicion desea saber de matriz[i][j]\n");
        System.out.println("\nIngresar i: ");
        i = teclado.nextInt();
        System.out.println("\nIngresar j: ");
        j = teclado.nextInt();

        System.out.println("\nEl valor es: " + matriz[i][j]);
    }

}