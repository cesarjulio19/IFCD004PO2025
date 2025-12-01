/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioIntegrado;

/**
 *
 * @author César
 */
public class Profesores {
    
    private String nombre;
    private String departamento;
    private String especialidad;
    private double sueldo;
    private int hSemanales;
    
    public Profesores(String nombre,String departamento,String especialidad,double sueldo,int hSemanales){
        
        this.departamento = departamento;
        this.especialidad = especialidad;
        this.hSemanales = hSemanales;
        this.nombre = nombre;
        this.sueldo = sueldo;
    
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public int gethSemanales() {
        return hSemanales;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void sethSemanales(int hSemanales) {
        this.hSemanales = hSemanales;
    }
    
    
    
}
