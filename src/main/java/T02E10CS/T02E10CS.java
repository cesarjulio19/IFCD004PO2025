/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E10CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E10CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int x;
        System.out.println("Introduce un numero");
        x = s.nextInt();
        
        if ((x >= 0) && (x <= 100)) {
            System.out.println(x + " esta entre 0 y 100");
        }else System.out.println(x + " no esta entre 0 y 100");
        
        s.close();
    }
    
}
