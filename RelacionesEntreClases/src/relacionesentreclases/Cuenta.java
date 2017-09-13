/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;
/**
 **
 ** @author Luis Alonso Corella Chaves - 11/09/2017
 **/
public class Cuenta {
    private long numero;
    private float saldo;
    private double interesAnual;
    private Cliente titular;

    public Cuenta() {
    }

    public Cuenta(long numero, double interesAnual, Cliente titular) {
        this.numero = numero;
        this.interesAnual = interesAnual;
        this.titular = titular;
    }
    
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    /**
     * Aumenta el saldo en la cantidad que recibe por parámetro
     * 
     * @param cantidad int indica la cantidad a depositar
     */
    public void ingreso(int cantidad){
        if(cantidad > 0){
            saldo += cantidad;
        }
    }
    /**
     * Permite retirar dinero de la cuenta 
     * @param cantidad int que indica la cantidad a retirar,debe ser menor o igual a saldo
     */
    public void reintegro(int cantidad){
       if(cantidad > 0 && cantidad <= saldo){
           saldo -= cantidad;
       } 
    }
    /**
     * Para determinar si una cuenta esta en negativo
     * @return boolean True: si el saldo está en negativo, false: en caso contrario
     */
    public boolean enRojos(){
        return saldo < 0;
    }
    public void ingresoInteresMensual(){
    }
    public int leerSaldo(){
        return 0;
    }
    public void salvar(){
    }
    
}