/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T02POO;

/**
 *
 * @author Alumnos
 */
public class Gerente extends Empleado{
    
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }
    
    @Override
    public double calcularBonus(){
        
        double bonus = super.salario * 0.10;
        
        return bonus;
    
    }
    
    
    
    
    
    
}
