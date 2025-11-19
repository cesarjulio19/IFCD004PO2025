/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T2Objetos.OEJ03;

/**
 *
 * @author Alumnos
 */
public class MayorElemento {
    
    public MayorElemento(){
        
    }
    
    public int mayor(int [] array){
        
        int mayor = array[0];
    
        for (int i = 1; i < array.length; i++) {
            if (mayor < array[i]) {
                
                mayor = array[i];
                
            }
        }
        return mayor;
    }
}
