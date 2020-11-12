package pe.edu.upeu.core;

public class Reportes {
   
    public Object[][] reporteDatos(){

        Object[][] data=new Object[][]{
            {1, "Celular", 20, 560.50, "Huawei"},
            {2, "Laptop", 10, 1500, "Samsung"},
            {3, "Celular", 20, 560.50, "Huawei"},
            {4, "Celular", 20, 560.50, "Huawei"}
        };        
        return data;
    }

    public void imprimirMatriz(Object[][] data){
        String[] columnas=new String[] {"ID", "Producto", "Cantidad", "Precio", "Marca"};
        System.out.println(columnas[0]+"\t"+columnas[1]+"\t"+columnas[2]+"\t"+columnas[3]+"\t"+columnas[4]);
        for (Object[] objects : data) {
            System.out.println(objects[0]+"\t"+objects[1]+"\t"+objects[2]+"\t"+objects[3]+"\t"+objects[4]);
        }
    }

}