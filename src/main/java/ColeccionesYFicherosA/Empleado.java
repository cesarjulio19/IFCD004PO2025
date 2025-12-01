/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T3E1AEE;

/**
 *
 * @author cving
 */
public class Empleado {
    private String nombre;
    private String departamento;
    private int salario;
    
    public Empleado(String nombre, String departamento, int salario){
        this.nombre=nombre;
        this.departamento = departamento;
        this.salario = salario;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
    
    public int getSalario(){
     return this.salario;
    }
    
    public void setNombre(String n){
        this.nombre =n;
    }
}
