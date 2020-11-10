package pe.edu.upeu.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeerTeclado {
    BufferedReader leerT=new BufferedReader(new InputStreamReader(System.in));

    public int leer(int dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=Integer.parseInt(leerT.readLine());
        } catch (Exception e) {
            System.err.println(e.getMessage());
            leer(dato, mensaje);
        }
        return dato;
    }

    public double leer(double dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=Double.parseDouble(leerT.readLine());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }

    public char leer(char dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=leerT.readLine().charAt(0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }

    public String leer(String dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=leerT.readLine();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }    

}
