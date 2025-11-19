/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T2Objetos.OEJ01;

/**
 *
 * @author Alumnos
 */
public class ContadorVocales {
    
    
    public ContadorVocales() {
        
    }
    
   
    
    public int contarVocales(String palabra){
        int contador = 0;
        for (int i = 0; i < palabra.length() ; i++) {
            char letra = palabra.charAt(i);
            if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')  )  {
                contador++;
            }
            
        }
        
        return contador;
    }
    
}
