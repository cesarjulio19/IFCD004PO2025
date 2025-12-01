/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Librerias;

import java.time.LocalDate;
import java.time.Period;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T03EJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        LocalDate[] dates = new LocalDate[3];
        int[] edades = new int[3];
        String fecha_nacimiento;
        LocalDate actual = LocalDate.now();
        int edad1 = 0;
        int edad2 = 0;
        int edad3 = 0;
        int edad_mayor = 0;
        int edad_menor = 0;
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce una fecha de nacimiento (AAAA-MM-DD)");
            fecha_nacimiento = s.nextLine();
            dates[i] = LocalDate.parse(fecha_nacimiento);
            if (i == 0) {
                edad1 = Period.between(dates[i], actual).getYears();
                System.err.println(edad1 + " años");
                edad_mayor = edad1;
                edad_menor = edad1;
            }else if (i == 1) {
                edad2 = Period.between(dates[i], actual).getYears();
                System.err.println(edad2 + " años");
                if(edad_mayor < edad2){
                    edad_mayor = edad2;
                    
                }
                
                if (edad_menor > edad2) {
                     edad_menor = edad2;
                }
                
            }else{
                edad3 = Period.between(dates[i], actual).getYears();
                System.err.println(edad3 + " años");
                if(edad_mayor < edad3){
                    edad_mayor = edad3;
                    
                }
                
                if (edad_menor > edad3) {
                     edad_menor = edad3;
                }
                
            }
            
            
        }
        
        System.err.println("La edad mayor es: " + edad_mayor);
        System.err.println("La edad menor es: " + edad_menor);
        s.close();
       
    }
    
}
