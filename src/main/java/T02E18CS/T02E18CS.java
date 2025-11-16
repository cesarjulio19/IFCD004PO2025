/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E18CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E18CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        
        int puntuacion = 0;
        do {            
            System.out.println("Introduce una puntuacion");
            puntuacion = s.nextInt();
        } while ((puntuacion < 0) || (puntuacion > 12 ));
        
        if (puntuacion == 12) {
            System.out.println("Excelente");
        }else if ((puntuacion >= 9) && (puntuacion <= 11)) {
            System.out.println("Bien");
        }else if ((puntuacion >= 6) && (puntuacion <= 8)) {
            System.out.println("Regular");
        }else if (puntuacion < 6) {
            System.out.println("Peligroso");
        }
        
        s.close();
    }
    
}
