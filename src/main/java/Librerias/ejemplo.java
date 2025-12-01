/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Librerias;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author César
 */
public class ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd/MM/yyyy"); // 24/11/2025
        LocalDate[] fnac = new LocalDate[3];        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce la fecha  "+(i+1)+":");
            fnac[i]= LocalDate.parse(sc.next(),f); //default (yyyy-MM-dd) to (dd/MM/yyyy)
        }
        
        LocalDate mayor = fnac[0];
        LocalDate menor = fnac[0];
        
        for (int i = 0; i < 3; i++) {
            if(mayor.isBefore(fnac[i])){
                mayor = fnac[i];
            }
            if(menor.isAfter(fnac[i])){
                menor = fnac[i];
            }
        }
        
        System.out.println("El mayor nace: "+mayor.toString()+" El menor nace: "+ menor.toString());
    }
    
}
