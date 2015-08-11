
package CapaMetodos;
import java.io.*;

public class GestionA {
    
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    public GestionA(){
        
    }
    
    /*Abrir un archivo de Texto*/
     public String AbrirTexto(File archivo){
        String contenido = "";
        try{
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1){
                char caracter = (char)ascci;
                contenido += caracter;
            }
        }catch(Exception e){
            
        }
        return contenido;
    }
    
     
    /*Guardar un archivo de texto*/
    public String GuardarATexto(File archivo, String contenido){
        String respuesta=null;
        
        try{
            salida = new FileOutputStream(archivo);
            byte[] bytesText = contenido.getBytes();
            salida.write(bytesText);
            respuesta = "Se guardo con exito el archivo";
        }catch(Exception e){
            
        }
        
        return respuesta;
    }
    
    /* Metodos para abrir una imagen*/
    public byte[] AbrirImagen(File archivo){
        byte[] bytesImg = new byte[1024*100];
        try{
            entrada = new FileInputStream(archivo);
            entrada.read(bytesImg);
        }catch(Exception e){
            
        }
        
        return bytesImg;
    }
    
    /*Guardar imagen*/
    public String GuardarAImagen(File archivo, byte[] bytesImg){
        String respuesta = null;
        
        try{
            salida = new FileOutputStream(archivo);
            salida.write(bytesImg);
            respuesta = "La imagen se guardo con exito";
        }catch(Exception e){
            
        }
        
        return respuesta;
    }
    
}


