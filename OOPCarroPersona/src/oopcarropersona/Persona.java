/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcarropersona;
/**
 **
 ** @author Luis Alonso Corella Chaves - 13/09/2017
 **/
public class Persona {
    private String nombre;
    Corazon corazon;
    Coche coche;
    public Persona(String nombre) {
        this.nombre = nombre;
        this.corazon = new Corazon(75);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
    public void asignarCoche(Coche coche) {
        this.coche = coche;
    }
    public void viaja(){
        
        if(this.coche != null){
            this.coche.enciende();
            this.coche.acelera();
        }else{
            System.out.println("No tienes Coche");
        }
    }
    /**
     * Aunmenta el ritmo cardiaco de la persona
     */
    public void emociona(){
        this.corazon.cambiarRitmo(+ 26);
    }
    /**
     * Reduce el ritmo cardiaco de la persona
     */
    public void tranquiliza(){
        if(this.corazon.leerRitmo() > 0 ){
            this.corazon.cambiarRitmo(- 26);
        }
    }
}