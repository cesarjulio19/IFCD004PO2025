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
public class EJ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int x;
        int suma = 0;
        System.out.println("Introduce un numero");
        x = s.nextInt();
        
        for (int i = 1; i <= x; i++) {
            
            if(i % 2 == 0){
               suma += i;
            }
            
        }
        
        System.out.println("La suma de los numero pares entre 1 y " + x + " es: " + suma);
        
        s.close();
    }
    
}
