package pe.edu.upeu.app;

import java.util.Scanner;

import pe.edu.upeu.utils.LeerTeclado;

/**
 * Hello world!
 *
 */
public class App{    
    static LeerTeclado lt=new LeerTeclado();//Obj Global
    static Factorial fac=new Factorial();//Obj Global

    static void rangoFactorial(int numInit, int numFin){
        for(int inicio=numInit;inicio<=numFin;inicio++){
            fac.calcularFactorialBig(inicio);
        }
    }

    public static void main( String[] args ){
        
        String nombre=lt.leer("", "Ingrese su nombre:");
        System.out.println("Nombre es:"+nombre);       
        
        int edad=lt.leer(0, "Ingrese su edad:");
        System.out.println("Edad es:"+edad);
        
        String celular=lt.leer("", "Ingrese su num. celular:");
        System.out.println("Celular es:"+celular); 
        
        String descripcion=lt.leer("", "Ingrese su descripcion:");   
        System.out.println("Descripcion es:"+descripcion); 

        //rangoFactorial(10, 60);  
        
        

    }
}
