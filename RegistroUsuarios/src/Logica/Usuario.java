/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
/**
 **
 ** @author Luis Alonso Corella Chaves - 27/09/2017
 **/
public class Usuario {
    private String nombres;
    private String apellidos;
    private String telefono;
    private String nickName;
    private String correo;
    private String contrasenna;
    public Usuario() {
    }
    public Usuario(String nombres, String apellidos, String telefono, String nickName, String correo, String contrasenna) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.nickName = nickName;
        this.correo = correo;
        this.contrasenna = contrasenna;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getNickName() {
        return nickName;
    }
    public String getCorreo() {
        return correo;
    }
    public String getContrasenna() {
        return contrasenna;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombres + " " + apellidos + "\nTelefono: " + telefono + "\nNickname: " + nickName
                + "\nCorreo: " + correo;
    }
}