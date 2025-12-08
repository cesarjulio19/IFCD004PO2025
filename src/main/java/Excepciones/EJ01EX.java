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
public class EJ01EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a;
        int b;
        try {
            System.out.println("Introduce el primer numero");
            a = s.nextInt();
            System.out.println("Introduce el segundo numero");
            b = s.nextInt();
            
            double d = a/b;
            
        } catch(ArithmeticException e){
            
            System.out.println(e);
                
        }catch (InputMismatchException e){
            
            System.out.println("No has introducido un numero entero " + e);
        
        }
        
        s.close();
        
    }
    
}
    

