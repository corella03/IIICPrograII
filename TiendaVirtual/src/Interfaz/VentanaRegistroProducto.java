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
** @author Luis Alonso Corella Chaves - 09/10/2017
**/
public class VentanaRegistroProducto extends javax.swing.JFrame {
    /**
     * Creates new form VentanaRegistroProducto
     */
    private Logica log;
    public VentanaRegistroProducto() {
        initComponents();
        setLocationRelativeTo(null);
        log = new Logica();
    }
    public VentanaRegistroProducto(Logica  log) {
        initComponents();
        setLocationRelativeTo(null);
        this.log = log;
        tipoVista();
    }
    public void vistaParaEditar(){
        lblTipo.setVisible(false);
        cbxTipo.setVisible(false);
        if(log.articuloSeleccionado() instanceof Libro){
            txtNombre.setText(((Libro)log.articuloSeleccionado()).getNombre());
            txtCodigo.setText(String.valueOf(((Libro)log.articuloSeleccionado()).getCodigo()));
            txtPrecio.setText(String.valueOf(((Libro)log.articuloSeleccionado()).getPrecio()));
            txtCantPag.setText(String.valueOf(((Libro)log.articuloSeleccionado()).getCantPaginas()));
            spnCanUni.setValue(((Libro)log.articuloSeleccionado()).getCantUnidades());
            txtEditorial.setText(((Libro)log.articuloSeleccionado()).getEditorial());
            txtGenero.setText(((Libro)log.articuloSeleccionado()).getGenero());
            cbxCapIlus.setSelectedItem(((Libro)log.articuloSeleccionado()).isCapitulos());
            txtAutor.setText(((Libro)log.articuloSeleccionado()).getAutor());
            
        }else if(log.articuloSeleccionado() instanceof Novela){
            txtNombre.setText(((Novela)log.articuloSeleccionado()).getNombre());
            txtCodigo.setText(String.valueOf(((Novela)log.articuloSeleccionado()).getCodigo()));
            txtPrecio.setText(String.valueOf(((Novela)log.articuloSeleccionado()).getPrecio()));
            txtCantPag.setText(String.valueOf(((Novela)log.articuloSeleccionado()).getCantPaginas()));
            spnCanUni.setValue(((Novela)log.articuloSeleccionado()).getCantUnidades());
            txtEditorial.setText(((Novela)log.articuloSeleccionado()).getEditorial());
            txtGenero.setText(((Novela)log.articuloSeleccionado()).getGenero());
            cbxCapIlus.setSelectedItem(((Novela)log.articuloSeleccionado()).isCapitulos());
            txtAutor.setText(((Novela)log.articuloSeleccionado()).getAutor());
            
        }else if(log.articuloSeleccionado() instanceof Cuento){
            txtNombre.setText(((Cuento)log.articuloSeleccionado()).getNombre());
            txtCodigo.setText(String.valueOf(((Cuento)log.articuloSeleccionado()).getCodigo()));
            txtPrecio.setText(String.valueOf(((Cuento)log.articuloSeleccionado()).getPrecio()));
            txtCantPag.setText(String.valueOf(((Cuento)log.articuloSeleccionado()).getCantPaginas()));
            spnCanUni.setValue(((Cuento)log.articuloSeleccionado()).getCantUnidades());
            txtEditorial.setText(((Cuento)log.articuloSeleccionado()).getEditorial());
            txtGenero.setText(((Cuento)log.articuloSeleccionado()).getGenero());
            cbxCapIlus.setSelectedItem(((Cuento)log.articuloSeleccionado()).isIlustrado()); 
            txtAutor.setText(((Cuento)log.articuloSeleccionado()).getAutor());
            
        }else if(log.articuloSeleccionado() instanceof Revista){
            txtNombre.setText(((Revista)log.articuloSeleccionado()).getNombre());
            txtCodigo.setText(String.valueOf(((Revista)log.articuloSeleccionado()).getCodigo()));
            txtPrecio.setText(String.valueOf(((Revista)log.articuloSeleccionado()).getPrecio()));
            txtCantPag.setText(String.valueOf(((Revista)log.articuloSeleccionado()).getCantPaginas()));
            spnCanUni.setValue(((Revista)log.articuloSeleccionado()).getCantUnidades());
            txtEditorial.setText(((Revista)log.articuloSeleccionado()).getEditorial());
            txtGenero.setText(((Revista)log.articuloSeleccionado()).getGenero()); 
        }
    }
    public void tipoVista(){
        if(log.tipoVistaProductos()== true){
            vistaInicial();
            vistaVentana();
        }else if(log.tipoVistaProductos() == false){
            vistaParaEditar();
        }
    }
    public void irAVentanaPrincipal(){
        VentanaPrincipal principal = new VentanaPrincipal(log);
        principal.setVisible(true);
        dispose();
    }
    public void vistaCompartida(){
        txtNombre.setEditable(true);
        txtCodigo.setEditable(true);
        txtPrecio.setEditable(true);
        txtCantPag.setEditable(true);
        spnCanUni.setEnabled(true);
        txtEditorial.setEditable(true);
        txtGenero.setEditable(true);
        txtAutor.setVisible(true);
        cbxCapIlus.setVisible(true);
        lblAutror.setVisible(true);
        lblCapitulos.setVisible(true);
        lblCapitulos.setText("Capitulos.");
    }
    public void vistaInicial(){
        txtNombre.setEditable(false);
        txtCodigo.setEditable(false);
        txtPrecio.setEditable(false);
        txtCantPag.setEditable(false);
        spnCanUni.setEnabled(false);
        txtEditorial.setEditable(false);
        txtGenero.setEditable(false);
        txtAutor.setEditable(false);
        cbxCapIlus.setEnabled(false);
    }
    public void vistaLibroNovela(){
        vistaCompartida();
        txtAutor.setEditable(true);
        cbxCapIlus.setEnabled(true);
    }
    public void vistaRevista(){
        vistaCompartida();
        txtAutor.setVisible(false);
        cbxCapIlus.setVisible(false);
        lblAutror.setVisible(false);
        lblCapitulos.setVisible(false);
    }
    public void vistaCuento(){
        vistaCompartida();
        txtAutor.setEditable(true);
        lblCapitulos.setText("Ilustrado.");
        cbxCapIlus.setEnabled(true);
    }
    public void registrarProducto(){
        String nombre = txtNombre.getText();
        String codigo = txtCodigo.getText();
        String precio = txtPrecio.getText();
        String cantPag = txtCantPag.getText();
        int cantUni = Integer.parseInt(String.valueOf(spnCanUni.getValue()));
        String editorial = txtEditorial.getText();
        String autor = txtAutor.getText();
        String genero = txtGenero.getText();
        int capIlus = cbxCapIlus.getSelectedIndex();
        boolean opc = true;
        if(capIlus == 0){
            opc = true;
        }else if(capIlus == 1){
            opc = false;
        }
        if(log.verificarDatosProducto(nombre, codigo, precio, cantPag, editorial, genero)){//&& !autor.isEmpty()
            if(log.verificaQueSeanNumeros(codigo) && log.verificaQueSeanNumeros(precio) && log.verificaQueSeanNumeros(cantPag)){
                if(!log.verificaExistenciaProducto(Integer.parseInt(codigo))){
                    if(log.tipoVistaProductos() == true){
                        int indiceCbx = cbxTipo.getSelectedIndex();
                        switch(indiceCbx){
                            case 0:
                                Articulo libro = new Libro(autor, opc, nombre, Integer.parseInt(precio)
                                        ,Integer.parseInt(cantPag), cantUni, editorial, genero, Integer.parseInt(codigo));
                                log.registarProducto(libro);
                                break;
                            case 1:
                                Articulo cuento = new Libro(autor, opc, nombre, Integer.parseInt(precio)
                                        ,Integer.parseInt(cantPag), cantUni, editorial, genero, Integer.parseInt(codigo));
                                log.registarProducto(cuento);
                                break;
                            case 2:
                                Articulo novela = new Novela(autor, opc, nombre, Integer.parseInt(precio)
                                        ,Integer.parseInt(cantPag), cantUni, editorial, genero, Integer.parseInt(codigo));
                                log.registarProducto(novela);
                                break;
                            case 3:
                                Articulo revista = new Revista(nombre, Integer.parseInt(precio),Integer.parseInt(cantPag), cantUni, 
                                        editorial, genero, Integer.parseInt(codigo));
                                log.registarProducto(revista);      
                                break;
                            default:
                                break;
                        }
                    }else if(log.tipoVistaProductos() == false){
                        if(log.articuloSeleccionado() instanceof Libro){
                            log.editarLibro(nombre, Integer.parseInt(codigo), Integer.parseInt(precio), Integer.parseInt(cantPag) 
                                    ,cantUni, editorial, genero, autor, opc);
                        }else if(log.articuloSeleccionado() instanceof Novela){
                            log.editarNovela(nombre, Integer.parseInt(codigo), Integer.parseInt(precio), Integer.parseInt(cantPag) 
                                    ,cantUni, editorial, genero, autor, opc);
                        }else if(log.articuloSeleccionado() instanceof Cuento){
                            log.editarCuento(nombre, Integer.parseInt(codigo), Integer.parseInt(precio), Integer.parseInt(cantPag) 
                                    ,cantUni, editorial, genero, autor, opc);
                        }else if(log.articuloSeleccionado() instanceof Revista){
                            log.editarRevista(nombre, Integer.parseInt(codigo), Integer.parseInt(precio), Integer.parseInt(cantPag) 
                                    ,cantUni, editorial, genero);
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El código de este producto ya existe.");
            }
            }else{
                JOptionPane.showMessageDialog(null, "Debes ingresar números en los espacios Código, Precio Y Cant Páginas.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debes de Llenar todos los espacios.");
        }
    }
    public void vistaVentana(){
        int indiceCbx = cbxTipo.getSelectedIndex();
        switch(indiceCbx){
            case 0:
                vistaLibroNovela();
                break;
            case 1:
                vistaCuento();
                break;
            case 2:
                vistaLibroNovela();
                break;
            case 3:
                vistaRevista();
                break;
            default:
                break;
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

        jPanel1 = new javax.swing.JPanel();
        lblCantPag = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtCantPag = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        lblDEditorial = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        lblCantUnid = new javax.swing.JLabel();
        spnCanUni = new javax.swing.JSpinner();
        txtAutor = new javax.swing.JTextField();
        lblAutror = new javax.swing.JLabel();
        lblCapitulos = new javax.swing.JLabel();
        cbxCapIlus = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 2, 18))); // NOI18N

        lblCantPag.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCantPag.setText("Cant. Páginas: *");

        lblPrecio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPrecio.setText("Precio: *");

        lblNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNombre.setText("Nombre: *");

        lblGenero.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblGenero.setText("Género: *");

        lblDEditorial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDEditorial.setText("Editoral: *");

        lblCantUnid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCantUnid.setText("Cant. Unidades: *");

        spnCanUni.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        lblAutror.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblAutror.setText("Autor: *");

        lblCapitulos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCapitulos.setText("Capitulos: *");

        cbxCapIlus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        lblTipo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTipo.setText("Tipo de Registro: *");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Cuento", "Novela", "Revista" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCodigo.setText("Código: *");

        btnRegistrar.setText("Registar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantUnid)
                            .addComponent(lblCantPag))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnCanUni)
                            .addComponent(txtCantPag, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(148, 148, 148))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGenero)
                            .addComponent(lblDEditorial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAutror)
                            .addComponent(lblCapitulos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCapIlus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecio)
                            .addComponent(lblNombre)
                            .addComponent(lblTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)))
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantPag)
                    .addComponent(txtCantPag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCantUnid)
                    .addComponent(spnCanUni, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDEditorial)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutror)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapitulos)
                    .addComponent(cbxCapIlus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        irAVentanaPrincipal();
    }//GEN-LAST:event_formWindowClosing
    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        vistaVentana();
    }//GEN-LAST:event_cbxTipoActionPerformed
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       registrarProducto();
    }//GEN-LAST:event_btnRegistrarActionPerformed
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
            java.util.logging.Logger.getLogger(VentanaRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroProducto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxCapIlus;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAutror;
    private javax.swing.JLabel lblCantPag;
    private javax.swing.JLabel lblCantUnid;
    private javax.swing.JLabel lblCapitulos;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDEditorial;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JSpinner spnCanUni;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCantPag;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}