/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleFor;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class EJ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int x;
        int factorial = 0;
        System.out.println("Introduce un numero");
        x = s.nextInt();
        
        for (int i = x-1; i >= 1; i--) {
            factorial = factorial + (x * i);
        }
        
        System.out.println("el factorial de " + x + " es: " + factorial);
        s.close();
    }
    
}
