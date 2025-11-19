/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T2Objetos.OEJ02;

/**
 *
 * @author Alumnos
 */
public class PromedioArreglo {
    
    
    public PromedioArreglo() {
        
    }
    
   
    
    public double promedio(int [] array){
        int suma = 0;
        
        for (int i = 0; i < array.length ; i++) {
            
            suma += array[i];
            
        }
        double promedio = suma / array.length;
        return promedio;
    }
    
}
