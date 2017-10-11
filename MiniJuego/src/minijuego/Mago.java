/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minijuego;
/**
 **
 ** @author Luis Alonso Corella Chaves - 04/10/2017
 **/
public class Mago extends Personaje{
    private String poder;
    public Mago() {
    }

    public Mago(String poder, String nombre) {
        super(nombre, 100);
        this.poder = poder;
    }
    public String encantar(){
        if(this.nivelDeEnergia > 2){
            this.nivelDeEnergia -= 2;
        }else{
            System.out.println("No tiene suficiente energía.");
        }
        return "Poder: " + poder; 
    }
    public String getPoder() {
        return poder;
    }
    public void setPoder(String poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nNivel de energía: " + nivelDeEnergia + "\nPoder: " + poder;
    }
    
}