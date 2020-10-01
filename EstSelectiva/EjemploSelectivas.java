package EstSelectiva;

import java.util.Scanner;

public class EjemploSelectivas{
static Scanner teclado = new Scanner(System.in);

    public static void calificacionCualitativa() {
        int calCuant=0;
        String calCualt="";
        //datos de entrada
        System.out.println("Ingrese la nota numerica:");
        calCuant=teclado.nextInt();
        //Proceso
        switch(calCuant){
            case 10: calCualt="A"; break;
            case 9: calCualt="B"; break;
            case 8: calCualt="C"; break;
            case 7: calCualt="D";break;
            case 6: calCualt="D";break;
            case 5: calCualt="F";break;
            case 4: calCualt="F";break;
            case 3: calCualt="F";break;
            case 2: calCualt="F";break;
            case 1: calCualt="F";break;
            case 0: calCualt="F";break;
            default: System.out.println("Opcion no existe");
        }
        //Datos de salida
        System.out.println("La calificacion cualitativa de "+calCuant+" es:"+calCualt);
    }

    public static void main(String[] a) {
        System.out.println("Hola Mundo");
        calificacionCualitativa();
    }
}