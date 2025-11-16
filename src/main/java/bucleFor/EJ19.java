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
public class EJ19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         
        System.out.print("Introduce un número: ");
        int x = s.nextInt();
        
        System.out.println("Divisores de " + x + ":");
         
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {  
                System.out.println(i);
            }
        }
        
        s.close();
        
    }
    
}
