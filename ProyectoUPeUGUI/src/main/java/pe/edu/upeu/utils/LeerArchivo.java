package pe.edu.upeu.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeerArchivo {
    
    public static Path CAMINO;  
    
    public LeerArchivo(String name) {
        String ruta=crearCarpetaRaiz("data").getAbsolutePath();
        CAMINO = Paths.get(ruta+"/"+name);
        crear();
    }    

    public static File crearCarpetaRaiz(String nombreCarpeta){
        File newFolder = new File(nombreCarpeta);
        if(!newFolder.exists() && !newFolder.isDirectory()){
            newFolder.mkdirs();
        }
        return newFolder;
    }
    
    
	public void crear()  {
        try {
            if(!CAMINO.toFile().exists() && !CAMINO.toFile().isFile()){
                CAMINO.toFile().createNewFile();
        }          
        } catch (IOException e) {
            e.getMessage();
        }          		
	}

	
	public void escribir(List lista) throws IOException {		
            if(CAMINO.toFile().exists() && CAMINO.toFile().isFile()){
                 Files.write(CAMINO, lista);
            }else{
                crear();
            }                
	}

	
	public List leer() throws IOException {	    
            if(CAMINO.toFile().exists() && CAMINO.toFile().isFile()){
                 return Files.readAllLines(CAMINO);
            }else{
                crear();
            return null;
            }             
	}   
}