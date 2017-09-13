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
public class Segmento {
    private double dim;
    public Segmento() {
    }
    public Segmento(double dim) {
        this.dim = dim;
    }
    public double getDim() {
        return dim;
    }
    public void setDim(double dim) {
        this.dim = dim;
    }
    @Override
    public String toString() {
        return "Segmento{" + "dim=" + dim + '}';
    }    
}