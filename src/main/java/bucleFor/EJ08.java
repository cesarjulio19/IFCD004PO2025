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
public class EJ08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        
        int n;
        int contador = 0;
        
        System.out.println("Introduce hasta que numero contar");
        n = s.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0){
                System.out.println(i+ " es divisible entre 3");
                contador++;
            }
            
        }
        
        System.out.println(contador + " numeros son divisibles entre 3");
        
        
    }
    
}
