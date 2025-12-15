/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

/**
 *
 * @author César
 */
public class Reloj {
    
    private int hora;   
    private int minuto; 
    private int segundo;
    
    public Reloj(int hora, int minuto, int segundo) {
        setTiempo(hora, minuto, segundo);
    }
    
    // Constructor por defecto 00:00:00
    public Reloj() {
        this(0, 0, 0);
    }
    
    // Establecer la hora de forma segura (sincronizado)
    public synchronized void setTiempo(int h, int m, int s) {
        if (h < 0 || h > 23) throw new IllegalArgumentException("Hora debe ser 0-23");
        if (m < 0 || m > 59) throw new IllegalArgumentException("Minuto debe ser 0-59");
        if (s < 0 || s > 59) throw new IllegalArgumentException("Segundo debe ser 0-59");
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }
    
    // Obtener tiempo actual como array [h, m, s]
    public synchronized int[] getTiempo() {
        return new int[]{hora, minuto, segundo};
    }
    
    // Avanza el tiempo un segundo (segundo -> minuto -> hora)
    public synchronized void tick() {
        segundo++;
        if (segundo >= 60) {
            segundo = 0;
            minuto++;
            if (minuto >= 60) {
                minuto = 0;
                hora++;
                if (hora >= 24) {
                    hora = 0;
                }
            }
        }
    }
    
    // Formatea la hora en HH:MM:SS con ceros a la izquierda
    public synchronized String formato() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
    
}
