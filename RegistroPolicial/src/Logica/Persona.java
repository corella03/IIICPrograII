/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.util.ArrayList;
/**
 **
 ** @author Luis Alonso Corella Chaves - 20/09/2017
 **/
public class Persona {
    private String nombre;
    private String apellido;
    private ArrayList<Perfil> perfiles;
    private ArrayList<Lugar> lugaresFrecuntes;
    private Foto foto;
    private int numeroExpediente; 
    public Persona() {
        perfiles = new ArrayList<>();
        lugaresFrecuntes = new ArrayList<>();
    }
    public Persona(String nombre, String apellido, int numeroExpediente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.perfiles = new ArrayList<>();
        lugaresFrecuntes = new ArrayList<>();
        this.numeroExpediente =  numeroExpediente;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }
    public ArrayList<Lugar> getLugaresFrecuntes() {
        return lugaresFrecuntes;
    }
    public Foto getFoto() {
        return foto;
    }
    public int getNumeroExpediente() {
        return numeroExpediente;
    } 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }
    public void setLugaresFrecuntes(ArrayList<Lugar> lugaresFrecuntes) {
        this.lugaresFrecuntes = lugaresFrecuntes;
    }
    public void setFoto(Foto foto) {
        this.foto = foto;
    }
    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }
    /**
     * 
     * @param lugar 
     */
    public void agregarLugarFrcuente(Lugar lugar){
        this.lugaresFrecuntes.add(lugar);
    }
    /**
     * Crea un nuevo perfil para la persona
     * @param tipoPerfin
     * @param descripcion 
     */
    public void agregarPerfil(int tipoPerfin, String descripcion){
        perfiles.add(new Perfil(tipoPerfin, descripcion));
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Expediente:" + numeroExpediente;
    }
}