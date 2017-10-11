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
public class Usuario extends Persona{
    private String direccion;
    private String nickName;
    private int codigoPostal;
    private int sexo;
    private Carrito carrito;
    public Usuario() {
    }
    public Usuario(String direccion, String nickName, int codigoPostal, int sexo, String nombre,
            String apellidos, String id, int edad, String email, String contrasenna) {
        super(nombre, apellidos, id, edad, email, contrasenna);
        this.direccion = direccion;
        this.nickName = nickName;
        this.codigoPostal = codigoPostal;
        this.sexo = sexo;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getNickName() {
        return nickName;
    }
    public int getCodigoPostal() {
        return codigoPostal;
    }
    public int getSexo() {
        return sexo;
    }
    public Carrito getCarrito() {
        return carrito;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellios: " + apellidos + "\nCédula: " + id + "\nEdad: " + edad
                + "\nE-mail: " + email + "\nDirección: " + direccion + "\nNickName: " + nickName 
                + "\nCódigo Postal: " + codigoPostal;
    }
}