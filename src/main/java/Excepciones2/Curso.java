/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones2;

/**
 *
 * @author Alumnos
 */
public class Curso {
    
    private String nombre;
    private int cupoMaximo;
    private int inscritosActuales = 0;
    
    public Curso(String nombre, int cupoMaximo){
        
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
        
    
    }
    
    public void inscribirAlumno(Alumno alumno) throws EdadNoValidaException, CursoLlenoException{
        
        if (alumno.getEdad() < 16) {
            
            throw new EdadNoValidaException("Edad no validad." + "Edad: " + alumno.getEdad());
            
        }else if (this.inscritosActuales == cupoMaximo) {
            
            throw  new CursoLlenoException("Curso lleno, cupo maximo de " + this.cupoMaximo + " alumnos");
            
        }else{
            
            this.inscritosActuales++;
            System.out.println("Alumno inscrito correctamente.");
        
        }
    
    }
    
}
