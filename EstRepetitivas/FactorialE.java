package EstRepetitivas;

public class FactorialE{

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

    public static void rangoFactorial(int numfinal) {
        for(int inicio=0;inicio<=numfinal;inicio++){
            calcularFactorial(inicio);
        }
    }

    public static void main(String[] args) {        
        rangoFactorial(25);
    }
}