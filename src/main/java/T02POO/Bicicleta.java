/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T02POO;

/**
 *
 * @author Alumnos
 */
public class Bicicleta {
    
    protected  int velocidadActual;
    
    public Bicicleta(int velocidadActual){
        
        this.velocidadActual = velocidadActual;
    
    }
    
    public void acelerar(){
        
        this.velocidadActual += 1;
        System.out.println("La velocidad actual es de " + this.velocidadActual);
    
    }
    
    public void frenar(){
        
        this.velocidadActual -= 1;
        System.out.println("La velocidad actual es de " + this.velocidadActual);
    
    }
    
   
    
}
