/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Objetos.Persona;
import Operaciones.Operaciones;
import static java.util.Objects.hash;
//import static Ventanas.Inicio.frmregistrouser;
import javax.swing.JOptionPane;
/**
 *
 * @author Vianey Hernandez 
 */
public class InicioSesion extends javax.swing.JFrame {
        Operaciones operacion;
    private Object jTFus;
    
    
    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
        Operaciones oper = new Operaciones();
        oper.conectar();
         setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Inicio de sesión");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jBInicio = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTFUs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPPa = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jBInicio.setText("Inicio");
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });

        jLabel6.setText("Usuario");

        jTFUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsActionPerformed(evt);
            }
        });

        jLabel7.setText("Contraseña");

        jPPa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPPaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPPa)
                            .addComponent(jTFUs, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPPa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jBInicio)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Inicio de Sesion", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsActionPerformed

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
       Operaciones o = new Operaciones();
       Persona mod = new Persona();
       String pass = new String(jPPa.getPassword());
       
       if(!jTFUs.getText().equals(" ")&& !pass.equals(" ")){
           
         //String nuevoPass = hash.sha1(pass);
           
           mod.setUsuario(jTFUs.getText());
           mod.setPass(pass);
           
           if(o.login(mod)){
               
               //mod.getPass();
              // JOptionPane.showMessageDialog( null, mod.getPass());
               
               Inicio.frminiciosesion = null;
               this.dispose();
               
               Menu frmMenu = new Menu();
               frmMenu.setVisible(true);
               
           }else{
               JOptionPane.showMessageDialog(null, "Datos Incorrectos");
           }
       }else{
           JOptionPane.showMessageDialog(null, "Debe ingresar los datos");
             this.setVisible(true);    
             this.setVisible(false);       
       Menu g= new Menu();
        g.setVisible(false);
       
       }
       
             //if(resultado != null){
             //   resultado.close();
           //  }
         //}
         //catch (Exception e)
         //{
            // e.printStackTrace();
         //}




// String valor2 = new String(jPPa.getPassword());
       // String valor1 = jTFUs.getText();
        //operacion.login(valor1,valor2);
        
       /* public boolean login(String usuario, String password){
        
        ResultSet resultado = null;
        //tableModel.setRowCount(0);
        //tableModel.setColumnCount(0);
        String sql;
            String valor1 = null;
            String valor2;
        sql = "select user from Persona where user='"+ valor1 +"' and pass= '"+valor2+"'";
        resultado = consultar(sql);
        resultado.last();
         sql = "select user from Persona where user='"+ password +"';";
        try{
        if(resultado.getRow()>0){
            //.setVisible(false);       // TODO add your handling code here:
            MenuPrincipal g= new MenuPrincipal();
            g.setVisible(true);
            /*if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();
                for(int j = 1;j <= numeroColumna;j++){
                    tableModel.addColumn(resultado.getMetaData().getColumnName(j));
                }
                while(resultado.next()){
                    Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = resultado.getObject(i);
                    }
                    tableModel.addRow(objetos);*/
        
              //*  }
           // }
       //* catch(SQLException e){
        //}

       //* finally
     //{
        // try
         //{
             //consulta.close();
             //conexion.close();
             //if(resultado != null){
             //   resultado.close();
           //  }
         //}
         //catch (Exception e)
         //{
            // e.printStackTrace();
         //}
     //}
   // }

   //* private ResultSet consultar(String sql) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    

      
        /*String uss;
        uss = "SELECT * FROM persona WHERE user="+(jTFUs.getText());
        JOptionPane.showMessageDialog(null, uss);
        String pas = "SELECT * FROM persona WHERE pass=?"+(jPPa.getText());

        String usuario=uss;
        String password=pas;
        
        if((uss.equals(usuario))&&(pas.equals(password))){
            this.setVisible(false);       // TODO add your handling code here:
            MenuPrincipal g= new MenuPrincipal();
            g.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Operación invalida");
        }*/

    }//GEN-LAST:event_jBInicioActionPerformed

    private void jPPaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPPaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPPaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Inicio.frminiciosesion=null;
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InicioSesion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBInicio;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPPa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFUs;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
