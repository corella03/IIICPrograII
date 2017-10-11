/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import javax.swing.JOptionPane;
import tiendavirtual.*;
/**
**
** @author Luis Alonso Corella Chaves - 05/10/2017
**/
public class VentanaDatosUsuario extends javax.swing.JFrame {
    /**
     * Creates new form VentanaDatosUsuario
     */
    Logica log;
    public VentanaDatosUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        log = new Logica();
    }
    public VentanaDatosUsuario(Logica log) {
        initComponents();
        setLocationRelativeTo(null);
        this.log = log;
        vistaVentana();
    }
    public void irAVentanaLogin(){
        VentanaLogin login =  new VentanaLogin(log);
        login.setVisible(true);
        dispose();
    }
    public void irAVentanaPrincipal(){
        VentanaPrincipal principal = new VentanaPrincipal(log);
        principal.setVisible(true);
        dispose();
    }
    public void vistaVentana(){
        if(log.vistaDatosUsuario() == false){
            if(log.tipoUsuario()){
                modoUsuario();
            }else{
                modoAdministrador();
            }
        }
    }
    public void modoAdministrador(){
        lblGenero.setVisible(false);
        cbxGenero.setVisible(false);
        lblDireccion.setVisible(false);
        txtDireccion.setVisible(false);
        lblNick.setVisible(false);
        txtNickName.setVisible(false);
        lblCodPodtal.setVisible(false);
        txtCodigoPostal.setVisible(false);
        btnRegistar.setText("Editar");
        txtNombre.setText(((Administrador) log.logueado()).getNombre());
        txtApellido.setText(((Administrador) log.logueado()).getApellidos());
        txtId.setText(((Administrador) log.logueado()).getId());
        txtEdad.setText(String.valueOf(((Administrador) log.logueado()).getEdad()));
        txtEmail.setText(((Administrador) log.logueado()).getEmail());
        pwdcontra.setText(((Administrador) log.logueado()).getContrasenna());
        pwdVeriContra.setText(((Administrador) log.logueado()).getContrasenna());
    }
    public void modoUsuario(){
        txtNombre.setText(((Usuario) log.logueado()).getNombre());
        txtApellido.setText(((Usuario) log.logueado()).getApellidos());
        txtId.setText(((Usuario) log.logueado()).getId());
        txtEdad.setText(String.valueOf(((Usuario) log.logueado()).getEdad()));
        txtDireccion.setText(((Usuario) log.logueado()).getDireccion());
        txtCodigoPostal.setText(String.valueOf(((Usuario) log.logueado()).getCodigoPostal()));
        txtNickName.setText(((Usuario) log.logueado()).getNickName());
        txtEmail.setText(((Usuario) log.logueado()).getEmail());
        txtNickName.setText(((Usuario) log.logueado()).getNickName());
        txtNickName.setText(((Usuario) log.logueado()).getNickName());
    }
    public void registrar(){
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String cedula = txtId.getText().trim();
        String edad = txtEdad.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String codPostal = txtCodigoPostal.getText().trim();
        String email = txtEmail.getText().trim();
        String nickName = txtNickName.getText().trim();
        String contra = new String (pwdcontra.getPassword()).trim();
        String verifiContra = new String (pwdVeriContra.getPassword()).trim();
        int genero = cbxGenero.getSelectedIndex();
        if(log.vistaDatosUsuario() == false){
            if(log.tipoUsuario() == true){
                log.editarPerilUsu(nombre, apellido, cedula,  Integer.parseInt(edad) 
                        ,direccion, Integer.parseInt(codPostal), genero, nickName
                        ,email, contra);
            }else if(log.tipoUsuario() == false){
                log.editarPerilAdmin(nombre, apellido, cedula, Integer.parseInt(edad), email, contra);
            }
        }else if(log.vistaDatosUsuario() == true){ 
            if(log.espaciosDatosUsuarios(nombre, apellido, cedula, edad, direccion, codPostal
                    , email, nickName, contra, verifiContra)){
                if(log.verificaQueSeanNumeros(edad) && log.verificaQueSeanNumeros(codPostal)){
                    if(log.verificaIgualdadContra(contra, verifiContra)){
                        if(log.verificarExistenciaAlRegistrarse(email, nickName)){
                            Persona usuario = new Usuario(direccion, nickName, Integer.parseInt(codPostal), genero
                                , nombre, apellido, cedula, Integer.parseInt(edad), email, contra);
                            log.registroUsuario(usuario);
                            irAVentanaLogin();
                        }else{
                            JOptionPane.showMessageDialog(null, "Este Usuario ya esta registrado.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Las contraseñas no cohinsiden.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "La edad y/o Código Postal deben de ir en números.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Debes de Llenar todos los espacios.");
            }
        }
    }
    public void cerrarVentana(){
        if(log.vistaDatosUsuario() == true){
            irAVentanaLogin();
        }else if(log.vistaDatosUsuario() == false){
            irAVentanaPrincipal();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUsuario = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnRegistar = new javax.swing.JButton();
        pnlDatosPersonales = new javax.swing.JPanel();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCodPodtal = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();
        pnlDatosDeUsuario = new javax.swing.JPanel();
        lblVerifContra = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblNick = new javax.swing.JLabel();
        txtNickName = new javax.swing.JTextField();
        pwdcontra = new javax.swing.JPasswordField();
        pwdVeriContra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlUsuario.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTitulo.setText("Registrate");

        btnRegistar.setText("Registrar");
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });

        pnlDatosPersonales.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        lblApellido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblApellido.setText("Apellido: *");

        lblNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNombre.setText("Nombre: *");

        lblCodPodtal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCodPodtal.setText("Código Postal: *");

        lblDireccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDireccion.setText("Dirección: *");

        lblEdad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblEdad.setText("Edad: *");

        lblCedula.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCedula.setText("Cédula: *");

        lblGenero.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblGenero.setText("Género:*");

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        javax.swing.GroupLayout pnlDatosPersonalesLayout = new javax.swing.GroupLayout(pnlDatosPersonales);
        pnlDatosPersonales.setLayout(pnlDatosPersonalesLayout);
        pnlDatosPersonalesLayout.setHorizontalGroup(
            pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellido)
                            .addComponent(lblNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEdad)
                            .addComponent(lblCedula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodPodtal)
                            .addComponent(lblDireccion)
                            .addComponent(lblGenero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoPostal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
        pnlDatosPersonalesLayout.setVerticalGroup(
            pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodPodtal)
                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGenero))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnlDatosDeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatosDeUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        lblVerifContra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblVerifContra.setText("Verifi Contraseña: *");

        lblContra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblContra.setText("Contraseña: *");

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblEmail.setText("E-mail: *");

        lblNick.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNick.setText("Nickname: *");

        javax.swing.GroupLayout pnlDatosDeUsuarioLayout = new javax.swing.GroupLayout(pnlDatosDeUsuario);
        pnlDatosDeUsuario.setLayout(pnlDatosDeUsuarioLayout);
        pnlDatosDeUsuarioLayout.setHorizontalGroup(
            pnlDatosDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosDeUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosDeUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlDatosDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVerifContra)
                            .addComponent(lblContra))
                        .addGap(14, 14, 14)
                        .addGroup(pnlDatosDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwdcontra, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(pwdVeriContra)))
                    .addGroup(pnlDatosDeUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlDatosDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblNick))
                        .addGap(55, 55, 55)
                        .addGroup(pnlDatosDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNickName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlDatosDeUsuarioLayout.setVerticalGroup(
            pnlDatosDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosDeUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNick)
                    .addComponent(txtNickName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnlDatosDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContra))
                .addGap(13, 13, 13)
                .addGroup(pnlDatosDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVerifContra)
                    .addComponent(pwdVeriContra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario);
        pnlUsuario.setLayout(pnlUsuarioLayout);
        pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(247, 247, 247))
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUsuarioLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(btnRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlDatosDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlUsuarioLayout.setVerticalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(pnlDatosDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
        registrar();
    }//GEN-LAST:event_btnRegistarActionPerformed
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrarVentana();
    }//GEN-LAST:event_formWindowClosing
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaDatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDatosUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistar;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCodPodtal;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNick;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVerifContra;
    private javax.swing.JPanel pnlDatosDeUsuario;
    private javax.swing.JPanel pnlDatosPersonales;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JPasswordField pwdVeriContra;
    private javax.swing.JPasswordField pwdcontra;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNickName;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}