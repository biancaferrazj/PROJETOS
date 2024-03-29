/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import CONTROLEBJF.VendasControle;
import bean.ClienteBjf;
import bean.VendasBjf;
import dao.ClientesDAO;
import dao.VendasDAO;
import java.util.List;
import tools.Util;

/**
 *
 * @author duals
 */
public class JDlgConsultasdeVendasBjf extends javax.swing.JDialog {
    private VendasControle vendasControle;
    VendasBjf vendasBjf;    
    VendasDAO vendasDAO;
    /**
     * Creates new form JDlgConsultasdeVendasBjf
     */
    public JDlgConsultasdeVendasBjf(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Consulta de Vendas");
        vendasControle = new VendasControle();
        vendasDAO = new VendasDAO();
        List lista = vendasDAO.listAll();
        vendasControle.setList(lista);
        jTable1.setModel(vendasControle);
        
        ClientesDAO clienteDAO = new ClientesDAO();
        List listaClientes = clienteDAO.listAll();
        for (int i = 0; i < listaClientes.size(); i++) {
            jCboNomeclienteBjf.addItem((ClienteBjf) listaClientes.get(i));
        }
         jCboNomeclienteBjf.addItem(null);
        jCboNomeclienteBjf.setSelectedIndex(-1);
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBtnConsultarBjf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTxtValorBjf = new javax.swing.JTextField();
        jCboNomeclienteBjf = new javax.swing.JComboBox<ClienteBjf>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Nome do Cliente");

        jBtnConsultarBjf.setText("Consultar");
        jBtnConsultarBjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultarBjfActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor");

        jTxtValorBjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtValorBjfActionPerformed(evt);
            }
        });

        jCboNomeclienteBjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboNomeclienteBjfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jCboNomeclienteBjf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtValorBjf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnConsultarBjf)
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtValorBjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnConsultarBjf)
                    .addComponent(jCboNomeclienteBjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 102));
        jLabel3.setText("Consultas de Vendas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnConsultarBjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultarBjfActionPerformed
        if (jCboNomeclienteBjf.getSelectedItem() == null && jTxtValorBjf.getText().isEmpty()) {
            List lista = vendasDAO.listAll();
            vendasControle.setList(lista);
        } else {
            if (jCboNomeclienteBjf.getSelectedItem() != null && !jTxtValorBjf.getText().isEmpty()) {
                ClienteBjf clienteBjf = (ClienteBjf) jCboNomeclienteBjf.getSelectedItem();
                double valor = Util.strDouble(jTxtValorBjf.getText());
                jTxtValorBjf.setText(String.valueOf(valor));
                List lista = vendasDAO.listNomeValor(clienteBjf.getNomeBjf(), valor);
                vendasControle.setList(lista);
            } else {
                if (jCboNomeclienteBjf.getSelectedItem() != null) {
                    ClienteBjf clienteBjf = (ClienteBjf) jCboNomeclienteBjf.getSelectedItem();
                    List lista = vendasDAO.listNome(clienteBjf.getNomeBjf());
                    vendasControle.setList(lista);
                }
                if (!jTxtValorBjf.getText().isEmpty()) {
                    double valor = Double.parseDouble(jTxtValorBjf.getText());  
                    List lista = vendasDAO.listValor(valor);
                    vendasControle.setList(lista);
                    }
                }
            }
    }//GEN-LAST:event_jBtnConsultarBjfActionPerformed

    private void jTxtValorBjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtValorBjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtValorBjfActionPerformed

    private void jCboNomeclienteBjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboNomeclienteBjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboNomeclienteBjfActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgConsultasdeVendasBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgConsultasdeVendasBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgConsultasdeVendasBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgConsultasdeVendasBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgConsultasdeVendasBjf dialog = new JDlgConsultasdeVendasBjf(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnConsultarBjf;
    private javax.swing.JComboBox<ClienteBjf> jCboNomeclienteBjf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtValorBjf;
    // End of variables declaration//GEN-END:variables
}
