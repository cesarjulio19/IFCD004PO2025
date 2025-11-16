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
public class EJ17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        int anterior = 1;
        int aanterior = 0;
        int presente;
        System.out.println("Introduce un numero");
        x = s.nextInt();
        System.out.println(0);
        System.out.println(1);
        for (int i = 3; i <= x; i++) {
            presente = aanterior + anterior;
            System.out.println(presente);
            aanterior = anterior;
            anterior = presente;
        }
        s.close();
        
    }
    
}
