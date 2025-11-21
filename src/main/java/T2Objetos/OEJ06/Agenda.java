/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T2Objetos.OEJ06;

/**
 *
 * @author Alumnos
 */
public class Agenda {
    private Contacto[] agendaContactos = new Contacto[10];
    
    public Agenda(){}
    
    public void add(Contacto c){
        
        for (int i = 0; i < 10; i++) {
            if (this.agendaContactos[i] == null) {
                
                this.agendaContactos[i] = c;
                
            }
        }
    
    }
    
    
}
