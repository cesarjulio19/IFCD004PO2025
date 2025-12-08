/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EntornoGrafico;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author César
 */
public class EJ01EG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Construimos la ventana dentro del evento Event Dispatch Thread
        
        SwingUtilities.invokeLater(() -> {
            crearYMostrarGUI();
        });
    }
    
    private static void crearYMostrarGUI(){
        
        // creamos la ventana principal
        JFrame frame = new JFrame("Ejercicio 1 - Botón y Evento");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Creamos la etiqueta y el botón
        JLabel etiqueta = new JLabel("Presiona el botón", SwingConstants.CENTER);
        JButton boton = new JButton("Click aquí");
        
        //Añadimos un ActionListener al botón
        boton.addActionListener(e -> {
            etiqueta.setText("¡Botón presionado!");
        });
        
        //Organizamos los componentes en el JFrame
        frame.setLayout(new BorderLayout(5, 5));
        frame.add(etiqueta, BorderLayout.NORTH);
        frame.add(boton, BorderLayout.SOUTH);
        
        //Tamaño del frame, centrado y visibilidad
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    
    }
    
}
