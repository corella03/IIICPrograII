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
public class Corazon {
    private int ritmo;

    public Corazon(int ritmo) {
        this.ritmo = ritmo;
    }
    
    public int leerRitmo() {
        return ritmo;
    }
    public void cambiarRitmo(int ritmo) {
        this.ritmo = ritmo;
    }   
}