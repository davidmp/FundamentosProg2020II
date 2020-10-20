package EstRepetitivas;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialE{

    static Scanner cs=new Scanner(System.in);


    public static void calcularFactorial(int numero){
        int contador=1;
        long resultado=1;
        if(numero>1){resultado=numero;}
        while(contador<numero){
            resultado=resultado*contador;
            contador++;
        }
        System.out.println("El factorial de "+numero+" es "+resultado+"");
    }

    public static void calcularFactorialBig(int numero) {
        int contador=1;
        BigInteger resultado=BigInteger.valueOf(1);

        if(numero>1){resultado=BigInteger.valueOf(numero);}
        while(contador<numero){
            resultado=resultado.multiply(BigInteger.valueOf(contador));
            contador++;
        }
        System.out.println("El factorial de "+numero+" es "+resultado+"");
    }

    public static void rangoFactorial(int numfinal) {
        for(int inicio=0;inicio<=numfinal;inicio++){
            calcularFactorialBig(inicio);
        }
    }

    public static void main(String[] args) {        
        rangoFactorial(cs.nextInt());
    }
}