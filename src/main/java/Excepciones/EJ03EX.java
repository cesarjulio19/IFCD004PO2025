/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class EJ03EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = {5,4,6,3,4};
        
        try {
            System.out.println("Introduce in indice del array");
            int index = s.nextInt();
            int num = array[index];
            
        } catch (InputMismatchException e) {
            System.out.println("No has introducido un numero: " + e);
            
        }catch (ArrayIndexOutOfBoundsException e){
            
            System.out.println("Indice incorrecto en el array: " + e);
        
        }
        s.close();
    }
    
}
