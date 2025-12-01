/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ColeccionesYFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author César
 */
public class T05EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //><
        BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
        
        String linea;

        while ((linea = br.readLine()) != null) {
            
            System.out.println(linea);
            
        }
    }
    
}
