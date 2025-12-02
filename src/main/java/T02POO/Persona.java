/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T02POO;

/**
 *
 * @author Alumnos
 */
public class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
        this.edad = edad;
        this.nombre = nombre;
        
    
    }
    
    public void saludar(){
        
        System.out.println("Hola, me llamo " + this.nombre);
    
    }
    
}
