/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alumnos
 */
public class Inventario {
    
    private Map<String, Producto> almacen = new HashMap<>();
    
    public Inventario(){
    
    }
    
    public void agregarProducto(Producto producto){
        
        this.almacen.put(producto.getNombre(), producto);
    
    }
    
    public void vender(String nombreProducto, int cantidad) throws ProductoNoEncontradoException, StockInsuficienteException{
        
        if (!this.almacen.containsKey(nombreProducto)) {
            
            throw new ProductoNoEncontradoException("Producto no encontrado");
            
        }else if(this.almacen.get(nombreProducto).getStock() < cantidad){
            throw new StockInsuficienteException("Stock insuficiente en el almacen");
        
        }else{
            int restantes = this.almacen.get(nombreProducto).getStock() - cantidad;
            this.almacen.get(nombreProducto).setStock(restantes);
            
            System.out.println("El precio total de la compra ha sido de " + 
                    (this.almacen.get(nombreProducto).getPrecio() * cantidad) + "€");
        
        }
    
    }
}
