/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Librerias;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author César
 */
public class T03EJ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        
        LocalDate[] fechas = new LocalDate[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce la fecha futura" + (i + 1) + " (AAAA-MM-DD): ");
            String fecha = s.nextLine();
            fechas[i] = LocalDate.parse(fecha);
        }
        
        LocalDate hoy = LocalDate.now();
        
        for (int i = 0; i < 4; i++) {
            long dias = ChronoUnit.DAYS.between(hoy, fechas[i]);
            System.out.println("Fecha " + (i + 1) + ": faltan " + dias + " días");
        }
        
        s.close();
        
        
    }
    
}
