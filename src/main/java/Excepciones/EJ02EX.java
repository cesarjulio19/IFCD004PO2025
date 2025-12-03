/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class EJ02EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n;
        
        try {
            System.out.println("Introduce un numero");
            n = s.nextLine();
            int a = Integer.parseInt(n);
            
        } catch (NumberFormatException e) {
            
            System.out.println("Formato incorrecto: " + e);
            
        }
        
        s.close();
    }
    
}
