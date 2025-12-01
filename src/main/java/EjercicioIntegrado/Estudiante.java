/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioIntegrado;

/**
 *
 * @author César
 */
public class Estudiante {
    
    private String nombre;
    private String curso;
    private double matematicas;
    private double lengua;
    private double ingles;
    private double ciencias;
    
    public Estudiante(String nombre,String curso,double matematicas,double lengua,double ingles,double ciencias){
        this.nombre = nombre;
        this.ciencias = ciencias;
        this.curso = curso;
        this.ingles = ingles;
        this.lengua = lengua;
        this.matematicas = matematicas;
    
    }
    
    public double[] getNotas() {
        return new double[] { this.matematicas, this.lengua, this.ingles, this.ciencias };
    }

    public double getCiencias() {
        return ciencias;
    }

    public String getCurso() {
        return curso;
    }

    public double getIngles() {
        return ingles;
    }

    public double getLengua() {
        return lengua;
    }

    public double getMatematicas() {
        return matematicas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCiencias(double ciencias) {
        this.ciencias = ciencias;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public void setLengua(double lengua) {
        this.lengua = lengua;
    }

    public void setMatematicas(double matematicas) {
        this.matematicas = matematicas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
