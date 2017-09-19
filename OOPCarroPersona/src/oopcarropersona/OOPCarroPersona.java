/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcarropersona;
/**
 **
 ** @author Luis Alonso Corella Chaves - 13/09/2017
 **/
public class OOPCarroPersona {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor m = new Motor();
        Coche  co = new Coche(m) ;
        co.enciende();
        co.acelera();
        co.acelera();
        co.acelera();
        co.frena();
        
    }  
}