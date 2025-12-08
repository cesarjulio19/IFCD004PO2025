/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EntornoGrafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author César
 */
public class EJ03EG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            crearYMostrarGUI();
        });
    }
    
    private static void crearYMostrarGUI() {
        JFrame frame = new JFrame("Cambio de color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLocationRelativeTo(null);

        //Panel de dibujo personalizado
        CirculoPanel panelDibujo = new CirculoPanel();

        //Botón para cambiar color
        JButton boton = new JButton("Cambiar color");

        boton.addActionListener(e -> {
            panelDibujo.cambiarColorAleatorio();
            panelDibujo.repaint();
        });

        //Organización usando BorderLayout
        frame.setLayout(new BorderLayout());
        frame.add(panelDibujo, BorderLayout.CENTER);
        frame.add(boton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
    
    static class CirculoPanel extends JPanel {

        private Color colorActual = Color.RED; 
        private Random random = new Random();

        // Método que se ejecuta cada vez que Swing necesita repintar el panel
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Tomamos el tamaño disponible
            int ancho = getWidth();
            int alto = getHeight();

            // Para mantenerlo circular, usamos el menor lado
            int diametro = Math.min(ancho, alto) - 20; 

            int x = (ancho - diametro) / 2;
            int y = (alto - diametro) / 2;

            g.setColor(colorActual);
            g.fillOval(x, y, diametro, diametro);
        }

        // Cambia el color usando Random
        public void cambiarColorAleatorio() {
            int r = random.nextInt(256);
            int g = random.nextInt(256);
            int b = random.nextInt(256);

            colorActual = new Color(r, g, b);
        }
    }
    
}
