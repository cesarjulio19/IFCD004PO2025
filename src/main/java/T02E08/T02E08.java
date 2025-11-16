/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T02E08;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class T02E08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //><
        Scanner s = new Scanner(System.in);
        int x;
        int y;
        boolean xMayor ;
        boolean yMayor ;
        boolean xyIguales ;
        String resultado;
        System.out.println("introduce el primer numero: ");
        x = s.nextInt();
        System.out.println("introduce el segundo numero: ");
        y = s.nextInt();
        xMayor = (x > y)  ? false : true;
        yMayor = (y > x)  ? false : true;
        xyIguales = (y == x)  ? false : true;
        
        resultado = (xMayor) ? "" : x + " es mayor que " + y;
        System.out.println(resultado);
        resultado = (yMayor) ? "" : y + " es mayor que " + x;
        System.out.println(resultado);
        resultado = (xyIguales) ? "" :  x + " y " + y + " son iguales";
        System.out.println(resultado);
        s.close();
    }
    
}
