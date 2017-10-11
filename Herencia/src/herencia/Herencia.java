/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;
import HerenciaPersona.*;
import HerenciaVehiculo.*;
import java.util.ArrayList;

/**
 **
 ** @author Luis Alonso Corella Chaves - 02/10/2017
 **/
public class Herencia {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Persona persona = new Persona();
//        persona.setNombre("Karla");
//        persona.setCedula("205430123");
//        //
//        Alumno alumno = new Alumno();
//        alumno.setNombre("Alonso");
//        alumno.setCedula("207370888");
//        alumno.setCarrera("ISW");
//        System.out.println(persona.toString());
//        System.out.println("");
//        System.out.println(alumno.toString());
        //
        Camion c = new Camion();
        c.setPlaca("87362");
        c.setMarca("Toyota");
        c.setCargaEnToneladas(70);
        Vehiculo v = new Vehiculo();
        v.setPlaca("Volvo");
        v.setMarca("453452");
        CamionConCompartimiento cp = new CamionConCompartimiento();
        cp.setPlaca("82212");
        cp.setMarca("Toyoton");
        cp.setCargaEnToneladas(80);
        cp.setCantidadDeCompartimientos(5);
        cp.calcularCapacidadCarga();
        System.out.println(v.toString());
        System.out.println("");
        System.out.println(c.toString());
        System.out.println("");
        System.out.println(cp.toString());
        Autobus a = new Autobus();
        a.setCantidadAsientos(23);
        ArrayList<Vehiculo> listaVehiculo = new ArrayList<>();
        listaVehiculo.add(v);
        listaVehiculo.add(c);
        listaVehiculo.add(cp);
        listaVehiculo.add(a);
        for(Vehiculo vehiculo : listaVehiculo){
            if(vehiculo instanceof CamionConCompartimiento){
                System.out.println("Es un camion con compartimiento");
            }else if(vehiculo instanceof Camion){
                System.out.println("Es un camión");
            }else if(vehiculo instanceof Autobus){
                System.out.println("Es un Autobús");
            }else{
                System.out.println("Es otro");
            }
        } 
        System.out.println("");
        for(Vehiculo vehiculo : listaVehiculo){
            System.out.println(vehiculo.pito());
        }
        System.out.println("");
        for(Vehiculo vehiculo : listaVehiculo){
             if(vehiculo instanceof CamionConCompartimiento){
                System.out.println(((CamionConCompartimiento) vehiculo).getCantidadDeCompartimientos());
            }else if(vehiculo instanceof Camion){
                System.out.println(((Camion) vehiculo).getCargaEnToneladas());
            }else if(vehiculo instanceof Autobus){
                System.out.println(((Autobus) vehiculo).getCantidadAsientos());
            }
        }
    }
}