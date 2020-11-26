package pe.edu.upeu.utils;

import java.net.URL;

public class UtilsX {
    public URL getFile(String ruta){
        return this.getClass().getResource("/"+ruta);
    } 
    
    public final void clearConsole(){
        try{            
            final String os = System.getProperty("os.name");    
            if (os.contains("Windows")){
               new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else{
                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
            }
        }
        catch (final Exception e){
           System.out.println("Error: "+e.getMessage());
        }
       System.out.println("------------------------------------------------"); 
    }     
}