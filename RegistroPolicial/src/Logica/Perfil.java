/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
/**
 **
 ** @author Luis Alonso Corella Chaves - 20/09/2017
 **/
public class Perfil {
    private int tipoPerfil;
    private String descripcion;
    public Perfil() {
    }
    public Perfil(int tipoPerfil, String descripcion) {
        this.tipoPerfil = tipoPerfil;
        this.descripcion = descripcion;
    }
    public int getTipoPerfil() {
        return tipoPerfil;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setTipoPerfil(int tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tipo Perfil: " + tipoPerfil + "\n" + "Descripción: " + descripcion;
    }
    
}