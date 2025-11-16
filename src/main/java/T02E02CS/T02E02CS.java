/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E02CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E02CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int x;
        
        do {       
            System.out.println("Introduce un numero positivo");
            x = s.nextInt();
        } while (x < 0);
        
        if((x%2) == 0){
            System.out.println("El numero es par");
        }else System.out.println("El numero es impar");
        
        s.close();
    }
    
}
