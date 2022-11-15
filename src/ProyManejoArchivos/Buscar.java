/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyManejoArchivos;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author BGEscalante
 */
public class Buscar {
   
        //Carpeta del usuario
     String sCarpAct = System.getProperty("user.dir");
    //System.out.println("Carpeta del usuario = " + sCarpAct);

    //Listemos todas las carpetas y archivos de la carpeta actual
    
    //en una clase para poder apartar 
public void buscar(String dir){
    System.out.println( " LISTADO SIMPLE" );
    File carpeta = new File(dir);
    String[] listado = carpeta.list();
    if (listado == null || listado.length == 0) {
      System.out.println("No hay elementos dentro de la carpeta actual");
      return ;
    }
    else {
      for (int i=0; i< listado.length; i++) {
         if (listado[i].endsWith(".pdf") || listado[i].endsWith(".PDF")){ /// verifica si es pdf o no
            System.out.println(listado[i]);
            
          // return listado[i];
           

         }
      }
    }
   // return null;
}

    //Lo mismo que lo anterior pero con objetos File para poder ver sus propiedades
public void buscar1(String dir){
    System.out.println("LISTADO CON OBJETOS File" );
    File carpeta = new File(dir);
    File[] archivos = carpeta.listFiles();
    String[] listado = carpeta.list();
   
    if (archivos == null || archivos.length == 0) {
      System.out.println("No hay elementos dentro de la carpeta actual");
      return;
    }
    else {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      
      for (int i=0; i< archivos.length; i++) {
           if (listado[i].endsWith(".pdf") || listado[i].endsWith(".PDF")){ /// verifica si es pdf o no
        File archivo = archivos[i];
        System.out.println(String.format("%s (%s) - %d - %s", 
                                          archivo.getName(), 
                                          archivo.isDirectory() ? "Carpeta" : "Archivo",
                                          archivo.length(),
                                          sdf.format(archivo.lastModified())
                                                          
                                          ));
      }
    }
    }
}

    //Se pueden filtrar los resultados tanto usando list() como usando listFiles()
    //Por ejemplo, en este segundo caso para mostrar solo archivos y no carpetas
public void buscar2(String dir){
    System.out.println("LISTADO CON FILTRO APLICADO - SOLO ARCHIVOS" );
    File carpeta = new File(dir);
     String[] listado = carpeta.list();
    File[] archivos = carpeta.listFiles();
    FileFilter filtro = new FileFilter() {
      @Override
      public boolean accept(File arch) {
        return arch.isFile();
      }
    };

    archivos = carpeta.listFiles(filtro);

    if (archivos == null || archivos.length == 0) {
      System.out.println("No hay elementos dentro de la carpeta actual");
      return;
    }
    else {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      for (int i=0; i< archivos.length; i++) {
         //if (listado[i].endsWith(".pdf") || listado[i].endsWith(".PDF")){ /// verifica si es pdf o no xd
        File archivo = archivos[i]; 
        
        System.out.println(String.format("%s (%s) - %d - %s", 
                                           
                                          archivo.getName(), 
                                          archivo.isDirectory() ? "Carpeta" : "Archivo",
                                          archivo.length(),
                                          sdf.format(archivo.lastModified())
                                          ));
     // }
    }
    }

}

    public String LecturaVersion(File dir)
       {
            String version="";
            File Dir = dir;

             try {
                RandomAccessFile archivo = new RandomAccessFile(Dir,"r");

              version=archivo.readLine();
                archivo.close();
                //regresamos 300 bytes para buscar la posicion de la tabla de las referencias


                }
              catch (FileNotFoundException ex) {

                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        return version; 
       }

    }
    
    
//}
