/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E09CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E09CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int año;
        System.out.println("Introduce tu año de nacimiento");
        año = s.nextInt();
        
        if((2025 - año) >= 18){
            System.out.println("Mayor de edad");
        }else System.out.println("Menor de edad");
        
        s.close();
        
    }
    
}
