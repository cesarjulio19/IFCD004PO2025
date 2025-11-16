/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E06CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E06CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        
        String password;
        
        System.out.println("Introduce una contraseña: ");
        
        password = s.nextLine();
        
        if(password.equals("java123")){
            System.out.println("La contraseña es correcta");
        }else System.out.println("contraseña incorrecta");
        
        s.close();
    }
    
}
