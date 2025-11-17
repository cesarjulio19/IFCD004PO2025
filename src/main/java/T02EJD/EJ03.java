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
public class EJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int monedas = 0;
        int suma = 0;
        int vMoneda = 0;
        
        do {
            System.out.println("Introduce el valor de la moneda: ");
            vMoneda = s.nextInt();
            
            if (vMoneda > 0) {
                monedas++;
                suma += vMoneda;
            }
            
        } while (vMoneda > 0);
        System.out.println("Monedas ingresadas: " + monedas);
        if(suma > 100){
            
            System.out.println("Has juntado mas de 100€, un total de " + suma + "€");
        }else System.out.println("No has juntado mas de 100€, solo has juntado "+ suma + "€");
        
        s.close();
        
    }
    
}
