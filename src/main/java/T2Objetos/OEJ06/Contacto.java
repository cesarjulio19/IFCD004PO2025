/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T2Objetos.OEJ06;

/**
 *
 * @author Alumnos
 */
public class Contacto {
    private String nombre;
    private String telefono;
    
    public Contacto(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    
    }
    
    public String getNombre(){
        return this.nombre;
    
    }
    
    public String getTelefono(){
        return this.telefono;
    
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}
