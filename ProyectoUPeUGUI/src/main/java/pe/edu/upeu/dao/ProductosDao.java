package pe.edu.upeu.dao;

import pe.edu.upeu.data.CrudFileRepository;
import pe.edu.upeu.modelo.Productos;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;
import pe.edu.upeu.utils.UtilsX;

public class ProductosDao extends CrudFileRepository{

LeerTeclado leerTecla=new LeerTeclado();
UtilsX util=new UtilsX();
LeerArchivo leerArc;
Productos productos;




public Object[][] agregarProducto(){
    leerArc=new LeerArchivo("Productos.txt");
    productos=new Productos();
    productos.setiDProducto(generarId(leerArc, 0, "P", 1));
    productos.setNombreProducto(leerTecla.leer("", "Ingrese el nombre del Producto:"));
    productos.setUnidadMedida(leerTecla.leer("", "Ingrese la unidad de medida:"));
    productos.setPrecio(leerTecla.leer(0.0, "Ingrese el unitario del Producto:"));
    productos.setStock(leerTecla.leer(0.0, "Ingrese la cantidad de Productos:"));

    return agregarContenido(leerArc, productos);
}

public void reportarProductos(){
    leerArc=new LeerArchivo("Productos.txt");
    System.out.println("******************Reporte general de Productos***********");
    imprimirLista(listarContenido(leerArc));
}

public Object[][] eliminarProducto(String idDato){
    leerArc=new LeerArchivo("Productos.txt");
    return eliminarRegistros(leerArc, 0, idDato);     
}

public Object[][] modificarProducto(){
    leerArc=new LeerArchivo("Productos.txt");
    imprimirLista(listarContenido(leerArc));
    System.out.println("**************Modificar Producto************");
    String datoId=leerTecla.leer("", "Ingrese el Id del Producto a Modificar:");
    Productos prod=new Productos();
    prod.setNombreProducto(leerTecla.leer("","Ingrese el nuevo Nombre del Producto:"));
    prod.setStock(leerTecla.leer(0.0, "Ingrese la nueva cantidad:"));    
    return editarRegistro(leerArc, 0, datoId, prod);
}



}