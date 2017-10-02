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
public class LogicaPrograma {
    private ArrayList<Persona> listaPersonas;
    private ArrayList<Lugar> lugares;
    private ArrayList<Perfil> perfiles;
    private int expediente;
    private boolean tipoRegistro;//true registra perfil --false registra lugares
    public LogicaPrograma() {
        listaPersonas = new ArrayList<>();
        lugares = new ArrayList<>();
        perfiles = new ArrayList<>();
        expediente = 0;
    }
    public void añadirLugares(String nombre, String direccion, String telefono){
        lugares.add(new Lugar(nombre, direccion, telefono));
    }
    public void añadirPerfiles(int perfil, String descripcion){
        perfiles.add(new Perfil(perfil, descripcion));
    }
    public void registarPersona(Persona persona){
        listaPersonas.add(persona);
    }
    public int expediente(){
        return ++expediente;
    }
    public void registrosQuemados(){
        Perfil p =  new Perfil(21, "Asesinato");
        perfiles.add(p);
        Perfil p1 =  new Perfil(34, "Robo");
        perfiles.add(p1);
        Perfil p2 =  new Perfil(12, "Violador");
        perfiles.add(p2);
        Perfil p3 =  new Perfil(76, "Extroción");
        perfiles.add(p3);
        Perfil p4 =  new Perfil(11, "Fraude");
        perfiles.add(p4);
    }
    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }
    public ArrayList<Lugar> getLugares() {
        return lugares;
    }
    public ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }
    public int getExpediente() {
        return expediente;
    }
    public boolean isTipoRegistro() {
        return tipoRegistro;
    }
    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    public void setLugares(ArrayList<Lugar> lugares) {
        this.lugares = lugares;
    }
    public void setPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }
    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }
    public void setTipoRegistro(boolean tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }
}