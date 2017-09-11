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
    public Cuenta(){
        
    }
    public Cuenta(long numero, float saldo, double interesAnual) {
        this.numero = numero;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
    }
    public long getNumero() {
        return numero;
    }
    public float getSaldo() {
        return saldo;
    }
    public double getInteresAnual() {
        return interesAnual;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
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
    public void ingresoInteresMensual(){
        
    }
    /**
     * Para determinar si una cuenta esta en negativo
     * @return boolean True: si el saldo está en negativo, false: en caso contrario
     */
    public boolean enRojos(){
        return saldo < 0;
    }
}