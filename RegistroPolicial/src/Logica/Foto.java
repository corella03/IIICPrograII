/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
/**
 **
 ** @author Luis Alonso Corella Chaves - 20/09/2017
 **/
public class Foto {
    private String pathToFile;
    private String tipoArchivo;
    private float tamaño;
    public Foto() {
    }
    public Foto(String pathToFile, String tipoArchivo, float tamaño) {
        this.pathToFile = pathToFile;
        this.tipoArchivo = tipoArchivo;
        this.tamaño = tamaño;
    }
    public String getPathToFile() {
        return pathToFile;
    }
    public String getTipoArchivo() {
        return tipoArchivo;
    }
    public float getTamaño() {
        return tamaño;
    }
    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }
    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
}