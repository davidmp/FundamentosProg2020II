package pe.edu.upeu.core;

public class ArreglosMain{

    public  void imprimirVector(Object[] vector){
        for(int indice=0; indice<vector.length;indice++){
            System.out.println("frutas["+indice+"]="+vector[indice]);
        }
    }
    public  void imprimirVector(int[] vector){
        for(int indice=0; indice<vector.length;indice++){
            System.out.println("frutas["+indice+"]="+vector[indice]);
        }
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


}