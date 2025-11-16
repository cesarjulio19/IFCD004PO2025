/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E14CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E14CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        
        int x;
        
        System.out.println("Introduce un numero");
        x = s.nextInt();
        
        if (x%2 == 0) {
            System.out.println(x + "Es divisible entre 2");
        }else if (x%3 == 0) {
            System.out.println(x + "Es divisible entre 3");
        }else if (x%5 == 0) {
            System.out.println(x + "Es divisible entre 5");
        }else System.out.println(x + "No es divisible entre 2, 3 o 5");
        
        s.close();
 
    }
    
}
