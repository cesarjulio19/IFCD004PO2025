/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E16CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E16CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int x;
        int y;
        int opcion = 0;
        
        System.out.println("Introduce el primer numero");
        x = s.nextInt();
        System.out.println("Introduce el segundo numero");
        y = s.nextInt();
        
        do {

            System.out.println("0. Sumar");
            System.out.println("1. Restar");
            System.out.println("2. Multiplicar");   
            System.out.println("3. Dividir");
            System.out.println("4. Salir");
            System.out.println("Opcion: ");
            opcion = s.nextInt();
            
            switch (opcion) {
                case 0:
                    System.out.println("La suma de " + x + " + " + y + " = " + (x + y));
                    break;
                case 1:
                    System.out.println("La resta de " + x + " - " + y + " = " + (x - y));
                    break;
                case 2:
                    System.out.println("El producto de " + x + " * " + y + " = " + (x * y));
                    break;
                case 3:
                    System.out.println("La division de " + x + " / " + y + " = " + (x / y));
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            
        } while (opcion != 4);
        
        s.close();
    }
    
}
