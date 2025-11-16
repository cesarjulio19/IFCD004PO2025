/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E15CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E15CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        
        int nota = 0;
        do {            
            System.out.println("Introduce una nota");
            nota = s.nextInt();
        } while ((nota < 0) || (nota > 10 ));
        
        if (nota <5) {
            System.out.println("Insuficiente");
        }else if ((nota == 5) || (nota == 6)) {
            System.out.println("Suficiente");
        }else if ((nota == 7) || (nota == 8)) {
            System.out.println("Notable");
        }else if ((nota == 9) || (nota == 10)) {
            System.out.println("Sobresaliente");
        }
        
        s.close();
    }
    
}
