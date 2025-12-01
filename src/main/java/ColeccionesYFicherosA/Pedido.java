/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColeccionesYFicherosA;

/**
 *
 * @author César
 */
public class Pedido {
    
    private String cliente;
    private String producto;
    private double importe;
    
    public Pedido(String cliente, String producto, double importe){
        this.cliente = cliente;
        this.producto = producto;
        this.importe = importe;
    
    }

    public String getCliente() {
        return cliente;
    }

    public double getImporte() {
        return importe;
    }

    public String getProducto() {
        return producto;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    
    
}
