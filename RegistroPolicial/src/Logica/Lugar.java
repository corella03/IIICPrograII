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
public class Lugar {
    private String nombre;
    private String direccion;
    private String telefono;
    public Lugar() {
    }
    public Lugar(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "nombre: " + nombre + " ( " + telefono+ " )";
    }
}