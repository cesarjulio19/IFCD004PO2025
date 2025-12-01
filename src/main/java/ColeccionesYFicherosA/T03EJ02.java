/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ColeccionesYFicherosA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author César
 */
public class T03EJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        List<Producto> productos = new ArrayList();
        productos.add(new Producto("fresa",0.78,"fruta"));
        productos.add(new Producto("pimiento",1.20,"verdura"));
        productos.add(new Producto("agua",0.50,"bebida"));
        productos.add(new Producto("filete de pollo",2.50,"carne"));
        productos.add(new Producto("lubina",3.50,"pescado"));
        
        double promedio = productos.stream().mapToDouble(Producto::getPrecio).average().orElse(0.0);
        Producto productoMasCaro = productos.stream().max(Comparator.comparingDouble(Producto::getPrecio)).orElse(null);
        Producto productoMasBarato = productos.stream().min(Comparator.comparingDouble(Producto::getPrecio)).orElse(null);
        
        System.out.println("El promedio de los precios es de : " + promedio);
        System.out.println("El producto mas caro es: " + productoMasCaro.getNombre() + " con un precio de " + productoMasCaro.getPrecio() + "€");
        System.out.println("El producto mas barato es: " + productoMasBarato.getNombre() + " con un precio de " + productoMasBarato.getPrecio() + "€");
    }
    
}
