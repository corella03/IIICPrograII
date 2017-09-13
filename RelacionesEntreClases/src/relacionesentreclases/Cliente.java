/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;
import java.util.Date;
/**
 **
 ** @author Luis Alonso Corella Chaves - 11/09/2017
 **/
public class Cliente {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String localidad;
    private Date fNacimiento;
    public Cliente() {
    }
    public Cliente(String nombre, String apellidos, String direccion, String localidad, Date fNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fNacimiento = fNacimiento;
    }
    
    /**
     * Obtiene el nombre completo del cliente
     * @return String con el nombre completo del cliente
     */
    public String nombreCompleto(){
        return nombre + " " + apellidos;
    }
    /**
     * Obtiene dirección exacta del cliente
     * @return String con la dirección
     */
    public String direccionCompleta(){
        return localidad + ", " + direccion;
    }
}