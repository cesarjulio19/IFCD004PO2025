/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Librerias;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author César
 */
public class T03EJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        
        LocalTime[] horas = new LocalTime[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce una hora HH:mm : ");
            String hora = s.nextLine();
            
            horas[i] = LocalTime.parse(hora);
            
        }
        
        LocalTime pHora = horas[0];
        System.err.println("Diferencia entre las horas y la primera:");
        for (int i = 0; i < 3; i++) {
            long diferencia = ChronoUnit.MINUTES.between(pHora, horas[i]);
            System.out.println("Hora " + (i + 1) + ": " + diferencia + " minutos");
        }
        
        s.close();
    }
    
}
