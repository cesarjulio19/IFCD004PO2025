/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02EJD;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class EJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         
         float litros;
         float lkm;
         float km;
         
         System.out.println("Introduce los litros en el tanque: ");
         litros = s.nextFloat();
         System.out.println("Introduce el consumo de litros por km: ");
         lkm = s.nextFloat();
         System.out.println("Introduce la distancia a recorrer: ");
         km = s.nextFloat();
         
         System.out.println("Los km que puede recorrer con " + litros + " litros de gasolinaes es: ");
         float kmRecorridos = 0;
         kmRecorridos = litros / lkm;
         System.out.println(kmRecorridos);
         
         if (kmRecorridos >= km) {
            System.out.println("Puedes recorrer esa distancia con los litros en el coche");
         }else{
            System.out.println(" No puedes recorrer esa distancia con los litros en el coche, faltarian "
                    + (km - kmRecorridos) + "Km para llegar a su destino");
         }
         
         s.close();
         
         
         
    }
    
}
