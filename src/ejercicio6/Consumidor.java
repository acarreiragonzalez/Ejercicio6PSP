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
public class Consumidor extends Thread {
    private Monitor monitor;
    
    public Consumidor(Monitor m){
    monitor=m;
    }
    public void run(){
    char c;
        for (int i = 0; i < 5; i++) {
        try {
            c=monitor.recoller();
            System.out.println("Sacáronse " +c+" $ da conta");
            sleep((int)(Math.random()*600));
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
