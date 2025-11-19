/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T2Objetos.OEJ03;

/**
 *
 * @author Alumnos
 */
public class OEJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1,23,65,87,123,567};
        MayorElemento a = new MayorElemento();
        
        System.out.println("El mayor numero del array es " + a.mayor(array));
    }
    
}
