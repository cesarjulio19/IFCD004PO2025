/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E05;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         float numero;
         float porcentaje;
         float resultado;
         System.out.println("introduce un número: ");
         numero = s.nextFloat();
         System.out.println("Introduce el porcentaje a calcular: ");
         porcentaje = s.nextFloat();
         resultado = ((porcentaje * numero)/ 100);
         System.out.println("El " + porcentaje + "% de " + numero + " es: "
         + resultado);
         
         s.close();
         
    }
    
}
