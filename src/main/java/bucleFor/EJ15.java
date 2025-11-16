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
public class EJ15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int x;
        System.out.println("Introduce un numero");
        x = s.nextInt();
        
        for (int i = 1; i <= x ;i++) {
            if (i % 2 == 0) {
                
                System.out.println("-"+i);
                
            }else System.out.println(i);
        }
        
        s.close();
    }
    
}
