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
public class EJ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double temperatura;
        System.out.println("Introduce la temperatura de la habitacion: ");
        
        temperatura = s.nextDouble();
        
        if ((temperatura >= 20) && (temperatura <=25)) {
            System.out.println("La habitacion esta dentro del rango de 20-25 grados");
        }else{
            if (temperatura < 20) {
                System.out.println("La temperatura esta por debajo del rango de 20-25 grados,"
                        + " faltaria " + (20-temperatura)+ " grados para llegar al rango de confort");
            }else{
              System.out.println("La temperatura esta por encima del rango de 20-25 grados,"
                        + " sobrarian " + (temperatura-25)+ " grados para llegar al rango de confort");
            }
        }
        
        s.close();
    }
    
}
