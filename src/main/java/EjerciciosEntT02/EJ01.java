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
public class EJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int gastoMayor = 0;
        int gastoSemana = 0;
        int gastodia;
        int semanaM = 0;
        for (int i = 1; i <= 4; i++) {
            
            for (int j = 1; j <= 7; j++) {
                System.out.println("Introduce el gasto del dia");
                gastodia = s.nextInt();
                gastoSemana += gastodia;
            }
            
            if (gastoSemana > 700) {
                System.out.println("El gasto de la semana " + i + " ha superado "
                        + "los 700€, el gasto total de la semana ha sido de " +
                        gastoSemana + "€");
            }else{
               System.out.println("El gasto de la semana " + i + " no ha superado "
                        + "los 700€, el gasto total de la semana ha sido de " +
                        gastoSemana + "€");
            }
            
            if(gastoSemana > gastoMayor){
                System.out.println("El gasto de esta semana ha sido el mayor de momento");
                gastoMayor = gastoSemana;
                semanaM = i;
            }
            
            gastoSemana = 0;
            
        }
        
        System.out.println("La semana que mas se ha gastado ha sido la semana "
        + semanaM);
        
        s.close();
        
        
        
    }
    
}
