/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T2Objetos.OEJ07;

/**
 *
 * @author Alumnos
 */
public class CuentaBancaria {
    
    private String num_cuenta="";
    private String titular="";
    private long saldo=0;
    
    public CuentaBancaria(String num_cuenta, String titular, long saldo){
        
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
        this.titular = titular;
        
        
    
    }
    
    public void depositar(long dinero){
        this.saldo += dinero;
        System.out.println("Dinero depositado: " + dinero + ", saldo de la cuenta: "
                + this.saldo);
    
    }
    
    public void retirar(long dinero){
        if(this.saldo >= dinero){
            this.saldo -= dinero;
            System.out.println("Dinero retirado: " + dinero + ", saldo de la cuenta: "
                + this.saldo);
        
        }else{
            System.out.println("No se ha podido retirar el dinero de la cuenta,"
                    + " saldo insuficiente: " + this.saldo);
        
        }
    
    }
    
    public void mostrarInfo(){
        System.out.println("Numero de cuenta: " + this.num_cuenta);
         System.out.println("Titular: " + this.titular);
          System.out.println("Saldo: " + this.saldo);
    
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    
    
    
    
}
