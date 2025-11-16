/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E01CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E01CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int x;
        System.out.println("introduce un numero: ");
        x= s.nextInt();
        
        if(x >= 0 ){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
        s.close();
    }
    
}
