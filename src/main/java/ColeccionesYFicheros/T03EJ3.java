/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ColeccionesYFicheros;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author César
 */
public class T03EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "papas");
        mapa.put(2, "agua");
        mapa.put(3, "manzana");
        mapa.put(4, "platano");
        mapa.put(5, "sandia");
        
        System.out.println(mapa.get(2));
        
        mapa.forEach((clave, valor) -> System.out.println("Clave: " + clave + ", Valor: " + valor));
    }
    
}
