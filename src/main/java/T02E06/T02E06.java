/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E06;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radio;
        double area;
        double perimetro;
        double pi = 3.14;
        System.out.println("introduce el radio del circulo: ");
        radio = s.nextDouble();
        area = ( pi * (radio*radio));
        perimetro = 2 * pi * radio;
        System.out.println("el area del circulo es: " + area);
        System.out.println("el perimetro del circulo es: " + perimetro);
        s.close();
    }
    
}
