/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02POO;

/**
 *
 * @author Alumnos
 */
public class T02POO04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado("César", 1500);
        Gerente g1 = new Gerente("Manolo", 2000);
        
        double be1 = e1.calcularBonus();
        System.out.println("El bonus del empleado es de " + be1);
        
        double bg1 = g1.calcularBonus();
        System.out.println("El bonus del empleado es de " + bg1);
    }
    
}
