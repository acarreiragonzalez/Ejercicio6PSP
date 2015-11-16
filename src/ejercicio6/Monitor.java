/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acarreiragonzalez
 */
public class Monitor {
    
   private char buffer[]=new char[10];
   private int siguiente=0;
   
   
   private boolean estaCheo=false;
   private boolean estaBaleiro=true;
   
   
   
   public synchronized char recoller(){
   
   while (estaBaleiro==true)
       try {
           wait();
       } catch (InterruptedException ex) {
           Logger.getLogger(Monitor.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       siguiente--;
       
       if (siguiente==0)
           estaBaleiro=true;
       estaCheo=false;
       
       notify();
       return (buffer [siguiente]);
       
       
       }
    
    
   public synchronized void engadir(char c){
   while(estaCheo==true)
       
       try {
           wait();
       } catch (InterruptedException ex) {
           Logger.getLogger(Monitor.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       buffer[siguiente]=c;
       siguiente++;
       if (siguiente==10)
           estaCheo=true;
       estaBaleiro=false;
  
       
       notify();
   }
    
}
