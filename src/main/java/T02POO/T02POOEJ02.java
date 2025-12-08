/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02POO;

/**
 *
 * @author Alumnos
 */
public class T02POOEJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado("César", 1500);
        Empleado e2 = new Empleado("Manolo", -500);
        
        double salario1 = e1.getSalario();
        System.out.println(salario1);
        e1.setSalario(2000);
        
        double salario2 = e2.getSalario();
        System.out.println(salario2);
        e2.setSalario(-1500);
    }
    
}
