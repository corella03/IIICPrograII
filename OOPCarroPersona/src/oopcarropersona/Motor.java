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
public class Motor {
    private int revolucionesPorMinuto = 0;
    private boolean activo ;

    public Motor() {
    }

    
    
    public int getRevolucionesPorMinuto() {
        return revolucionesPorMinuto;
    }
    public boolean estaActivo() {
        return activo;
    }
    public void cambiarRevolucionesPorMinuto(int revolucionesPorMinuto) {
        this.revolucionesPorMinuto = revolucionesPorMinuto;
    }
    public boolean activo(){
        return this.activo = true;
    }
    public boolean desactivo(){
        return this.activo = false;
    }
}