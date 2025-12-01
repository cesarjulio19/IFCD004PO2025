/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ColeccionesYFicherosA;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author César
 */
public class T03EJ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //><
        Estudiante a = new Estudiante("Cesar", 8);
        Estudiante b = new Estudiante("Maria", 4);
        Estudiante c = new Estudiante("Antonio", 6);
        Estudiante d = new Estudiante("Jessi", 9);
        Estudiante e = new Estudiante("Manolo", 2);
        Map<String, Estudiante> estudiantes = new HashMap<>();
        estudiantes.put(a.getNombre(), a);
        estudiantes.put(b.getNombre(), b);
        estudiantes.put(c.getNombre(), c);
        estudiantes.put(d.getNombre(), d);
        estudiantes.put(e.getNombre(), e);
        
        
        
        estudiantes.entrySet().stream()
           .filter(x -> x.getValue().getNota() >= 5)
           .sorted(Comparator.comparing((Map.Entry<String, Estudiante> x) -> x.getValue().getNota()
            ).reversed())                        
           .map(Map.Entry::getKey)                      
           .forEach(System.out::println);         
    }
    
}
