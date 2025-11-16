/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucleFor;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class EJ18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
         Scanner s = new Scanner(System.in);
        int x;
        long factorial = 1;
        long suma = 0;
        System.out.println("Introduce un numero");
        x = s.nextInt();
        
        for (int i = 1; i <= x; i++) {
           factorial = 1;

           
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            suma += factorial;
        }

        System.out.println("La suma de factoriales desde 1! hasta " + x + "! es: " + suma);
        
        s.close();
       
    }
    
}
