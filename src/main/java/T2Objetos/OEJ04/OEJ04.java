/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T2Objetos.OEJ04;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class OEJ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String palabra;
        InvertirTexto i = new InvertirTexto();
        System.out.println("Introduce una palabra:");
        palabra = s.next();
        System.out.println("La palabra invertida es " + i.invertir(palabra));
        
        s.close();
    }
    
}
