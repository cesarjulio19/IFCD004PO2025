/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T2Objetos.OEJ05;

/**
 *
 * @author Alumnos
 */
public class OEJ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {2, 45, 56, 100, 23, 67, 89};
        ContadorPares c = new ContadorPares();
        
        System.out.println("En el array hay " + c.pares(a) + " numeros pares");
    }
    
}
