package pe.edu.upeu.core;

public class ArreglosMain{

    public  void imprimirVector(Object[] vector){
        for(int indice=0; indice<vector.length;indice++){
            System.out.println("posicion["+indice+"]="+vector[indice]);
        }
    }
    public  void imprimirVector(int[] vector){
        for(int indice=0; indice<vector.length;indice++){
            System.out.println("posicion["+indice+"]="+vector[indice]);
        }
    }

    public void otroEjercicio(){
        
    }

    
    public int[] calcular100PNumCuadrados(){
        int[] resultados=new int[100];
        for(int indice=0;indice<resultados.length; indice++){
            resultados[indice]=(indice+1)*(indice+1);
        }
        return resultados;
    }



    public void introduccionVector(){
        System.out.println("conceptos de vectores");

        int[] datos1;
        datos1=new int[5];
        datos1[0]=5;
        datos1[1]=10;
        datos1[4]=20;

        System.out.println("datos[4]="+datos1[4]);

        int[] datos2=new int[5];

        int[] datos3=new int[]{5,6,7,8,9,10};
        System.out.println("Tamanho datos3="+datos3.length);
        imprimirVector(datos3);
        System.out.println("");
        String[] frutas=new String[]{"Uva","Manzana", "Papaya", "Pera", "Melocotones"};
        imprimirVector(frutas);        
    }


    public  void imprimirMatriz(Object[][] matriz){
        for(int filaSubInd=0; filaSubInd<matriz.length;filaSubInd++){
            for(int columSubInd=0; columSubInd<matriz[0].length;columSubInd++){
                System.out.print(matriz[filaSubInd][columSubInd]+"\t");
            }
            System.out.println();
        }
    }
    public   void imprimirMatriz(int[][] matriz){
        for(int filaSubInd=0; filaSubInd<matriz.length;filaSubInd++){
            for(int columSubInd=0; columSubInd<matriz[0].length;columSubInd++){
                System.out.print(matriz[filaSubInd][columSubInd]+"\t");
            }
            System.out.println();
        }
    }

    public  void introduccionMatrices(){
        //DEfinir Matriz
        int[][] M;
        //Definir Tamanho de Matriz
        M=new int[4][3];

        //Colocar un valor en alguna posicion de la matriz
        M[2][0]=5;
        //Imprimir valor de la Matriz de la posicion 2,0
        System.out.println(M[2][0]);

        // Definir matriz con valores asignadas
        int[][] matrizX =new int[][]{
            {5,6,2},
            {5,6,2},
            {5,6,2},
            {5,6,2}
        };
        System.out.println("Imprimiendo Matriz  Tamanho Filas:="+ matrizX.length+"  Tamanho Columnas:="+matrizX[0].length);
        imprimirMatriz(matrizX);

    }

    public Object[][] matrizProductos(Object[][] tempMP){
        Object[][] mProductos=new Object[tempMP.length][tempMP[0].length];
        for(int filaSubInd=0; filaSubInd<tempMP.length;filaSubInd++){
            for(int columSubInd=0; columSubInd<tempMP[0].length;columSubInd++){
                mProductos[filaSubInd][columSubInd]=tempMP[filaSubInd][columSubInd];
            }            
        }
        return mProductos;
    }

    public Object[][] llenadoMatriz(){        
        Object[][] tempMP=new Object[][]{
            {"P0001","Manzana",	3,	50,},
            {"P0002", "Pera",	4,	20},
            {"P0003","Naranza",	2,	2}
        };
        return matrizProductos(tempMP);
    }
   


}