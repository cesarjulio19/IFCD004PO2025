/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02POO;

/**
 *
 * @author Alumnos
 */
public class T02POO03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta(25);
        BicicletaMontana bm1 = new BicicletaMontana(25, 5);
        
        b1.acelerar();
        b1.frenar();
        
        bm1.acelerar();
        bm1.frenar();
        bm1.ajustarSuspension(3);
    }
    
}
