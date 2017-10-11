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
public class Personaje {
    //Protegido se usa mas en clases abstarctas
    protected String nombre;
    protected int nivelDeEnergia;
    public Personaje() {
    }
    public Personaje(String nombre, int nivelDeEnergia) {
        this.nombre = nombre;
        this.nivelDeEnergia = nivelDeEnergia;
    }
    /**
     * Incrementa el nivel propio de energía.
     * @param cantEnergia int: que recibe energía.
     */
    public void alimentarse(int cantEnergia){
        nivelDeEnergia += cantEnergia;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNivelDeEnergia() {
        return nivelDeEnergia;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNivelDeEnergia(int nivelDeEnergia) {
        this.nivelDeEnergia = nivelDeEnergia;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nNivel de energía: " + nivelDeEnergia;
    }
}