/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColeccionesYFicherosA;

/**
 *
 * @author César
 */
public class Libros {
    
   private String titulo;
   private String autor;
   
   public Libros(String titulo, String autor){
       
       this.titulo = titulo;
       this.autor = autor;
   
   }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   
   
    
}
