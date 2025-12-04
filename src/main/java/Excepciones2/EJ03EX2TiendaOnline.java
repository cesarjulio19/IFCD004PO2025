/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones2;

/**
 *
 * @author Alumnos
 */
public class EJ03EX2TiendaOnline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        inventario.agregarProducto(new Producto("teclado", 20.50, 15));
        
        inventario.agregarProducto(new Producto("raton", 15, 20));
        
        try {
            
            inventario.vender("teclado", 5);
            //inventario.vender("raton", 21);
            //inventario.vender("grafica", 21);
            
        } catch (ProductoNoEncontradoException e) {
            
            System.out.println(e.getMessage());
            
        }catch (StockInsuficienteException e){
            
            System.out.println(e.getMessage());
        
        }
    }
    
}
