/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ColeccionesYFicheros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author César
 */
public class T03EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        List<String> lista = new ArrayList<>();
        lista.add("cesar");
        lista.add("pablo");
        lista.add("antonio");
        lista.add("rocio");
        lista.add("manolo");
        
        lista.forEach(nombre -> System.out.println(nombre));
        
        lista.remove("pablo");
        
        lista.forEach(nombre -> System.out.println(nombre));
    }
    
}
