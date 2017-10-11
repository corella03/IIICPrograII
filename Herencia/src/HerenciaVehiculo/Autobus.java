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
public class Autobus extends Vehiculo{
    int cantidadAsientos;
    public Autobus() {
    }
    @Override
    public String pito(){
        return "Quaaaa!!";
    }
    public int getCantidadAsientos() {
        return cantidadAsientos;
    }
    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    @Override
    public String toString() {
        return "Patente: " + placa + "\nMarca: " + marca + "\n Cantidad Asientos: " + cantidadAsientos;
    } 
}