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
public class Coche {
    private Motor motor;
    private Persona persona;
    public Coche(Motor motor) {
        this.motor = motor;
    }

    Coche() {        
    }
    /**
     * 
     * @param persona 
     */
    public void asignarPersona(Persona persona) {
        this.persona = persona;
    }
    /**
     * 
     */
    public void enciende(){
        if(this.motor != null && ! this.motor.activo()){
            this.motor.activo();
        }
    }
    /**
     * 
     */
    public void apaga(){
        if(this.motor.estaActivo()){
            this.motor.desactivo();
        }
    }
    /**
     * 
     */
    public void acelera(){
        //if(this.motor.activo()){

        this.motor.cambiarRevolucionesPorMinuto(this.motor.getRevolucionesPorMinuto() + 30);
        System.out.println(this.motor.getRevolucionesPorMinuto());
        //}
        //this.persona.emociona();
    }
    /**
     * 
     */
    public void frena(){//revisar
        if(this.motor.getRevolucionesPorMinuto() > 0){
            this.motor.cambiarRevolucionesPorMinuto(this.motor.getRevolucionesPorMinuto() - 25);
            //this.persona.tranquiliza();
            System.out.println(this.motor.getRevolucionesPorMinuto());
        }
    }
    /**
     * 
     * @return boolean: 
     */
    public boolean estaEncendido(){
        return this.motor.estaActivo();
    }
}