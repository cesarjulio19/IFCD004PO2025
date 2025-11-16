/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E01;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lado;
        int perimetro;
        
        System.out.println("Introduce el lado del cuadrado: ");
        lado = s.nextInt();
        perimetro = lado * 4;
        
        System.out.println("El perímetro del cuadrado es : " + perimetro);
        s.close();
    }
    
}
