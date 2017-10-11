/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import tiendavirtual.*;
/**
 **
 ** @author Luis Alonso Corella Chaves - 10/09/2017
 **/
public class VentanaListaProducto extends javax.swing.JFrame {
    /**
     * Creates new form VentanaListaProducto
     */
    private Logica log;
    public VentanaListaProducto() {
        initComponents();
        setLocationRelativeTo(null);
        log = new Logica();
    }
    public VentanaListaProducto(Logica log){
        initComponents();
        setLocationRelativeTo(null);
        this.log = log;
        cargarDatosEnTabla();
    }
    public void irAVentanaPrincipal(){
        VentanaPrincipal principal = new VentanaPrincipal(log);
        principal.setVisible(true);
        dispose();
    }
    public void irARegistroProducto(){
        VentanaRegistroProducto editar = new VentanaRegistroProducto(log);
        editar.setVisible(true);
        dispose();
    }
    public void cargarDatosEnTabla(){
        String arregloTabla[][] = new String[log.getListaArticulos().size()][2];
        for (int i = 0; i < log.getListaArticulos().size(); i++) {
            arregloTabla [i][0] = log.getListaArticulos().get(i).getNombre();
            arregloTabla [i][1] = String.valueOf(log.getListaArticulos().get(i).getCodigo());
        }
        tblDatosProductos.setModel(new javax.swing.table.DefaultTableModel(
                    arregloTabla,
                    new String[]{
                        "Nombre", "Código"
                    }
            ));
    }
    public void elementoSeleccionado(){
        TableModel tablaModelo;
        tablaModelo = (TableModel)tblDatosProductos.getModel();
        boolean avanzar = true;
        int registro = tblDatosProductos.getSelectedRow();
        int columna = tblDatosProductos.getSelectedColumn();
        if(registro == -1){
            avanzar = false;
        }else if(columna == -1){
            avanzar =  false;
        }
        if(avanzar){
            String datoSeleccionado = tablaModelo.getValueAt(tblDatosProductos.getSelectedRow(), 
                tblDatosProductos.getSelectedColumn()).toString();
            for (Articulo art : log.getListaArticulos()) {
                if(datoSeleccionado.equals(art.getNombre()) 
                        || datoSeleccionado.equals(String.valueOf(art.getCodigo()))){
                    log.setArticulo(art);
                    irARegistroProducto();
                    break;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado Ningún Producto");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblDatosProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Código"
            }
        ));
        tblDatosProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatosProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
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

    private void tblDatosProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosProductosMouseClicked
        elementoSeleccionado();
    }//GEN-LAST:event_tblDatosProductosMouseClicked
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
            java.util.logging.Logger.getLogger(VentanaListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaListaProducto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatosProductos;
    // End of variables declaration//GEN-END:variables
}