/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T2Objetos.OEJ01;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class OEJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String a = "";
        ContadorVocales c = new ContadorVocales();
        System.out.println("Introduce una palabra: ");
        
        a = s.next();
        System.err.println("La palabra " + a + " tiene " + c.contarVocales(a) + 
                " vocales");
        
        
        s.close();
    }
    
}
