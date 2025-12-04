/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones2;

/**
 *
 * @author Alumnos
 */
public class EJ02EX2SistemaMatriculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso c = new Curso("IFCD004PO2025", 2);
        Alumno a1 = new Alumno("Pedro", 15);
        Alumno a2 = new Alumno("Cesar", 26);
        Alumno a3 = new Alumno("Manolo", 30);
        Alumno a4 = new Alumno("Rocio", 22);
        
        try {
            //c.inscribirAlumno(a1);
            c.inscribirAlumno(a2);
            c.inscribirAlumno(a3);
            c.inscribirAlumno(a4);
            
        } catch (EdadNoValidaException e) {
            
            System.out.println(e.getMessage());
            
        } catch (CursoLlenoException e){
            
            System.out.println(e.getMessage());
            
        }
    }
    
}
