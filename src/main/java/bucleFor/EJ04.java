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
public class EJ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        
        int n;
        int resultado = 0;
        
        System.out.println("Introduce la cantidad de numeros entero a sumar");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            
            resultado += i;
            
        }
        System.out.println(resultado);
        s.close();
    }
    
}
