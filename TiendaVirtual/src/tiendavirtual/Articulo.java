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
public abstract class Articulo {
    protected String nombre;
    protected int precio;
    protected int cantPaginas;
    protected int cantUnidades;
    protected String editorial;
    protected String genero;
    protected int codigo;
    protected int tipo;
    public Articulo() {
    }
    public Articulo(String nombre, int precio, int cantPaginas, int cantUnidades, String editorial, String genero, int codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantPaginas = cantPaginas;
        this.cantUnidades = cantUnidades;
        this.editorial = editorial;
        this.genero = genero;
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public int getCantPaginas() {
        return cantPaginas;
    }
    public int getCantUnidades() {
        return cantUnidades;
    }
    public String getEditorial() {
        return editorial;
    }
    public String getGenero() {
        return genero;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }
    public void setCantUnidades(int cantUnidades) {
        this.cantUnidades = cantUnidades;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nPrecio: " + precio + "\nCant. Páginas: " + cantPaginas + "\nCant. Unidades"
                + cantUnidades + "\nEditorial: " + editorial + "\nGenero: " + genero + "\nCódigo: " + codigo;
    }
}
