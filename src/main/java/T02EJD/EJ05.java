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
public class EJ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int registros = 0;
        long sumaPasos = 0;
        long pasos;
        
        do {            
            System.out.println("Introduce los pasos que has dado: ");
            pasos = s.nextLong();
            sumaPasos += pasos;
            registros++;
            
        } while (sumaPasos < 10000);
        
        System.out.println("Registros realizados: " + registros);
        
        if (sumaPasos == 10000) {
            System.out.println("Has alcanzado la meta exacta");
        }else System.out.println("Has pasado la meta con " + (sumaPasos - 10000) + " pasos de sobra");
        
        s.close();
    }
    
}
