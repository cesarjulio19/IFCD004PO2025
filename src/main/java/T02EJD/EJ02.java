/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02EJD;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class EJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        float horasTrabajadas;
        
        System.out.println("Introduce las horas trabajadas: ");
        horasTrabajadas = s.nextFloat();
       
        if (horasTrabajadas >= 8.0) {
            System.out.println("Has cumplido la jornada laboral");
            if (horasTrabajadas > 8.0) {
                System.out.println("Han sobrado " + (horasTrabajadas - 8.0) + " horas");
                
            }
            
        }else{
            System.out.println("No has alcanzado las horas laborales, faltan " +
                    (8.0 - horasTrabajadas) + " horas");
        }
        
        s.close();
        
    }
    
}
