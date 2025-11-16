/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E22CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E22CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        
        int x = 0;
        int resultado = 0;
        
        do {           
            System.out.println("Introduce un numero hasta introducir uno negativo");
            x = s.nextInt();
            resultado += x;
        } while (x > 0);
        
        System.out.println("La suma de los numeros introducidos es de " + resultado);
        
        s.close();
    }
    
}
