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
public class Camion extends Vehiculo{
    double cargaEnToneladas;
    public Camion() {
    }
    @Override
    public String pito(){
        return "Po Po Po!!";
    }
    public double getCargaEnToneladas() {
        return cargaEnToneladas;
    }
    public void setCargaEnToneladas(double CargaEnToneladas) {
        this.cargaEnToneladas = CargaEnToneladas;
    }
    @Override
    public String toString() {
        return "Patente: " + placa + "\nMarca: " + marca + "\nCarga en toneladas: " + cargaEnToneladas;
    }
}