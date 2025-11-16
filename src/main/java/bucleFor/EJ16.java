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
public class EJ16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int x;
        int contador = 0;
        boolean esPrimo;
        System.out.println("Introduce un numero");
        x = s.nextInt();
        
        for (int i = 2; i <= x; i++) {
             esPrimo = true;
            for (int j = 2 ; j * j <= i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
                
            }
            if (esPrimo) {
                contador++;
                System.out.println(i + " es primo");
            }
            
        }
        System.out.println("Numeros primos entre 2 y " + x + ": " + contador);
        s.close();
    }
    
}
