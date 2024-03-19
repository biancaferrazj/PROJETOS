/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import CONTROLEBJF.ProdutoControleBjf;
import bean.ProdutoBjf;
import dao.ProdutoDAO;
import java.util.Date;
import java.util.List;
import tools.Util;

/**
 *
 * @author u03402615100
 */
public class JDlgProdutoNovoIABjf extends javax.swing.JDialog {
        private boolean incluir;
        JDlgProdutoNovoBjf jDlgProdutoNovoBjf;
        ProdutoBjf produtoBjf;
        ProdutoDAO produtoDAO;
        ProdutoControleBjf produtoControleBjf;
    /**
     * Creates new form JDlgProduto
     */
    public JDlgProdutoNovoIABjf(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Produto");
        setLocationRelativeTo(null);
        produtoDAO = new ProdutoDAO();
        
    }
     public ProdutoBjf viewBean() {
    ProdutoBjf produtoBjf = new ProdutoBjf();
    produtoBjf.setIdprodutoBjf(Util.strInt(jFmtCodigo.getText()));
    produtoBjf.setPrecoBjf(Util.strDouble(jFmtPreco_Bjf.getText()));
    produtoBjf.setNomeBjf(JTxtNome_Bjf.getText());
    produtoBjf.setDescricaoBjf(JTxtDescricao_Bjf.getText());
    produtoBjf.setCategoriaBjf(jTxtCategoria_Bjf.getText());
    produtoBjf.setFornecedorBjf(jTxtFornecedor_Bjf.getText());
    produtoBjf.setSerialBjf(jFmtSerial_Bjf.getText());
    produtoBjf.setQuantidadeBjf(Util.strInt(jFmtQuantidade_Bjf.getText()));
    return produtoBjf;
}

    
    public void beanView(ProdutoBjf produtoBjf) {
    jFmtCodigo.setText(Util.intStr(produtoBjf.getIdprodutoBjf()));
    jFmtPreco_Bjf.setText(Util.doubleStr(produtoBjf.getPrecoBjf()));
    JTxtNome_Bjf.setText(produtoBjf.getNomeBjf());
    JTxtDescricao_Bjf.setText(produtoBjf.getDescricaoBjf());
    jFmtSerial_Bjf.setText(produtoBjf.getSerialBjf());
    jFmtQuantidade_Bjf.setText(Util.intStr(produtoBjf.getQuantidadeBjf()));
    jTxtFornecedor_Bjf.setText(produtoBjf.getFornecedorBjf());
    jTxtCategoria_Bjf.setText(produtoBjf.getCategoriaBjf());
}

    public void setIncluir(boolean incluir){
         this.incluir = incluir;
     }
public void setTelaAnterior(JDlgProdutoNovoBjf jDlgProdutoNovoBjf) {
        this.jDlgProdutoNovoBjf = jDlgProdutoNovoBjf;
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBtnOk = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jFmtSerial_Bjf = new javax.swing.JFormattedTextField();
        JTxtNome_Bjf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTxtDescricao_Bjf = new javax.swing.JTextField();
        jTxtFornecedor_Bjf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFmtQuantidade_Bjf = new javax.swing.JFormattedTextField();
        jFmtPreco_Bjf = new javax.swing.JFormattedTextField();
        jTxtCategoria_Bjf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFmtCodigo = new javax.swing.JFormattedTextField();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 0, 153));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBtnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png"))); // NOI18N
        jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnOk);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar);

        jLabel6.setText("Preço:");

        jLabel7.setText("Serial do Produto");

        jLabel8.setText("Fornecedor:");

        jLabel1.setText("Categoria");

        JTxtNome_Bjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtNome_BjfActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel9.setText("Quantidade");

        JTxtDescricao_Bjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtDescricao_BjfActionPerformed(evt);
            }
        });

        jTxtFornecedor_Bjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFornecedor_BjfActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição Breve:");

        jFmtQuantidade_Bjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtQuantidade_BjfActionPerformed(evt);
            }
        });

        jTxtCategoria_Bjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCategoria_BjfActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 102));
        jLabel4.setText("Cadastro de Produtos");

        jLabel5.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtSerial_Bjf)
                                    .addComponent(jFmtQuantidade_Bjf)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JTxtNome_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFmtPreco_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(133, 133, 133))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTxtFornecedor_Bjf)
                                    .addComponent(JTxtDescricao_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jTxtCategoria_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(230, 230, 230))))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTxtNome_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtPreco_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFmtSerial_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(5, 5, 5)
                        .addComponent(jFmtQuantidade_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JTxtDescricao_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFornecedor_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCategoria_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
        ProdutoBjf produtoBjf = viewBean();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        if(incluir) {
            produtoDAO.insert(produtoBjf);
            List lista = produtoDAO.listAll();
            jDlgProdutoNovoBjf.produtoControleBjf.setList(lista);
            Util.mensagem("Registro incluido");
        } else{
            produtoDAO.update(produtoBjf);
            List lista = produtoDAO.listAll();
            jDlgProdutoNovoBjf.produtoControleBjf.setList(lista);
            Util.mensagem("Registro alterado");
        }this.dispose();
    }//GEN-LAST:event_jBtnOkActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void JTxtNome_BjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtNome_BjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtNome_BjfActionPerformed

    private void JTxtDescricao_BjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtDescricao_BjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtDescricao_BjfActionPerformed

    private void jTxtFornecedor_BjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFornecedor_BjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFornecedor_BjfActionPerformed

    private void jFmtQuantidade_BjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtQuantidade_BjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtQuantidade_BjfActionPerformed

    private void jTxtCategoria_BjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCategoria_BjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCategoria_BjfActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgProdutoNovoIABjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovoIABjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovoIABjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgProdutoNovoIABjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgProdutoNovoIABjf dialog = new JDlgProdutoNovoIABjf(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField JTxtDescricao_Bjf;
    private javax.swing.JTextField JTxtNome_Bjf;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnOk;
    private javax.swing.JFormattedTextField jFmtCodigo;
    private javax.swing.JFormattedTextField jFmtPreco_Bjf;
    private javax.swing.JFormattedTextField jFmtQuantidade_Bjf;
    private javax.swing.JFormattedTextField jFmtSerial_Bjf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtCategoria_Bjf;
    private javax.swing.JTextField jTxtFornecedor_Bjf;
    // End of variables declaration//GEN-END:variables
}
