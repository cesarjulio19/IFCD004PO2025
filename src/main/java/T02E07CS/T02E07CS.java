/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E07CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E07CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int x;
        int y;
        int w;
        
        System.out.println("Introduce el primer numero");
        x = s.nextInt();
        System.out.println("Introduce el segundo numero");
        y = s.nextInt();
        System.out.println("Introduce el tercer numero");
        w = s.nextInt();
        
        if ((x > y) && (x > w)) {
            System.out.println(x + " es el mayor");
        }else if ((y > x) && (y > w)) {
            System.out.println(y + " es el mayor");
        }else if ((w > x) && (w > y)) {
            System.out.println(w + " es el mayor");
        }
        
        s.close();
    }
    
}
