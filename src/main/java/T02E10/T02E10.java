/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E10;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double c;
        double resultado;
        System.out.println("Introduce una cantidad de grados Celsius: ");
        c = s.nextDouble();
        resultado = ((c * (9.0/5.0))+ 32);
        System.out.println("El equivalente a grados Fahrenheit es de :" + resultado);
        
        s.close();
               
    }
    
}
