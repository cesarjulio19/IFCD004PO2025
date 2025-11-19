/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T2Objetos.OEJ04;

/**
 *
 * @author Alumnos
 */
public class InvertirTexto {
    
    public InvertirTexto(){}
    
    public String invertir( String palabra){
        String a = "";
        for (int i = palabra.length()-1 ; i >= 0; i--) {
            a += palabra.charAt(i);
        }
        return a;
    }
    
    
}
