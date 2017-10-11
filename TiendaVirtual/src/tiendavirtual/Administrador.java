/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavirtual;
/**
**
** @author Luis Alonso Corella Chaves - 04/10/2017
**/
public class Administrador extends Persona{
    public Administrador() {
    }
    public Administrador(String nombre, String apellidos, String id, int edad, String email, String contrasenna) {
        super(nombre, apellidos, id, edad, email, contrasenna);
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellios: " + apellidos + "\nCédula: " + id + "\nEdad: " + edad
                + "\nE-mail: " + email ;
    } 
}