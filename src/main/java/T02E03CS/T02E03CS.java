/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E03CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E03CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Introduce el primer numero: ");
        x = s.nextInt();
        System.out.println("Introduce el segundo numero: ");
        y = s.nextInt();
        
        if (x > y) {
            System.out.println(x + " es el mayor");
        }else if (y > x) {
            System.out.println(y + " es el mayor");
        }else System.out.println(x + " y " + y + " son iguales");
        
        s.close();
        
    }
    
}
