/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ColeccionesYFicheros;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author César
 */
public class T03EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(4);
        conjunto.add(5);
        
        conjunto.forEach(num -> System.out.println(num));
        
    }
    
}
