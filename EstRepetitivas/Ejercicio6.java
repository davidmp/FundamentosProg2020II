package EstRepetitivas;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    static Scanner cs=new Scanner(System.in);
    static Random rnd= new Random();
    static void calcularInversionFinAnho(){
        double interes=0.02, montoInvertir=0, interesMes=0;
        int contadorMes=0;
        //Datos de entrada
        System.out.println("Ingrese el monto a invertir:");
        montoInvertir=cs.nextDouble();
        //Proceso
        while(contadorMes<12){
            interesMes=montoInvertir*interes;
            montoInvertir=montoInvertir+interesMes;
            contadorMes++;           
        }
        //Datos de salida
        System.out.println("El monto de dinero que tiene al cabo de un anho es: "+montoInvertir);
    }

    static void cantidadNumCeroMenorCeroMayorCero(){
        int cero=0, menorCero=0, mayorCero=0, nCantidad=0;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de numeros a evaluar:");
        nCantidad=cs.nextInt();
        int numero=0;
        //Proceso
        for(int initNcant=1;initNcant<=nCantidad;initNcant++){
            numero=rnd.nextInt(100)-50;
            System.out.println("posicion "+initNcant+": "+numero);
            if (numero==0){
                cero=cero+1;
            }else if(numero>0){
                mayorCero=mayorCero+1;
            }else{
                menorCero=menorCero+1;
            }
        }
        //datos de salida
        System.out.println("La cantidad de numeros ceros es: "+cero);
        System.out.println("La cantidad de numeros mayores de cero es: "+mayorCero);
        System.out.println("La cantidad de numeros menores a cero: "+menorCero);
        
    }


    public static void main(String[] args) {
        //calcularInversionFinAnho();
        cantidadNumCeroMenorCeroMayorCero();
    }
}
