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
public class Revista extends Articulo{
    public Revista() {
    }
    public Revista(String nombre, int precio, int cantPaginas, int cantUnidades, String editorial, String genero, 
            int codigo) {
        super(nombre, precio, cantPaginas, cantUnidades, editorial, genero, codigo);
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nPrecio: " + precio + "\nCant. Páginas: " + cantPaginas + "\nCant. Unidades"
                + cantUnidades + "\nEditorial: " + editorial + "\nGenero: " + genero + "\nCódigo: " + codigo;
    }
}