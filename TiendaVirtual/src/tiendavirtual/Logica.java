/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavirtual;
import java.util.ArrayList;
/**
**
** @author Luis Alonso Corella Chaves - 05/10/2017
**/
public class Logica {
    private ArrayList<Persona> listaDeUsuarios;
    private ArrayList<Articulo> listaArticulos;
    private Persona logeado;
    private boolean tipoDeUsuario;
    private boolean tipoDeVistaDatosUsu;
    private boolean tipoDeVistaProductos;
    private Articulo articulo;
    public Logica() {
        listaDeUsuarios = new ArrayList<>();
        listaArticulos = new ArrayList<>();
        quemados();
        articulosQuemados();
    }
    public void quemados(){
        Persona usuario = new Usuario("Dulce nombre", "corella03", 
                209872, 1, "alonso", "corella", "3234", 22, "laonso", "1234");
        Persona admin = new Administrador("Luis", "Chaves", "208880737", 22, "lcorellac", "123");
        listaDeUsuarios.add(usuario);
        listaDeUsuarios.add(admin);
    }
    /**
     * Verifica si el usuario existe o no (Login).
     * @param correoNick String: que recibe el nickName o Correo ingresado.
     * @param contra String: que recibe la contraseña ingresada.
     * @return true: si el usuario existe, false: si el usuario no existe.
     */
    public boolean login(String correoNick, String contra){
        for(Persona usuario: listaDeUsuarios){
            if(usuario instanceof Usuario){
                if((correoNick.equals(usuario.email) || correoNick.equals(((Usuario) usuario).getNickName())) 
                && contra.equals(usuario.contrasenna)){
                    tipoDeUsuario = true;
                    logeado = usuario;
                    return true;
                }
            }else if (usuario instanceof Administrador){
                if(correoNick.equals(usuario.email) && contra.equals(usuario.contrasenna)){
                    tipoDeUsuario = false;
                    logeado = usuario;
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * 
     * @param valor
     * @return 
     */
    public boolean verificaQueSeanNumeros(String valor){
        boolean numero = true;
        for (int i = 0; i < valor.length(); i++) { 
            if (!Character.isDigit(valor.charAt(i))) {
                numero = false;
            }
        }
        return numero;
    }
    /**
     * Verifica que a la hora de registrar o editar un usuario no sea igual a uno ya creado.
     * @param correoONick String que recibe el correo.
     * @return true: si el usuario ya ha sido registrado. false: si no se ha registrado.
     */
    public boolean verificarExistenciaAlLogearse(String correoONick){
        for(Persona usuario: listaDeUsuarios){
             if (usuario instanceof Administrador){
                if(correoONick.equals(((Administrador) usuario).email)){
                    return true;
                }
            }else if(usuario instanceof Usuario){
                if((correoONick.equals(usuario.email) || correoONick.equals(((Usuario) usuario).getNickName()))){
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * Verifica que a la hora de registrar o editar un usuario no sea igual a uno ya creado.
     * @param correo
     * @param nick
     * @return true: si el usuario ya ha sido registrado. false: si no se ha registrado.
     */
    public boolean verificarExistenciaAlRegistrarse(String correo, String nick){
        for(Persona usuario: listaDeUsuarios){
             if (usuario instanceof Administrador){
                if(correo.equals(((Administrador) usuario).email)){
                    return false;
                }
            }else if(usuario instanceof Usuario){
                if((correo.equals(usuario.email) || nick.equals(((Usuario) usuario).getNickName()))){
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Verifica si al Loguearse la persona es de tipo usuario o administrador
     * @return true: Si la persona logueada es de tipo usuario, false: si la persona logueada es de tipo Administrador
     */
    public boolean tipoUsuario(){
        return tipoDeUsuario;
    }
    /**
     *  Verifica que no hayan espacios vacíos a la hora de iniciar sesión.
     * @param nickCorreo String: que recibe nickName o correo.
     * @param contra String: que recibe contraseña.
     * @return true: Si tienen datos, false: Si estan vacías.
     */
    public boolean espaciosLogin(String nickCorreo, String contra){
        return !nickCorreo.isEmpty() && !contra.isEmpty();
    } 
    /**
     * Verifica que no hayan espacios vacíos a la hora de registrar o editardatos de un usuario.
     * @param nombre String: que recibe el nombre.
     * @param apellido String: que recibe el apellido.
     * @param cedula String: que recibe la cédula.
     * @param edad String: que recibe la edad.
     * @param direccion String: que recibe la dirección.
     * @param codigoPostal String: que recibe el código postal.
     * @param email String: que recibe el email.
     * @param nickName String: que recibe el nickName.
     * @param contrasenna String: que recibe la contrasenna.
     * @param verifiContrasenna String: que recibe la verificación de la contraseña
     * @return true: Si tienen datos, false: Si tiene alguna vacía.
     */
    public boolean espaciosDatosUsuarios(String nombre, String apellido, String cedula, String edad, String direccion
        , String codigoPostal, String email, String nickName, String contrasenna, String verifiContrasenna){
        return !nombre.isEmpty() && !apellido.isEmpty() && !cedula.isEmpty() && !edad.isEmpty() && !direccion.isEmpty()
                && !codigoPostal.isEmpty() && !email.isEmpty() && !nickName.isEmpty() && !contrasenna.isEmpty()
                && !verifiContrasenna.isEmpty();
    }
    /**
     *
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @param direccion
     * @param codPostal
     * @param genero
     * @param nickName
     * @param email
     * @param contra
     */
    public void editarPerilUsu(String nombre, String apellido, String cedula, int edad, String direccion
        ,int codPostal ,int genero, String nickName, String email, String contra){
        ((Usuario) logueado()).setNombre(nombre);
        ((Usuario) logueado()).setApellidos(apellido);
        ((Usuario) logueado()).setId(cedula);
        ((Usuario) logueado()).setEdad(edad);
        ((Usuario) logueado()).setDireccion(direccion);
        ((Usuario) logueado()).setCodigoPostal(codPostal);
        ((Usuario) logueado()).setSexo(genero);
        ((Usuario) logueado()).setNickName(nickName);
        ((Usuario) logueado()).setEmail(email);
        ((Usuario) logueado()).setContrasenna(contra);
    }
    /**
     *
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @param email
     * @param contra
     */
    public void editarPerilAdmin(String nombre, String apellido, String cedula, int edad, String email
        ,String contra){  
        ((Administrador) logueado()).setNombre(nombre);
        ((Administrador) logueado()).setApellidos(apellido);
        ((Administrador) logueado()).setId(cedula);
        ((Administrador) logueado()).setEdad(edad);
        ((Administrador) logueado()).setEmail(email);
        ((Administrador) logueado()).setContrasenna(contra);
    }
    /**
     * 
     * @param nombre
     * @param codigo
     * @param precio
     * @param cantPag
     * @param cantUni
     * @param editorial
     * @param genero
     * @param autor
     * @param cap 
     */
    public void editarLibro(String nombre, int codigo, int precio, int cantPag, int cantUni
        ,String editorial, String genero, String autor, boolean cap){  
        ((Libro) articuloSeleccionado()).setNombre(nombre);
        ((Libro) articuloSeleccionado()).setCodigo(codigo);
        ((Libro) articuloSeleccionado()).setPrecio(precio);
        ((Libro) articuloSeleccionado()).setCantPaginas(cantPag);
        ((Libro) articuloSeleccionado()).setCantUnidades(cantUni);
        ((Libro) articuloSeleccionado()).setEditorial(editorial);
        ((Libro) articuloSeleccionado()).setGenero(genero);
        ((Libro) articuloSeleccionado()).setAutor(autor);
        ((Libro) articuloSeleccionado()).setCapitulos(cap);  
    }
    /**
     * 
     * @param nombre
     * @param codigo
     * @param precio
     * @param cantPag
     * @param cantUni
     * @param editorial
     * @param genero
     * @param autor
     * @param cap 
     */
    public void editarNovela(String nombre, int codigo, int precio, int cantPag, int cantUni
        ,String editorial, String genero, String autor, boolean cap){  
        ((Novela) articuloSeleccionado()).setNombre(nombre);
        ((Novela) articuloSeleccionado()).setCodigo(codigo);
        ((Novela) articuloSeleccionado()).setPrecio(precio);
        ((Novela) articuloSeleccionado()).setCantPaginas(cantPag);
        ((Novela) articuloSeleccionado()).setCantUnidades(cantUni);
        ((Novela) articuloSeleccionado()).setEditorial(editorial);
        ((Novela) articuloSeleccionado()).setGenero(genero);
        ((Novela) articuloSeleccionado()).setAutor(autor);
        ((Novela) articuloSeleccionado()).setCapitulos(cap);  
    }
    /**
     * 
     * @param nombre
     * @param codigo
     * @param precio
     * @param cantPag
     * @param cantUni
     * @param editorial
     * @param genero
     * @param autor
     * @param Ilus 
     */
    public void editarCuento(String nombre, int codigo, int precio, int cantPag, int cantUni
        ,String editorial, String genero, String autor, boolean Ilus){  
        ((Cuento) articuloSeleccionado()).setNombre(nombre);
        ((Cuento) articuloSeleccionado()).setCodigo(codigo);
        ((Cuento) articuloSeleccionado()).setPrecio(precio);
        ((Cuento) articuloSeleccionado()).setCantPaginas(cantPag);
        ((Cuento) articuloSeleccionado()).setCantUnidades(cantUni);
        ((Cuento) articuloSeleccionado()).setEditorial(editorial);
        ((Cuento) articuloSeleccionado()).setGenero(genero);
        ((Cuento) articuloSeleccionado()).setAutor(autor);
        ((Cuento) articuloSeleccionado()).setIlustrado(Ilus);  
    }
    /**
     * 
     * @param nombre
     * @param codigo
     * @param precio
     * @param cantPag
     * @param cantUni
     * @param editorial
     * @param genero 
     */
    public void editarRevista(String nombre, int codigo, int precio, int cantPag, int cantUni
        ,String editorial, String genero){  
        ((Revista) articuloSeleccionado()).setNombre(nombre);
        ((Revista) articuloSeleccionado()).setCodigo(codigo);
        ((Revista) articuloSeleccionado()).setPrecio(precio);
        ((Revista) articuloSeleccionado()).setCantPaginas(cantPag);
        ((Revista) articuloSeleccionado()).setCantUnidades(cantUni);
        ((Revista) articuloSeleccionado()).setEditorial(editorial);
        ((Revista) articuloSeleccionado()).setGenero(genero);
    }
    /**
     * 
     * @param nombre
     * @param codigo
     * @param precio
     * @param pag
     * @param editorial
     * @param genero
     * @return 
     */
    public boolean verificarDatosProducto(String nombre, String codigo, String precio, String pag, String editorial
        ,String genero){
       return !nombre.isEmpty() && !codigo.isEmpty() && !precio.isEmpty() && !pag.isEmpty() && !editorial.isEmpty()
               && !genero.isEmpty();
    }
    /**
     * 
     * @param codigo
     * @return 
     */
    public boolean verificaExistenciaProducto(int codigo){
        for(Articulo articulo : listaArticulos){
            if(codigo == articulo.getCodigo()){
                return true;
            }
        }
        return false;
    }
    /**
     * 
     * @return 
     */
    public boolean tipoVistaProductos(){
        return tipoDeVistaProductos;
    }
    /**
     * Guarda un usuario ya registrado.
     * @return Usuario: Retorna el usuario con el que se inicia sesión.
     */
    public Persona logueado(){
        return logeado;
    }
    /**
     * 
     * @return 
     */
    public Articulo articuloSeleccionado(){
        return this.articulo;
    }
    public void articulosQuemados(){
        Articulo libro = new Libro("Pedro", true, "Nombre del Viento", 1500, 865, 14, "CPR", "Fantaia", 12); 
        registarProducto(libro);
        Articulo novela = new Novela("Juan", false, "Galletas", 6545, 384, 9, "PPw", "Comedia", 15);
        registarProducto(novela);
    }
    /**
     * Registra usuario.
     * @param usuario Usuario: recibe usuario con todos los datos.
     */
    public void registroUsuario(Persona usuario) {
        listaDeUsuarios.add(usuario);
    }
    /**
     * Determina si la ventana de datos usuario es para registrar o editar perfil.
     * @return true: Si va a registrar, false: Si va a editar perfil.
     */
    public boolean vistaDatosUsuario(){
        return tipoDeVistaDatosUsu;
    }
    /**
     * Verifica que cuando se esta registrando o editando un usuario las contraseñas tienen que ser iguales-
     * @param contra String: que recibe la contraseña.
     * @param veriContra String: que recibe la verificacion de la contraseña.
     * @return true: si las contraseñas son iguales, false: si las contraseñas son diferentes.
     */
    public boolean verificaIgualdadContra(String contra, String veriContra){
        if(contra.equals(veriContra)){
            return true;
        }
        return false;
    }
    /**
     * 
     * @param articulo 
     */
    public void registarProducto(Articulo articulo){
        listaArticulos.add(articulo);
    }
    //GETTERS  y  SETTERS
    public ArrayList<Persona> getListaDeUsuarios() {
        return listaDeUsuarios;
    }
    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }
    public boolean isTipoDeVistaDatosUsu() {
        return tipoDeVistaDatosUsu;
    }
    public boolean isTipoDeUsuario() {
        return tipoDeUsuario;
    }
    public boolean isTipoDeVistaProductos() {
        return tipoDeVistaProductos;
    }
    public Articulo getArticulo() {
        return articulo;
    }
    public void setListaDeUsuarios(ArrayList<Persona> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }
    public void setTipoDeVistaDatosUsu(boolean tipoDeVistaDatosUsu) {
        this.tipoDeVistaDatosUsu = tipoDeVistaDatosUsu;
    }  
    public void setTipoDeUsuario(boolean tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
    public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }
    public void setTipoDeVistaProductos(boolean tipoDeVistaProductos) {
        this.tipoDeVistaProductos = tipoDeVistaProductos;
    }
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}