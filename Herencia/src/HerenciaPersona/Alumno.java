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
public class Alumno extends Persona {
    private String carrera;
    public Alumno() {
    }
    public Alumno(String carrera, String nombre, String cedula) {
        super(nombre, cedula);
        this.carrera = carrera;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCédula: " + cedula + "\nCarrera: " + carrera;
    } 
}