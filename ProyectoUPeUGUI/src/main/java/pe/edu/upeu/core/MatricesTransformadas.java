
package pe.edu.upeu.core;

import pe.edu.upeu.utils.ImprimirArreglos;

public class MatricesTransformadas{

ImprimirArreglos ia=new ImprimirArreglos();

public int[][] transformada01(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int item=0;
    for(int fila=0; fila<dimen;fila++){
        for(int columna=0; columna<dimen;columna++){
            if(columna<dimen-fila){
            item=numInit+(fila+columna)*(fila+columna+1)/2 + fila;
            matriz[fila][columna]=item;                
            }
        }
    }
    return matriz;
}

public static void main(String[] args) {
   MatricesTransformadas mt=new MatricesTransformadas(); 
   mt.ia.imprimirMatriz(mt.transformada01(5, 0));
}

    
}