package pe.edu.upeu.core;

import java.math.BigInteger;

public class FibonaciMain {
    
    public int fibonaciRecur(int n){
        if(n<0){return -1;}
        if(n==0 ||n==1){return n;}else{
            return fibonaciRecur(n-1)+fibonaciRecur(n-2);
        }
    }


    public int fibonaci(int n){
       int val1=0, val2=1;  
       int resultado=0;     
       if(n<0){resultado=-1;} 
       if(n==0 ||n==1){resultado=n;}
       else{
            for(int val=1;val<n; val++){
                resultado=val1+val2;
                val1=val2;
                val2=resultado;                
            }
       }
       return resultado;
    }


    public BigInteger fibonaciBig(int n){
        BigInteger val1=BigInteger.valueOf(0);
        BigInteger val2=BigInteger.valueOf(1);
        BigInteger resultado=BigInteger.valueOf(0);           
        if(n<0){resultado=BigInteger.valueOf(-1);} 
        if(n==0 ||n==1){resultado=BigInteger.valueOf(n);}
        else{
             for(int val=1;val<n; val++){
                 resultado=val1.add(val2);
                 val1=val2;
                 val2=resultado;                
             }
        }
        return resultado;
     }



}
