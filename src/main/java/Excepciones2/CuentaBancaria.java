/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones2;

/**
 *
 * @author Alumnos
 */
public class CuentaBancaria {
    
    private double saldo;
    
    public CuentaBancaria(double saldo){
        
        this.saldo = saldo;
    
    }
    
    public void depositar(double monto){
        
        this.saldo += monto;
    
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException{
        
        if(monto > this.saldo){
            
            throw new SaldoInsuficienteException("Saldo insuficiente");
        
        }else{
            
            this.saldo -= monto;
        
        }
    
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    
}
