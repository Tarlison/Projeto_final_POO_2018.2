/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author Kook Ho
 */
public class TelaAlterarProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaAlterarProduto
     */
    public TelaAlterarProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbIDProdAlt = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        taRetrieveNome = new javax.swing.JTextField();
        rbtAltNome = new javax.swing.JRadioButton();
        rbtPrecoAlt = new javax.swing.JRadioButton();
        rbtCatAlterado = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        tfNomeAlterado = new javax.swing.JTextField();
        tfPrecoAlterado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbCatAlterado = new javax.swing.JComboBox<>();
        rbtQntMinAlt = new javax.swing.JRadioButton();
        rbtQntAtualAlt = new javax.swing.JRadioButton();
        tfQntMinAlterado = new javax.swing.JTextField();
        tfQntAtualAlterado = new javax.swing.JTextField();
        rbtValidadeAlt = new javax.swing.JRadioButton();
        cbDiaValAlterado = new javax.swing.JComboBox<>();
        cbMesValAlterado = new javax.swing.JComboBox<>();
        cbAnoValAlterado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        btTelaIniAlterar = new javax.swing.JButton();
        btLimparAlt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alterar Produto");

        cbIDProdAlt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- ID -", "ID1", "ID2", "ID3" }));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jLabel2.setText("ID Produto:");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jLabel3.setText("Nome:");

        taRetrieveNome.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        taRetrieveNome.setEnabled(false);

        rbtAltNome.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        rbtAltNome.setText("Nome");
        rbtAltNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtAltNomeActionPerformed(evt);
            }
        });

        rbtPrecoAlt.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        rbtPrecoAlt.setText("Preço");
        rbtPrecoAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtPrecoAltActionPerformed(evt);
            }
        });

        rbtCatAlterado.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        rbtCatAlterado.setText("Categoria");
        rbtCatAlterado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCatAlteradoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        jLabel4.setText("Selecione os campos a serem alterados e insira o novo valor:");

        tfNomeAlterado.setEnabled(false);

        tfPrecoAlterado.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jLabel5.setText("R$");

        cbCatAlterado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Categoria -", "Medicamento", "Higiene", "Alimento" }));
        cbCatAlterado.setEnabled(false);

        rbtQntMinAlt.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        rbtQntMinAlt.setText("Qnt Mínima");
        rbtQntMinAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtQntMinAltActionPerformed(evt);
            }
        });

        rbtQntAtualAlt.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        rbtQntAtualAlt.setText("Qnt Atual");
        rbtQntAtualAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtQntAtualAltActionPerformed(evt);
            }
        });

        tfQntMinAlterado.setEnabled(false);

        tfQntAtualAlterado.setEnabled(false);

        rbtValidadeAlt.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        rbtValidadeAlt.setText("Validade");
        rbtValidadeAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtValidadeAltActionPerformed(evt);
            }
        });

        cbDiaValAlterado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDiaValAlterado.setEnabled(false);

        cbMesValAlterado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbMesValAlterado.setEnabled(false);

        cbAnoValAlterado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        cbAnoValAlterado.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jLabel10.setText("/");
        jLabel10.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jLabel11.setText("/");
        jLabel11.setEnabled(false);

        btAlterar.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btAlterar.setText("Alterar");

        btTelaIniAlterar.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btTelaIniAlterar.setText("Menu Inicial");
        btTelaIniAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTelaIniAlterarActionPerformed(evt);
            }
        });

        btLimparAlt.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btLimparAlt.setText("Limpar");
        btLimparAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparAltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtValidadeAlt)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cbDiaValAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(cbMesValAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAnoValAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btLimparAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btTelaIniAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbIDProdAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(taRetrieveNome, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNomeAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfPrecoAlterado))
                                        .addComponent(rbtPrecoAlt))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(41, 41, 41)
                                            .addComponent(rbtQntMinAlt))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfQntMinAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20))))
                                .addComponent(rbtAltNome))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbCatAlterado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbtCatAlterado)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addComponent(tfQntAtualAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(rbtQntAtualAlt))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbIDProdAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(taRetrieveNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtAltNome)
                    .addComponent(rbtCatAlterado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCatAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtPrecoAlt)
                    .addComponent(rbtQntMinAlt)
                    .addComponent(rbtQntAtualAlt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrecoAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfQntMinAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQntAtualAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rbtValidadeAlt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMesValAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAnoValAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDiaValAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btTelaIniAlterar)
                    .addComponent(btLimparAlt))
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private int contrbtQntAtualAlt = 0;
    private int contrbtQntMinlAlt = 0;
    private int contrbtPrecoAlt = 0;
    private int contrbtNomeAlt = 0;
    private int contrbtCatAlt = 0;
    private int contrbtValAlt = 0;
    
    private void rbtQntAtualAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtQntAtualAltActionPerformed
        if(contrbtQntAtualAlt == 1){
            contrbtQntAtualAlt = 0;
            this.tfQntAtualAlterado.setEnabled(false);
        }else{
            contrbtQntAtualAlt = 1;
            this.tfQntAtualAlterado.setEnabled(true);
        }
    }//GEN-LAST:event_rbtQntAtualAltActionPerformed

    private void rbtQntMinAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtQntMinAltActionPerformed
        if(contrbtQntMinlAlt == 1){
            contrbtQntMinlAlt = 0;
            this.tfQntMinAlterado.setEnabled(false);        
        }else{
            contrbtQntMinlAlt = 1;
            this.tfQntMinAlterado.setEnabled(true);
        }
    }//GEN-LAST:event_rbtQntMinAltActionPerformed

    private void rbtPrecoAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtPrecoAltActionPerformed
        if(contrbtPrecoAlt == 1){
            contrbtPrecoAlt = 0;
            this.tfPrecoAlterado.setEnabled(false);        
        }else{
            contrbtPrecoAlt = 1;
            this.tfPrecoAlterado.setEnabled(true);
        }
    }//GEN-LAST:event_rbtPrecoAltActionPerformed

    private void rbtAltNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtAltNomeActionPerformed
        if(contrbtNomeAlt == 1){
            contrbtNomeAlt = 0;
            this.tfNomeAlterado.setEnabled(false);        
        }else{
            contrbtNomeAlt = 1;
            this.tfNomeAlterado.setEnabled(true);
        }
    }//GEN-LAST:event_rbtAltNomeActionPerformed

    private void rbtCatAlteradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCatAlteradoActionPerformed
        if(contrbtCatAlt == 1){
            contrbtCatAlt = 0;
            this.cbCatAlterado.setEnabled(false);        
        }else{
            contrbtCatAlt = 1;
            this.cbCatAlterado.setEnabled(true);
        }
    }//GEN-LAST:event_rbtCatAlteradoActionPerformed

    private void rbtValidadeAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtValidadeAltActionPerformed
        if(contrbtValAlt == 1){
            contrbtValAlt = 0;
            this.cbDiaValAlterado.setEnabled(false);        
            this.cbMesValAlterado.setEnabled(false); 
            this.cbAnoValAlterado.setEnabled(false); 
        }else{
            contrbtValAlt = 1;
            this.cbDiaValAlterado.setEnabled(true);
            this.cbMesValAlterado.setEnabled(true);
            this.cbAnoValAlterado.setEnabled(true);
        }
    }//GEN-LAST:event_rbtValidadeAltActionPerformed

    private void btTelaIniAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTelaIniAlterarActionPerformed
        TelaAlterarProduto.this.setVisible(false);
        new TelaInicial().setVisible(true);
    }//GEN-LAST:event_btTelaIniAlterarActionPerformed

    private void btLimparAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparAltActionPerformed
        this.tfNomeAlterado.setText("");
        this.tfQntMinAlterado.setText("");
        this.tfQntAtualAlterado.setText("");
        this.tfPrecoAlterado.setText("");
        
        this.cbCatAlterado.setSelectedIndex(0);
        this.cbAnoValAlterado.setSelectedIndex(0);
        this.cbMesValAlterado.setSelectedIndex(0);
        this.cbDiaValAlterado.setSelectedIndex(0);
    }//GEN-LAST:event_btLimparAltActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btLimparAlt;
    private javax.swing.JButton btTelaIniAlterar;
    private javax.swing.JComboBox<String> cbAnoValAlterado;
    private javax.swing.JComboBox<String> cbCatAlterado;
    private javax.swing.JComboBox<String> cbDiaValAlterado;
    private javax.swing.JComboBox<String> cbIDProdAlt;
    private javax.swing.JComboBox<String> cbMesValAlterado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbtAltNome;
    private javax.swing.JRadioButton rbtCatAlterado;
    private javax.swing.JRadioButton rbtPrecoAlt;
    private javax.swing.JRadioButton rbtQntAtualAlt;
    private javax.swing.JRadioButton rbtQntMinAlt;
    private javax.swing.JRadioButton rbtValidadeAlt;
    private javax.swing.JTextField taRetrieveNome;
    private javax.swing.JTextField tfNomeAlterado;
    private javax.swing.JTextField tfPrecoAlterado;
    private javax.swing.JTextField tfQntAtualAlterado;
    private javax.swing.JTextField tfQntMinAlterado;
    // End of variables declaration//GEN-END:variables
}
