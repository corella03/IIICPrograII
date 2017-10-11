/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.util.ArrayList;
/**
 **
 ** @author Luis Alonso Corella Chaves - 27/09/2017
 **/
public class LogicaPrograma {
    private ArrayList<Usuario> listaUsuarios;
    private Usuario usuarioRegistrado;
    private boolean tipoVentana;
    public LogicaPrograma() {
        listaUsuarios = new ArrayList<>();
        agregarUsuario();
    }
    /**
     * Registra usuarios a la hora de iniciar el prorama(usuarios quemados).
     */
    public void agregarUsuario() {
        Usuario usuario = new Usuario("Luis Alonso", "Corella Chaves", "85362106", "corella03", "alonsocch_183@hotmail.com", "12");
        listaUsuarios.add(usuario);
        Usuario usuario1 = new Usuario("Roberto", "Corella Chaves", "87562312", "zmrcore", "lcorellac@est.utn.ac.cr", "123");
        listaUsuarios.add(usuario1);
    }
    /**
     * Verifica si el usuario existe o no (Login).
     *
     * @param nickOCorreo String: que recibe el nickName o Correo ingresado.
     * @param contra String: que recibe la contraseña ingresada.
     * @return true: si el usuario existe, false: si el usuario no existe.
     */
    public boolean login(String nickOCorreo, String contra) {
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
            if ((nickOCorreo.equals(usuario.getNickName()) || nickOCorreo.equals(usuario.getCorreo()))
                    && contra.equals(usuario.getContrasenna())) {
                usuarioRegistrado = usuario;
                return true;
            }
        }
        return false;
    }
    /**
     * Guarda un usuario ya registrado.
     * @return Usuario: Retorna el usuario con el que se inicia sesión.
     */
    public Usuario usuarioRegistrado() {
        return usuarioRegistrado;
    }
    /**
     * Verifica que no hayan espacios vacíos a la hora de registrar usuario.
     * @param nombres  String: que recibe los nombres.
     * @param apellidos  String: que recibe  los apellidos.
     * @param telefono  String: que recibe telefono.
     * @param correo  String: que recibe correo.
     * @param nickName  String: que recibe nickName.
     * @param contraseña  String: que recibe contraseña.
     * @return true: Si tienen datos, false: Si estan vacías.
     */
    public boolean verificaEspaciosRegistro(String nombres, String apellidos, String telefono, String correo
            ,String nickName, String contraseña){
        return !nombres.isEmpty() && !apellidos.isEmpty() && !telefono.isEmpty() && !correo.isEmpty()
                && !nickName.isEmpty() && !contraseña.isEmpty();
    }
    /**
     *  Verifica que no hayan espacios vacíos a la hora de iniciar sesión.
     * @param nickOCorreo String: que recibe nickName o correo.
     * @param contra String: que recibe contraseña.
     * @return true: Si tienen datos, false: Si estan vacías.
     */
    public boolean verificaEspacios(String nickOCorreo, String contra) {
        return !nickOCorreo.isEmpty() && !contra.isEmpty();
    }
    /**
     * Verifica que a la hora de registrar o editar un usuario no sea igual a uno ya creado.
     * @param nickName String: que recibe nickName.
     * @param correo String que recibe el correo.
     * @return true: si el usuario ya ha sido registrado. false: si no se ha registrado.
     */
    public boolean verificaExistenciaUsuario(String nickName, String correo){
        for(Usuario usuario : listaUsuarios){
            if((nickName.equals(usuario.getNickName())) || (correo.equals(usuario.getCorreo()))){
                return true;
            }
        }
        return false;
    }
    /**
     * Registra usuario.
     * @param usuario Usuario: recibe usuario con todos los datos.
     */
    public void registrarsUsario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }
    /**
     * cambia configuración de la ventana Registro. 
     * @return true: modo regitro. false: Modo perfil.
     */
    public boolean tipoVista(){
        return tipoVentana;
    }
    /**
     * Edita los datos del usuario con el que se inicia sesion.
     * @param nombres String: que recibe el nuevo nombre.
     * @param apellidos String: que recibe el nuevo apellido.
     * @param telefono String: que recibe el nuevo numero de teléfono.
     * @param nickName String: que recibe el nuevo nickName.
     * @param email String: que recibe el nuevo correo.
     * @param contra String: que recibe la nueva contraseña.
     */
    public void editarPerfil(String nombres, String apellidos, String telefono, String nickName, String email, String contra){
        usuarioRegistrado().setNombres(nombres);
        usuarioRegistrado().setApellidos(apellidos);
        usuarioRegistrado().setTelefono(telefono);
        usuarioRegistrado().setNickName(nickName);
        usuarioRegistrado().setCorreo(email);
        usuarioRegistrado().setContrasenna(contra);
    }
    public boolean isTipoVentana() {
        return tipoVentana;
    }
    public void setTipoVentana(boolean tipoVentana) {
        this.tipoVentana = tipoVentana;
    }
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}