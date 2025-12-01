/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T3E1AEE;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author cving
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        // Genera una lista de empleados de distintos departamentos. 
        List<Empleado> empleados = new ArrayList();
        empleados.add(new Empleado("Carlos","Desarrollo",2001));
        empleados.add(new Empleado("Ana","Marketing",1500));
        empleados.add(new Empleado("Luis","Desarrollo",2500));
        empleados.add(new Empleado("Paco","IT",1400));   
        empleados.add(new Empleado("David","Desarrollador",1400));   
      
        
        // Usa streams para filtrar los empleados del departamento "Desarrollo" con salario  mayor a 2000€
        empleados.stream()
                .filter(e -> e.getDepartamento().equalsIgnoreCase("desarrollo")&&e.getSalario()>2000)
                .forEach(e->System.out.println(e.getNombre()));
        
        
        
        //        Empleado carlos = empleados.get(0);
        //        carlos.setNombre(carlos.getNombre().toUpperCase());        
        //        System.out.println(carlos.getNombre());
        
        //Convierte sus nombres a mayúsculas y ordénalos alfabéticamente.
       var le= empleados.stream()
               .map(e->e.getNombre().toUpperCase())
               .sorted()
               .collect(Collectors.toList());
       
       //Muestra el resultado en consola.
       le.forEach(n->System.out.println(n));
       
       BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\cving\\Desktop\\DatosT3E4.txt"));
        
       for(String li:le){
           bw.write(li);
           bw.newLine();       
       }
       
       bw.close();
    }
    
}
