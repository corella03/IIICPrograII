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
public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected String id;
    protected int edad;
    protected String email;
    protected String contrasenna;
    public Persona() {
    }
    public Persona(String nombre, String apellidos, String id, int edad, String email, String contrasenna) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.edad = edad;
        this.email = email;
        this.contrasenna = contrasenna;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getId() {
        return id;
    }
    public int getEdad() {
        return edad;
    }
    public String getEmail() {
        return email;
    }
    public String getContrasenna() {
        return contrasenna;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
}