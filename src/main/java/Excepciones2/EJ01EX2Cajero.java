/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones2;

/**
 *
 * @author Alumnos
 */
public class EJ01EX2Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria(200);
        
        try {
            c.retirar(100);
            System.out.println("Saldo: " + c.getSaldo());
            c.retirar(150);
            
        } catch (SaldoInsuficienteException e) {
            
            System.out.println(e.getMessage());
            System.out.println("Saldo: " + c.getSaldo());
        }
    }
    
}
