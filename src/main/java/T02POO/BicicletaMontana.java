/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T02POO;

/**
 *
 * @author Alumnos
 */
public class BicicletaMontana extends Bicicleta{
    
    private int suspension;

    public BicicletaMontana(int velocidadActual, int suspension) {
        super(velocidadActual);
        this.suspension = suspension;
    }
    
    public void ajustarSuspension(int suspension){
        
        this.suspension = suspension;
        System.out.println("La suspension es de " + this.suspension);
    
    }
    
}
