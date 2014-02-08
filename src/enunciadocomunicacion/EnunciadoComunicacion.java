/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enunciadocomunicacion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jader
 */
public class EnunciadoComunicacion {

    public static void main(String[] args) throws IOException {
       
        File archivo=new File("C:\\Users\\Jader\\Desktop\\Enunciado\\enunciado8.jpg");
        archivo.createNewFile();
        
        FileWriter escribir=new FileWriter(archivo);
        String texto=JOptionPane.showInputDialog("Enunciado");
        escribir.append(texto);
        escribir.flush();
        escribir.close();
        /*
        System.out.println(archivo.getAbsolutePath());           
        if(archivo.exists())
        {
            System.out.println("Se creó el archivo");
        }
        else
        {
            System.out.println("No existe");
            archivo.createNewFile();
        }*/
    }
}
