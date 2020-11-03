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

    public long calcularFactorialRecur(long numero){
        if(numero>=1){
            return numero*calcularFactorialRecur(numero-1);           
        }else{
            return 1;
        }        
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
    
    public BigInteger calcularFactorialBigRecur(int numero) {        
        BigInteger resultado=BigInteger.valueOf(1);
        if(numero>0){
            resultado=(BigInteger.valueOf(numero)).multiply(calcularFactorialBigRecur(numero-1));
        }       
        return resultado;
    }       
    


}
