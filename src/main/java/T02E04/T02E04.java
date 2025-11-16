/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E04;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float precio;
        int cantidad;
        
        System.out.println("Introduce el precio del objeto: ");
        precio = s.nextFloat();
        System.out.println("Introduce la cantidad del objeto: ");
        cantidad = s.nextInt();
        System.out.println("El precio total es de: " + (precio * cantidad));
        
        s.close();
    }
    
}
