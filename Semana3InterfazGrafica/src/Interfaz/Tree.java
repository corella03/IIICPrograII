/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import javax.swing.JOptionPane;
import javax.swing.tree.*;
/**
 **
 ** @author Luis Alonso Corella Chaves - 18/09/2017
 **/
public class Tree extends javax.swing.JDialog {
    /**
     * Creates new form Tree
     */
    DefaultMutableTreeNode titulo =  null;
    DefaultTreeModel modelo = null;
    public Tree(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        Tree.setModel(cargarArbol());
    }
    public DefaultTreeModel cargarArbol(){
        DefaultMutableTreeNode categoria = null;
        DefaultMutableTreeNode subcategoria = null;
        titulo = new DefaultMutableTreeNode("Centro de Administración");
        modelo = new DefaultTreeModel(titulo);
        categoria =  new DefaultMutableTreeNode("Adm.Redes");
        subcategoria = new DefaultMutableTreeNode("Dep. de Planificación");
        modelo.insertNodeInto(categoria, titulo, 0);
        modelo.insertNodeInto(subcategoria, categoria, 0);
        categoria = new DefaultMutableTreeNode("Adm. de Laboratorios");
        subcategoria = new DefaultMutableTreeNode("Dep. Tecnología");
        modelo.insertNodeInto(categoria, titulo, 1);
        modelo.insertNodeInto(subcategoria, categoria, 0);
        categoria = new DefaultMutableTreeNode("Dep. de Investigación");
        subcategoria = new DefaultMutableTreeNode("Dep. A");
        modelo.insertNodeInto(categoria, titulo,2);
        modelo.insertNodeInto(subcategoria, categoria, 0);
        return modelo;
    }
    public void agregar(){
        String cadena = JOptionPane.showInputDialog(this, "Ingrese Departamento");
        DefaultMutableTreeNode parentNodo =  null;
        TreePath parentPath = Tree.getSelectionPath();
        if(parentPath == null){
            
        }else{
            parentNodo = (DefaultMutableTreeNode)parentPath.getLastPathComponent();
        }
        DefaultMutableTreeNode child = new DefaultMutableTreeNode(cadena);
        modelo.insertNodeInto(child, parentNodo, parentNodo.getChildCount());
    }
    public void eliminar(){
        DefaultMutableTreeNode parentNode = null;
        TreePath currentSelection = Tree.getSelectionPath();
        if(currentSelection != null){
            parentNode = (DefaultMutableTreeNode)currentSelection.getLastPathComponent();
            DefaultTreeModel model = ((DefaultTreeModel)Tree.getModel());
            model.removeNodeFromParent(parentNode);
        }
    }
    public void mostrarInfo(){
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)Tree.getLastSelectedPathComponent();
        if(node == null){
            return;
        }
        Object nodeInfo = node.getUserObject();
        JOptionPane.showMessageDialog(null, nodeInfo.toString());
    }
    public void modificar(){
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)Tree.getLastSelectedPathComponent();
        if(node == null){
            return;
        }
        Object nodeInfo = node.getUserObject();
        String cadena = JOptionPane.showInputDialog(null,"Ingrese el nuevo nombre", nodeInfo.toString());
        TreePath currentSelection = Tree.getSelectionPath();
        if(currentSelection != null){
            node = (DefaultMutableTreeNode)currentSelection.getLastPathComponent();
            node.setUserObject(cadena);
            DefaultTreeModel model = ((DefaultTreeModel)Tree.getModel());
            model.nodeChanged(node);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Tree = new javax.swing.JTree();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(Tree);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnInformacion.setText("Información");
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(btnInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        eliminar();
    }//GEN-LAST:event_btnRemoverActionPerformed
    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        mostrarInfo();
    }//GEN-LAST:event_btnInformacionActionPerformed
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed
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
            java.util.logging.Logger.getLogger(Tree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tree dialog = new Tree(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree Tree;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}