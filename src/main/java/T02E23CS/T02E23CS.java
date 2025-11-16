/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E23CS;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E23CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        
        int mayor;
        int anterior;
        anterior = s.nextInt();
        mayor = anterior;
        if (anterior != 0) {
            
            do {
                
              anterior = s.nextInt();
              if(anterior > mayor){
                 mayor = anterior;
              }
            
            } while (anterior != 0);
            
            System.out.println("El numero mayor introducido es " + mayor);
        }
        
        
        s.close();
    }
    
}
