/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E07;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double base;
        double altura;
        double area;
        
        System.out.println("introduce la base del triangulo: ");
        base = s.nextDouble();
        System.out.println("introduce la altura del triangulo: ");
        altura = s.nextDouble();
        
        area = (base * altura) / 2;
        
        System.out.println("el area del triangulo es: " + area);
        
        s.close();
        
    }
    
}
