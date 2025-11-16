/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E09;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        int y;
        int z;
        boolean xMayor ;
        boolean yMayor ;
        boolean zMayor ;
        String resultado;
        
        System.out.println("introduce el primer numero: ");
        x = s.nextInt();
        System.out.println("introduce el segundo numero: ");
        y = s.nextInt();
        System.out.println("introduce el tercer numero: ");
        z = s.nextInt();
        
        xMayor = ((x > y) && (x > z))  ? false : true;
        yMayor = ((y > x) && (y > z))  ? false : true;
        zMayor = ((z > x) && (z > y))  ? false : true;
        
        resultado = (xMayor) ? "" : x + " es el mayor";
        System.out.println(resultado);
        resultado = (yMayor) ? "" : y + " es el mayor";
        System.out.println(resultado);
        resultado = (zMayor) ? "" :  z + " es el mayor";
        System.out.println(resultado);
        s.close();
    }
    
}
