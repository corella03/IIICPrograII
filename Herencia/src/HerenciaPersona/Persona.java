/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaPersona;
/**
 **
 ** @author Luis Alonso Corella Chaves - 02/10/2017
 **/
public class Persona {
    protected String nombre;
    protected String cedula;
    public Persona() {
    }
    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCédula: " + cedula;
    }
}