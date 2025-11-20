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
public class EJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mldia = 0;
        int mltotal = 0;
        int diaSuperados = 0;
        
        for (int i = 1; i <= 7; i++) {
            
            for (int j = 1; j <= 3; j++) {
                System.out.println("Introduce los ml del vaso " + j +
                        " del dia " + i);
                
                mldia += s.nextInt();
            }
            
            if (mldia >= 1500) {
                System.out.println("Has superado la meta de 1500ml al dia con "
                        + mldia + "ml");
                
                diaSuperados++;
            }else{
                System.out.println("No has superado la meta de 1500ml al dia con "
                        + mldia + "ml");
            
            }
            mltotal += mldia;
            mldia = 0;
        }
        
        System.out.println("El total de ml consumido en los 7 dias es de " + mltotal
        + "ml");
        
        System.out.println("Se ha superado la meta de los 1500ml diarios en " + 
                diaSuperados + " dias");
        
        s.close();
    }
    
}
