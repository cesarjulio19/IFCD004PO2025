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
public class EJ05EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Introduce tu edad: ");
            String e = s.nextLine();
            int edad = Integer.parseInt(e);
            validarEdad(edad);
            
            
        } catch (NumberFormatException e) {
            
            System.out.println("El formato no es correcto: " + e);
            
        } catch (EdadInvalidadaException e){
            
            System.out.println(e.getMessage());
        
        }
        
        s.close();
    }
    
    static void validarEdad(int edad) throws EdadInvalidadaException {
        
        if (edad < 18) throw new EdadInvalidadaException("Debe ser mayor de edad");
    }
    
}
