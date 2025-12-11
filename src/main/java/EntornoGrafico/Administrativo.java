/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntornoGrafico;

/**
 *
 * @author Alumnos
 */
public class Administrativo {
    
    private String nombre;
    private String cargo;
    private String tipo;
    private String area;
    private double sueldo;
    private int aAntiguedad;
    
    public Administrativo(String nombre,String cargo,String area,double sueldo,int aAntiguedad){
        
        this.aAntiguedad = aAntiguedad;
        this.area = area;
        this.cargo = cargo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    
    }

    public String getArea() {
        return area;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public int getaAntiguedad() {
        return aAntiguedad;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setaAntiguedad(int aAntiguedad) {
        this.aAntiguedad = aAntiguedad;
    }
    
}
