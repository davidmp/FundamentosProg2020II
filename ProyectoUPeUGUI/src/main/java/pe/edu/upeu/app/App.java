package pe.edu.upeu.app;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upeu.core.ArreglosMain;
import pe.edu.upeu.core.FibonaciMain;
import pe.edu.upeu.core.Reportes;
import pe.edu.upeu.dao.ProductosDao;
import pe.edu.upeu.gui.MainGUI;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;
import pe.edu.upeu.utils.UtilsX;

/**
 * Hello world!
 *
 */
public class App{

    static LeerTeclado teclado=new LeerTeclado();
    static Console cons=System.console();
    static FibonaciMain fib=new FibonaciMain();
    static Reportes rep=new Reportes();
    static ArreglosMain armain=new ArreglosMain();    
    static UtilsX util=new UtilsX();
    static public void crearArchivo(String nombre){
           LeerArchivo la=new LeerArchivo(nombre);
            try {
                List list = new ArrayList<String>();
                list.add("P001	Papa	Kilos	2.5	30");
                list.add("P002	Manazana	Kilos	3	48");
                la.escribir(list);    
                
                List listaLectura=la.leer();
                System.out.println("Contenido de Productos");
                System.out.println(listaLectura);
                
            } catch (Exception e) {
                System.out.println("Error al escribir registros");
            }
    }

    static void menuOpciones(){
        System.out.println( "*********************Bienvenidos al Sistema********************" );
        
        char opcion='S';
        int numeroAlgoritmo=1;
        do{
            String datos="Seleccion la opción que desea:\n"+
            "1=Algoritmo Fibonci Normal \n"+
            "2=Finonaci Entorno Escritorio \n"+
            "3=Imprimir Productos \n"+
            "4=Concepto Vectores \n"+
            "5=Vector de numeros al Cuadrado \n"+
            "6=Introduccion Matrices \n"+
            "7=Imprimir Productos \n"+
            "8=Crear Archivo Contenido \n"+
            "9=Agregar Producto \n"+
            "10=Eliminar Producto \n"+
            "11=Modificar Registro de Productos \n";
            ProductosDao daoProd;
            numeroAlgoritmo=teclado.leer(0, datos);
            switch(numeroAlgoritmo){
                case 1: System.out.println(fib.fibonaci(4));;break;
                case 2: new MainGUI();break;
                case 3: rep.imprimirMatriz(rep.reporteDatos());break;
                case 4: armain.introduccionVector();break;
                case 5: armain.imprimirVector(armain.calcular100PNumCuadrados());break;
                case 6: armain.introduccionMatrices();break;
                case 7: armain.imprimirMatriz(armain.llenadoMatriz());break;
                case 8: crearArchivo(teclado.leer("file.txt", "Ingrese el nombe del archivo que desea crear"));break;
                case 9: { 
                    daoProd=new ProductosDao();
                    daoProd.agregarProducto();
                    daoProd.reportarProductos();
                }break;
                case 10: { 
                    daoProd=new ProductosDao();                    
                    daoProd.reportarProductos();
                    daoProd.eliminarProducto(
                        teclado.leer("","Ingrese el Id del Producto a Eliminar"));
                    daoProd.reportarProductos();
                }break;      
                case 11: { 
                    daoProd=new ProductosDao();
                    daoProd.modificarProducto();
                    util.clearConsole();
                    daoProd.reportarProductos();
                }break;                            
                default : System.out.println("La opción que selecciono no existe"); 
            }
            opcion=teclado.leer(' ', "Desea probar otras opciones? SI=S, NO=N");
        }while(opcion=='S' || opcion=='s');

    }

    static boolean login(){
        String usuario=teclado.leer("", "Ingrese el Usuario:");
        System.out.println("Ingrese su clave:");
        char[] clave=cons.readPassword();
        if(usuario.equals("davidmp") && String.valueOf(clave).equals("123456")){
            menuOpciones();
            return true;
        }else{ 
            System.err.println("Intente Nuevamente ...!!!");
            login();
            return false;}        
    }


    public static void main( String[] args ){        
        
        util.clearConsole();
        System.out.println("-----Ingrese su usuario y clave para acceder al Sistema---");
        login();

    }
}
