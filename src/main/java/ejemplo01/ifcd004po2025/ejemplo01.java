/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo01.ifcd004po2025;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here><
         Scanner s = new Scanner(System.in);
    
    int horasTrabajo;
    float valorHora;
    float sueldo;
    
    System.out.println("Introduce el numero de horas: ");
    horasTrabajo = s.nextInt();
    System.out.println("Introduce el valor por hora: ");
    valorHora = s.nextFloat();
    sueldo = horasTrabajo * valorHora;
    System.out.println("el sueldo del trabajador por las horas realizadas es de : " + sueldo);
    
    s.close();
    }
    
}
