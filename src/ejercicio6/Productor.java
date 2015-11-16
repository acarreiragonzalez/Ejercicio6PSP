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
public class Productor extends Thread {
    private Monitor monitor;
    private String ingresos= "6541265874";
    
    public Productor(Monitor m){
    monitor=m;
    }
public void run(){
   
char c;

    for (int i = 0; i < 10; i++) {
    try {
        c=ingresos.charAt((int)(Math.random()*10));
        monitor.engadir(c);
        System.out.println("Fixose o ingreso de " +c+ "$ a conta");
        sleep((int)(Math.random()*100));
    } catch (InterruptedException ex) {
        Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
}  


}
