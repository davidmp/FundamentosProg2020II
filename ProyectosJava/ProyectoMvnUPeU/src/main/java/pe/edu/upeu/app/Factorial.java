package pe.edu.upeu.app;

import java.math.BigInteger;

public class Factorial {
    
    public void calcularFactorial(int numero){
        int contador=1;
        long resultado=1;
        if(numero>1){resultado=numero;}
        while(contador<numero){
            resultado=resultado*contador;
            contador++;
        }
        System.out.println("El factorial de "+numero+" es "+resultado+"");
    }    

    public void calcularFactorialBig(int numero) {
        int contador=1;
        BigInteger resultado=BigInteger.valueOf(1);

        if(numero>1){resultado=BigInteger.valueOf(numero);}
        while(contador<numero){
            resultado=resultado.multiply(BigInteger.valueOf(contador));
            contador++;
        }
        System.out.println("El factorial de "+numero+" es "+resultado+"");
    }    

}
