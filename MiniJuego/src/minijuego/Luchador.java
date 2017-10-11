/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minijuego;
/**
**
** @author Luis Alonso Corella Chaves - 04/10/2017
**/
public class Luchador extends Personaje{
    private String arma;
    public Luchador() {
    }
    public Luchador(String arma, String nombre, int nivelDeEnergia) {
        super(nombre, nivelDeEnergia);
        this.arma = arma;
    }
    public String combatir(int cantEnergia){
        if(getNivelDeEnergia() > cantEnergia){
            setNivelDeEnergia(getNivelDeEnergia() - cantEnergia);
        }else{
             System.out.println("No tiene suficiente energía.");
        }
        return "Arma: " + arma + "\nCantidad Energía: " + cantEnergia;
    }
    public String getArma() {
        return arma;
    }
    public void setArma(String arma) {
        this.arma = arma;
    }
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\nNivel de energía: " + getNivelDeEnergia() + "\nArma :" + arma;
    }
}