/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E03;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        int y;
        int z;
        int w;
        
        System.out.println("Introduce el primer número: ");
        x = s.nextInt();
        System.out.println("Introduce el segundo número: ");
        y = s.nextInt();
        System.out.println("Introduce el tercero número: ");
        z = s.nextInt();
        System.out.println("Introduce el cuarto número: ");
        w = s.nextInt();
        
        System.out.println("la suma de los 4 números es: " + (x + y + z + w));
        System.out.println("el promedio de los 4 números es: " + ((x + y + z + w) / 4));
        
        s.close();
        
    }
    
}
