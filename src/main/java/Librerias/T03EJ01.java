/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Librerias;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T03EJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int[] array = new int[5];
        int n = 0;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un numero");
            n = s.nextInt();
            array[i] = n;
            sum += array[i];
            
        }
        
        int mayor = array[0];
        int menor = array[0];
        
        for (int i : array) {
            if (i > mayor) {
                mayor = i;
                
            }
            
            if (i < menor) {
                menor = i;
            }
            
        }
        
        double raiz = Math.sqrt(mayor);
        double promedio = sum / 5;
        long redondeo = Math.round(promedio);
        
        
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Raiz cuadrada del mayor: " + raiz);
        System.out.println("Promedio redondeado: " + redondeo);
        s.close();
        
    }
    
}
