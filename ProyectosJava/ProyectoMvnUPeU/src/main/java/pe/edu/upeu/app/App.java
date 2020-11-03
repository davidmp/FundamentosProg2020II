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
    static FibonaciMain fib=new FibonaciMain();

    static void rangoFactorial(int numInit, int numFin){
        for(int inicio=numInit;inicio<=numFin;inicio++){
            System.out.println("Factorialx:"+inicio+" es:"+
            fac.calcularFactorialRecur(inicio));
        }
    }

    static void rangoFactorialBig(int numInit, int numFin){
        for(int inicio=numInit;inicio<=numFin;inicio++){
            System.out.println("Factorialy:"+inicio+" es:"+
            fac.calcularFactorialBigRecur(inicio));
        }
    }

    static void seriFibonaciRangoRecur(int numFin){
        for(int inicio=0;inicio<=numFin;inicio++){
            System.out.println("Fibonaci:"+inicio+" es:"+
            fib.fibonaciRecur(inicio));
        }        
    }

    static void seriFibonaciRango(int numFin){
        for(int inicio=0;inicio<=numFin;inicio++){
            System.out.println("Fibonaci:"+inicio+" es:"+
            fib.fibonaci(inicio));
        }        
    }    

//2.432.902.008.176.640.000
    public static void main( String[] args ){        
        //rangoFactorial(5, 20);  
        //rangoFactorialBig(999, 1000);
        seriFibonaciRango(100);
    }
}
