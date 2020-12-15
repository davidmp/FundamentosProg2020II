
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

public int[][] transformada02(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int item=0;
    for(int fila=0; fila<dimen;fila++){
        for(int columna=0; columna<dimen;columna++){
            if(columna<dimen-fila){
                //item=db+(i+j)*(i+j+1)/2 + j; 
            item=numInit+(fila+columna)*(fila+columna+1)/2 + columna;
            matriz[fila][columna]=item;                
            }
        }
    }
    return matriz;
}

public int[][] transformada03(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int item=0;
    for(int fila=0; fila<dimen;fila++){
        for(int columna=0; columna<dimen;columna++){
            if(columna<dimen-fila){                            
                if((fila+columna)%2==0){
                item=numInit+(fila+columna)*(fila+columna+1)/2 + columna; 
                matriz[fila][columna]=item;
                }else{
                item=numInit+(fila+columna)*(fila+columna+1)/2 + fila; 
                matriz[fila][columna]=item;
                }            
            }
        }
    }
    return matriz;
}

public int[][] transformada04(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int item=0;
    for(int fila=0; fila<dimen;fila++){
        for(int columna=0; columna<dimen;columna++){
            if(columna<dimen-fila){                            
                                
                if((fila+columna)%2==0){
                item=numInit+(fila+columna)*(fila+columna+1)/2 + fila; 
                matriz[fila][columna]=item;
                }
                else{
                item=numInit+(fila+columna)*(fila+columna+1)/2 + columna; 
                matriz[fila][columna]=item;
                }                 
                
            }
        }
    }
    return matriz;
}


public int[][] transformada05(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=0;
    for(int fila=0; fila<matriz.length;fila++){
        for(int columna=matriz[0].length-1; columna>=0;columna--){
            if(contador<=fila){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador++;
            }else{
               matriz[fila][columna]=-1; 
            }
        }
        contador=0;
    }
    return matriz;
}

public int[][] transformada24(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int fila=0;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        if(fila!=-1){
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[fila][columna]=numInit;
                numInit++;
            }
        }else{
            for(fila=0; fila<matriz.length;fila++){
                matriz[fila][columna]=numInit;
                numInit++;
            }            
        }        
    }
    return matriz;
}

public int[][] transformada23(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int fila=0;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        if(fila!=5){
            for(fila=0; fila<matriz.length;fila++){
                matriz[fila][columna]=numInit;
                numInit++;
            }                        
        }else{
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[fila][columna]=numInit;
                numInit++;
            }                      
        }        
    }
    return matriz;
}




public static void main(String[] args) {
   MatricesTransformadas mt=new MatricesTransformadas(); 
   mt.ia.imprimirMatriz(mt.transformada23(5, 0));
}

    
}