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
public class EJ07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int x;
        int resultado;
        System.out.println("Introduce un numero");
        x = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            resultado = x * i;
            System.out.println(x + " * " + i + " = " + resultado);
        }
        
        s.close();
        
    }
    
}
