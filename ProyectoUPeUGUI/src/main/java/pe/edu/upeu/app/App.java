package pe.edu.upeu.app;

import java.io.Console;

import pe.edu.upeu.core.ArreglosMain;
import pe.edu.upeu.core.FibonaciMain;
import pe.edu.upeu.core.Reportes;
import pe.edu.upeu.gui.MainGUI;
import pe.edu.upeu.utils.LeerTeclado;

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
            "7=Imprimir Productos \n";

            numeroAlgoritmo=teclado.leer(0, datos);
            switch(numeroAlgoritmo){
                case 1: System.out.println(fib.fibonaci(4));;break;
                case 2: new MainGUI();break;
                case 3: rep.imprimirMatriz(rep.reporteDatos());break;
                case 4: armain.introduccionVector();break;
                case 5: armain.imprimirVector(armain.calcular100PNumCuadrados());break;
                case 6: armain.introduccionMatrices();break;
                case 7: armain.imprimirMatriz(armain.llenadoMatriz());break;
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
        System.out.println("-----Ingrese su usuario y clave para acceder al Sistema---");
        login();

    }
}
