/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E04CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E04CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        
        int edad;
        
        do {        
            System.out.println("Introduce una edad: ");
            edad = s.nextInt();
      
        } while (edad < 0);
        
        if(edad >= 18){
            System.out.println("La persona es mayor de edad");
        }else System.out.println("La persona es menor de edad");
        
        s.close();
    }
    
}
