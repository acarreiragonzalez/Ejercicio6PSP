/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio6;

/**
 *
 * @author acarreiragonzalez
 */
public class Ejercicio6 {

  	public static void main( String args[] ) { 
		Monitor m = new Monitor(); 
		Productor p = new Productor( m ); 	
                Consumidor c = new Consumidor( m ); 				
                p.start(); 
		c.start(); 
		}
}
