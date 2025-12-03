/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class EJ04EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String a;
        String b;
        
        try {
            System.out.println("Introduce el primer numero: ");
            a = s.nextLine();
            System.out.println("Introduce el segundo numero: ");
            b = s.nextLine();
            
            int n1 = Integer.parseInt(a);
            int n2 = Integer.parseInt(b);
            
            double division = n1/n2;
            
            
        } catch (NumberFormatException e) {
            
            System.out.println("El formato no es correcto: " + e);
            
        }catch (ArithmeticException e){
            
            System.out.println(e);
        
        }
        
        s.close();
    }
    
}
