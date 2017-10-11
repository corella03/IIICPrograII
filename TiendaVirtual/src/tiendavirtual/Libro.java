/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavirtual;
/**
**
** @author Luis Alonso Corella Chaves - 04/10/2017
**/
public class Libro extends Articulo{
    private String autor;
    private boolean capitulos;
    public Libro() {
    }
    public Libro(String autor, boolean capitulos, String nombre, int precio, int cantPaginas, int cantUnidades, 
            String editorial, String genero, int codigo) {
        super(nombre, precio, cantPaginas, cantUnidades, editorial, genero, codigo);
        this.autor = autor;
        this.capitulos = capitulos;
    }
    public String getAutor() {
        return autor;
    }
    public boolean isCapitulos() {
        return capitulos;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setCapitulos(boolean capitulos) {
        this.capitulos = capitulos;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nPrecio: " + precio + "\nCant. Páginas: " + cantPaginas + "\nCant. Unidades"
                + cantUnidades + "\nEditorial: " + editorial + "\nGenero: " + genero + "\nCódigo: " + codigo 
                + "\nAutor: " + autor + "\nCapitulos: " + capitulos;
    }
}