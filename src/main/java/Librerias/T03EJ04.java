/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Librerias;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalTime;

/**
 *
 * @author César
 */
public class T03EJ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int suma = 0;
        int[] array = new int[6];
        LocalDate fecha_sorteo;
        LocalTime hora_sorteo;
        int max = 0;
        int min = 0;
        
        for (int i = 0; i < 6; i++) {
            array[i] = (int)(Math.random() * 60) + 1;
            System.out.println(array[i]);
            suma += array[i];
            if (i == 0) {
                max = array[i];
                min = array[i];
            }else{
                max = Math.max(max, array[i]);
                min = Math.min(min, array[i]);
            
            }
            
            
        }
        
        System.out.println("Introduce una fecha del sorteo (AAAA-MM-DD)");
        String fecha = s.nextLine();
        
        fecha_sorteo = LocalDate.parse(fecha);
        
        System.out.println("Introduce la hora del sorteo HH:mm : ");
        String hora = s.nextLine();
        hora_sorteo = LocalTime.parse(hora);
        
        System.out.println("La fecha y hora del sorteo es: " + fecha_sorteo + " " + hora_sorteo);
        System.out.println("El valor mayor es : " + max);
        System.out.println("El valor menor es : " + min);
        System.out.println("La suma de todos los numeros es : " + suma);
        
       
        s.close();
        
    }
    
}
