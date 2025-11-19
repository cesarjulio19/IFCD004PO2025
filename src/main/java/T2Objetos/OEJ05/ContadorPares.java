/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T2Objetos.OEJ05;

/**
 *
 * @author Alumnos
 */
public class ContadorPares {
    
    public ContadorPares(){}
    
    public int pares (int [] array){
       int contador = 0;
       
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 0) {
                contador++;
            }
            
        }
        return contador;
    }
}
