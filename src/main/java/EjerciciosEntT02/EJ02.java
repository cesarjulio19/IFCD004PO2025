/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosEntT02;

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
        int r1dia = 0;
        int r2dia = 0;
        int r3dia = 0;
        int r1acumulada = 0;
        int r2acumulada = 0;
        int r3acumulada = 0;
        
        for (int i = 1; i <= 5; i++) {
            
            System.out.println("Introduces las repeticiones del primer ejercicio"
                    + " del dia " + i);
            r1dia = s.nextInt();
            r1acumulada += r1dia;
            
            System.out.println("Introduces las repeticiones del segundo ejercicio"
                    + " del dia " + i);
            r2dia = s.nextInt();
            r2acumulada += r2dia;
            
            System.out.println("Introduces las repeticiones del tercer ejercicio"
                    + " del dia " + i);
            r3dia = s.nextInt();
            r3acumulada += r3dia;
            
            System.out.println("El total de repeticiones en el dia " + i + 
                    " ha sido de " + (r1dia + r2dia + r3dia));
            
            if((r1dia + r2dia + r3dia) > 50){
                System.out.println("Has superado las 50 repeticiones al dia con "
                + (r1dia + r2dia + r3dia) + " repeticiones");
            }else if((r1dia + r2dia + r3dia) == 50){
                System.out.println("Has conseguido 50 repeticiones en el dia");
            }else{
                System.out.println("No has conseguido las 50 repeticiones diarias,"
                        + " has conseguido un total de " + (r1dia + r2dia + r3dia)
                + " repeticiones");
            }
            
            r1dia = 0;
            r2dia = 0;
            r3dia = 0;
            
        }
        
        System.out.println("El promedio de repeticiones del ejercicio uno en 5"
                + " dias es de " + (r1acumulada/5) + " repeticiones");
        
        System.out.println("El promedio de repeticiones del ejercicio dos en 5"
                + " dias es de " + (r2acumulada/5) + " repeticiones");
        
        System.out.println("El promedio de repeticiones del ejercicio tres en 5"
                + " dias es de " + (r3acumulada/5) + " repeticiones");
        
        s.close();
    }
    
}
