/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E24CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E24CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        
        String password = "";
        
        do { 
            System.out.println("Introduce la contraseña: ");
            password = s.next();
            
        } while (!password.equals("java123"));
        
        System.out.println("Contraseña correcta");
        s.close();
    }
    
}
