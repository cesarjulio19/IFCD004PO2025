/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T2Objetos.OEJ08;

/**
 *
 * @author Alumnos
 */
public class Inventario {
    
    Producto[] a = new Producto[20];
    
    public Inventario(){}
    
    public void agregar_producto(Producto p){
        int capacidad = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == null){
                a[i]= p;
                capacidad = 1;
                System.out.println("Producto añadido");
            }
            
        }
        
        if(capacidad == 0){
            System.out.println("No hay espacio para añadir mas productos.");
        
        }
    
    }
    
    public Producto buscar_producto(String nombre){
        
        for (int i = 0; i < a.length; i++) {
            
            if(a[i] != null){
                if(a[i].getNombre().equals(nombre)){
                    return a[i];
                
                }
            
            }
            
        }
        return null;
    
    }
    
    public double valor_inventario(){
        double valor_inv = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != null){
                valor_inv += (a[i].getPrecio() * a[i].getCantidad());
            
            }
        }
        
        return valor_inv;
    
    }
    
    public void aumentar_producto(String nombre){
        
        for (int i = 0; i < a.length; i++) {
            
        }
    
    }
    
    
    
    
    
    
}
