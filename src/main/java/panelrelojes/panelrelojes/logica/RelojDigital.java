/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panelrelojes.panelrelojes.logica;

/**
 *
 * @author cving
 */
public class RelojDigital {
    private int hh;
    private int mm;
    private int ss;
    
   public RelojDigital(){
      this(0, 0, 0);
   }
   
   public RelojDigital(int hh, int mm,int ss){
      this.hh=hh;
      this.mm=mm;
      this.ss =ss;
   }
   
   public void addHour(){
    if(++this.hh==24){
        this.hh =0;
    }
   }
   
   public void addMin(){
       if(++this.mm==60){
           this.mm=0;
           addHour();
       }
   }
   
   public  void addSecond(){
       if(++this.ss==60){
           this.ss=0;
           addMin();
       }
   }
   
   public int getHour(){
       return this.hh;
   }
   
   public int getMin(){
       return this.mm;
   }
   
   public int getSecond(){
       return this.ss;
   }
   
   public  void setHour(int hour){
       hh=hour;
   }
   public  void setMin(int min){
       mm=min;
   }
   public  void setSecond(int sec){
       ss=sec;
   }
    
   @Override
   public String toString(){
       return String.format("%02d:%02d:%02d", this.hh,this.mm,this.ss);
   }
}
