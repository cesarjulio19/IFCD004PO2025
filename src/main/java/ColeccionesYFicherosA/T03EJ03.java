/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ColeccionesYFicherosA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author César
 */
public class T03EJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        List<Libros> libros = new ArrayList();
        String linea;
        String autorBuscado = "Gabriel García Márquez";
        BufferedReader br = new BufferedReader(new FileReader("libros.txt"));
        
        while ((linea = br.readLine()) != null) {
            
            String[] partes = linea.split(","); 
    
            String titulo = partes[0].trim();
            String autor = partes[1].trim();
    
            libros.add(new Libros(titulo, autor));
        }
        br.close();
        
        libros.stream()
        .filter(l -> l.getAutor().equalsIgnoreCase(autorBuscado))
        .map(Libros::getTitulo)
        .forEach(l -> System.out.println(l));
    }
    
}
