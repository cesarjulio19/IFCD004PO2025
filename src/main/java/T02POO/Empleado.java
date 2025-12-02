/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T02POO;

/**
 *
 * @author Alumnos
 */
public class Empleado {
    
    protected String nombre;
    protected double salario;
    
    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    
    }

    public double getSalario() {
        if(this.salario < 0){
            System.out.println("El salario es negativo.");
        
        }
        return salario;
    }

    public void setSalario(double salario) {
        
        if(salario >= 0){
            this.salario = salario;
            System.out.println("El salario ha sido modificado");
        }else{
            System.out.println("El salario es menor de 0");
        
        }
        
    }
    
    public double calcularBonus(){
        double bonus = this.salario * 0.05;
        
        return bonus;
    
    }

    
    
    
    
}
