/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioIntegrado;

import ColeccionesYFicherosA.Pedido;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author César
 */
public class EjercicioIntegrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //><
        Scanner s = new Scanner(System.in);
        
        //Cargamos todos los datos de los .txt a las listas:
        
        List<Estudiante> estudiantes = new ArrayList<>();
        String linea;
        BufferedReader bre = new BufferedReader(new FileReader("estudiantes.txt"));
        int opcion = 0;
        while ((linea = bre.readLine()) != null) {
            
            String[] partes = linea.split(",");
            String nombre = partes[0];
            String curso = partes[1];
            double matematicas = Double.parseDouble(partes[2]);
            double lengua = Double.parseDouble(partes[3]);
            double ingles = Double.parseDouble(partes[4]);
            double ciencias = Double.parseDouble(partes[5]);
            
            estudiantes.add(new Estudiante(nombre,curso,matematicas,lengua,ingles,ciencias));
        
        }
        
        bre.close();
        
        //
        
        List<Administrativo> administrativos = new ArrayList<>();
        BufferedReader bra = new BufferedReader(new FileReader("personal_administrativo.txt"));

        while ((linea = bra.readLine()) != null) {
            
            String[] partes = linea.split(",");
            String nombre = partes[0];
            String cargo = partes[1];
            String area = partes[2];
            double sueldo = Double.parseDouble(partes[3]);
            int aAntiguedad = Integer.parseInt(partes[4]);
            
            administrativos.add(new Administrativo(nombre,cargo,area,sueldo,aAntiguedad));
        
        }
        
        bra.close();
        
        //
        
        List<Profesores> profesores = new ArrayList<>();
        BufferedReader brp = new BufferedReader(new FileReader("profesores.txt"));
        
        while ((linea = brp.readLine()) != null) {
            
            String[] partes = linea.split(",");
            String nombre = partes[0];
            String departamento = partes[1];
            String especialidad = partes[2];
            double sueldo = Double.parseDouble(partes[3]);
            int hSemanales = Integer.parseInt(partes[4]);
            
            profesores.add(new Profesores(nombre,departamento,especialidad,sueldo,hSemanales));
        
        }
        
        brp.close();
        // creamos el menu 
        do {
            
            System.out.println("1. Ver sueldo de personal");
            System.out.println("2. Ver notas de estudiantes");
            System.out.println("3. Salir");
            
            System.out.println("Seleccione una opción:");
            opcion = s.nextInt();
            
            switch (opcion) {
                case 1:
                    int indice1 = 0;
                    int subopcion1 = 0;
                    
                    for (Profesores profesore : profesores) {
                        System.out.println(indice1 + ". " 
                                + profesore.getNombre());
                        indice1++;
                        
                    }
                    
                    for (Administrativo administrativo : administrativos) {
                        
                        System.out.println(indice1 + ". " 
                                + administrativo.getNombre());
                        indice1++;
                    }
                    indice1 = 0;
                    
                    System.out.println("Seleccione un personal: ");
                    
                    subopcion1 = s.nextInt();
                    
                    if((subopcion1 >= 0) && (subopcion1 <= 4)){
                        
                        System.out.println(subopcion1 + ". " + profesores.get(subopcion1).getNombre() + " -> " + 
                                "Sueldo: " + profesores.get(subopcion1).getSueldo() + 
                                " Departamento: " + profesores.get(subopcion1).getDepartamento() +
                                " Especialidad: " + profesores.get(subopcion1).getEspecialidad() +
                                " Horas Semanales: " + profesores.get(subopcion1).gethSemanales());
                    
                    }else if ((subopcion1 == 5) || (subopcion1 == 6) || (subopcion1 == 7)) {
                        if (subopcion1 == 5) {
                            
                            System.out.println(subopcion1 + ". " + administrativos.get(0).getNombre() + " -> " + 
                                "Sueldo: " + administrativos.get(0).getSueldo() + 
                                " Cargo: " + administrativos.get(0).getCargo()+
                                " Área: " + administrativos.get(0).getArea()+
                                " Años de antigüedad: " + administrativos.get(0).getaAntiguedad());
                            
                            
                        }else if (subopcion1 == 6) {
                            
                            System.out.println(subopcion1 + ". " + administrativos.get(1).getNombre() + " -> " + 
                                "Sueldo: " + administrativos.get(1).getSueldo() + 
                                " Cargo: " + administrativos.get(1).getCargo()+
                                " Área: " + administrativos.get(1).getArea()+
                                " Años de antigüedad: " + administrativos.get(1).getaAntiguedad());
                            
                        }else if (subopcion1 == 7) {
                            
                            System.out.println(subopcion1 + ". " + administrativos.get(2).getNombre() + " -> " + 
                                "Sueldo: " + administrativos.get(2).getSueldo() + 
                                " Cargo: " + administrativos.get(2).getCargo()+
                                " Área: " + administrativos.get(2).getArea()+
                                " Años de antigüedad: " + administrativos.get(2).getaAntiguedad());
                            
                        }
                        
                    }
                    
                    subopcion1 = 0;
                    
                    break;
                case 2:
                    int indice2 = 0;
                    int subopcion2 = 0;
                    for (Estudiante estudiante : estudiantes) {
                        System.out.println(indice2 + ". " 
                                + estudiante.getNombre()
                                + ", " + estudiante.getCurso());
                        indice2++;
                    }
                    indice2 = 0;
                    //seleccionar estudiante
                    System.out.println("Seleccione un estudiante para ver sus notas y el promedio: ");
                    subopcion2 = s.nextInt();
                    double promedio = Arrays.stream(estudiantes.get(subopcion2).getNotas()).average().orElse(0.0);
                    System.out.println(subopcion2 + ". " + estudiantes.get(subopcion2).getNombre() + 
                            " -> " + " Matematicas: " + estudiantes.get(subopcion2).getMatematicas()
                            + " Lengua: " + estudiantes.get(subopcion2).getLengua()
                            + " Ciencia: " + estudiantes.get(subopcion2).getCiencias()
                            + " Ingles: " + estudiantes.get(subopcion2).getIngles()
                            + " Promedio: " + promedio);
                    subopcion2 = 0;
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
        } while (opcion != 3);
        
        s.close();
    }
    
}
