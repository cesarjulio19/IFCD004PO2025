/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ColeccionesYFicherosA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author César
 */
public class T03EJ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //><
        List<Pedido> pedidos = new ArrayList<>();
        String linea;
        BufferedReader br = new BufferedReader(new FileReader("pedidos.txt"));
        
        while ((linea = br.readLine()) != null) {
            
            String[] partes = linea.split(",");
            String cliente = partes[0];
            String pedido = partes[1];
            double importe = Double.parseDouble(partes[2]);
            
            pedidos.add(new Pedido(cliente,pedido,importe));
        
        }
        
        br.close();
        
        
        var newList = pedidos.stream().filter(e -> e.getImporte() > 50)
                .sorted(Comparator.comparing(Pedido::getImporte).reversed())
                .map(Pedido::getCliente)
                .collect(Collectors.toList());
        
        
         BufferedWriter bw = new BufferedWriter(new FileWriter("clientes_premium.txt"));
         
        for (String li:newList) {
            bw.write(li);
            bw.newLine();
        }
        
        bw.close();
        
    }
    
}
