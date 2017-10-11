/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaVehiculo;
/**
 **
 ** @author Luis Alonso Corella Chaves - 02/10/2017
 **/
public class CamionConCompartimiento extends Camion{
    int cantidadDeCompartimientos;
    public CamionConCompartimiento() {
    }
    public int getCantidadDeCompartimientos() {
        return cantidadDeCompartimientos;
    }
    public double calcularCapacidadCarga(){
        return cargaEnToneladas / cantidadDeCompartimientos;
    }
    public void setCantidadDeCompartimientos(int cantidadDeCompartimientos) {
        this.cantidadDeCompartimientos = cantidadDeCompartimientos;
    }
    @Override
    public String toString() {
        return "Patente: " + placa + "\nMarca: " + marca + "\nCarga en toneladas: " + cargaEnToneladas
            + "\nCantidad de Compartimientos: " + cantidadDeCompartimientos + "\nCapacidad de Carga: " + calcularCapacidadCarga(); 
    }
}