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
public class Vehiculo {
    protected String placa;
    protected String marca;
    public Vehiculo() {
    }
    public String pito(){
        return "pi";
    }
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Patente: " + placa + "\nMarca: "+ marca;
    }
}