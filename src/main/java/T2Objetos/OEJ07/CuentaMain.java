/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T2Objetos.OEJ07;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class CuentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("7723456543", "Cesar", 2003);
        CuentaBancaria cuenta2 = new CuentaBancaria("2345667456", "Maria", 1500);
        CuentaBancaria cuenta3 = new CuentaBancaria("6545434567", "Pablo", 3045);
        CuentaBancaria cuenta4 = new CuentaBancaria("2345334565", "Alvaro", 2345);
        
        CuentaBancaria[] banco = {cuenta1, cuenta2, cuenta3, cuenta4};
        Scanner s = new Scanner(System.in);
        String num_cuenta = "";
        long dinero =0;
        
        System.out.println("Introduce la cuenta bancaria que quieres utilizar: ");
        num_cuenta = s.next();
        int opcion = -1;
        
        for (int i = 0; i < 4; i++) {
            if (banco[i].getNum_cuenta().equals(num_cuenta)) {
                
                do {  
                    System.out.println("1. Depositar dinero");
                    System.out.println("2. Retirar dinero");
                    System.out.println("3. Informacion cuenta");
                    System.out.println("4. Salir");
                    System.out.println("Introduce una opcion:");
                    
                    opcion = s.nextInt();
                    
                    switch (opcion) {
                        case 1:
                            System.out.println("Introduce una cantidad a depositar:");
                            dinero = s.nextLong();
                            banco[i].depositar(dinero);
                            dinero =0;
                            
                            break;
                        case 2:
                            System.out.println("Introduce una cantidad a retirar:");
                            dinero = s.nextLong();
                            banco[i].retirar(dinero);
                            dinero =0;
                            
                            break;
                        case 3:
                            banco[i].mostrarInfo();
                            
                            break;
                        case 4:
                            System.out.println("Saliedo...");
                            
                            break;
                        default:
                            System.out.println("Opcion no valida.");
                    }
                    
                } while (opcion != 4);
                
            }
            
        }
        
        s.close();
    }
    
}
