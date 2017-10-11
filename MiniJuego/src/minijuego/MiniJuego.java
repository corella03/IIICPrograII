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
public class MiniJuego {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Luchador luchador = new Luchador(" Wuju -no ", "Irelia", 60);
        //Mago
        Mago mago = new Mago("Onda de choque", "Orianna");
        System.out.println("Luchador:");
        System.out.println(luchador.toString());
        System.out.println("\nMago:");
        System.out.println(mago.toString());
        System.out.println("");
        //Probando Luchador
        System.out.println("Probando Luchador");
        //luchador.alimentarse(34);
        System.out.println(luchador.toString());
        System.out.println("");
        luchador.combatir(54);
        System.out.println(luchador.toString());
        System.out.println("");
        luchador.combatir(32);
        System.out.println(luchador.toString());
        System.out.println("");
        //Probando Mago
        System.out.println("Probando Mago");
        //mago.alimentarse(13);
        System.out.println(mago.toString());
        System.out.println("");
        mago.encantar();
        System.out.println(mago.toString());
        mago.encantar();
        System.out.println(mago.toString());
    } 
}