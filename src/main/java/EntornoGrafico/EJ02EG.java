/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EntornoGrafico;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author César
 */
public class EJ02EG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SwingUtilities.invokeLater(() -> {
            crearYMostrarGUI();
        });
    }
    
    private static void crearYMostrarGUI(){
        
        //Ventana principal
        JFrame frame = new JFrame("Duplicar número");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        
        //Panel 3 filas, 1 columna, espacio de 5 px entre componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 5, 5));
        
        //Componentes
        JTextField campoTexto = new JTextField();
        JButton boton = new JButton("Duplicar");
        JLabel etiquetaResultado = new JLabel("", SwingConstants.CENTER);
        
        //Acción del botón
        boton.addActionListener(e -> {
            String entrada = campoTexto.getText(); 

            try {
                int numero = Integer.parseInt(entrada); 
                int resultado = numero * 2;
                etiquetaResultado.setText("Resultado: " + resultado);
            } catch (NumberFormatException ex) {
                etiquetaResultado.setText("Entrada no válida");
            }
        });
        
        //Agrega los componentes al panel
        panel.add(campoTexto);
        panel.add(boton);
        panel.add(etiquetaResultado);

        //Agrega el panel a la ventana
        frame.add(panel);

        frame.setVisible(true);
        
    
    }
    
}
