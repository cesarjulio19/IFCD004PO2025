/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EntornoGrafico;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author César
 */
public class EJ04EG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            crearYMostrarGUI();
        });
    }
    
     private static void crearYMostrarGUI() {
        JFrame frame = new JFrame("Visor de Imágenes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);

        //Label donde se muestra la imagen
        JLabel etiquetaImagen = new JLabel();
        etiquetaImagen.setHorizontalAlignment(JLabel.CENTER);

        //Envolver en JScrollPane para imágenes grandes
        JScrollPane scrollPane = new JScrollPane(etiquetaImagen);

        //Menu superior
        JMenuBar menuBar = new JMenuBar();

        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemSalir = new JMenuItem("Salir");

        menuArchivo.add(itemAbrir);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);

        menuBar.add(menuArchivo);
        frame.setJMenuBar(menuBar);

        
        //Acción de abrir
        
        itemAbrir.addActionListener(e -> {

            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Seleccionar imagen");

            // Filtro para imágenes
            chooser.setFileFilter(
                new FileNameExtensionFilter("Imágenes (JPG, PNG, GIF)", "jpg", "jpeg", "png", "gif")
            );

            int opcion = chooser.showOpenDialog(frame);

            if (opcion == JFileChooser.APPROVE_OPTION) {
                File archivo = chooser.getSelectedFile();

                // Cargar la imagen
                ImageIcon imagen = new ImageIcon(archivo.getAbsolutePath());

                // Mostrar imagen en el JLabel
                etiquetaImagen.setIcon(imagen);
                etiquetaImagen.setText(""); // por si antes tenía texto

                // Asegura que el JLabel se ajuste al tamaño de la nueva imagen
                frame.revalidate();
            }
        });

       
        //Acción de salir
        
        itemSalir.addActionListener(e -> System.exit(0));

        
        //Agregar componentes al frame
        
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
    
}
