/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasCodigos;

import java.awt.Color;
import javax.swing.JOptionPane;
import sistemaDeEstoque.Dados;
import sistemaDeEstoque.Entrada;
import sistemaDeEstoque.Produto;
import sistemaDeEstoque.Relatorio;

/**
 *
 * @author Kook Ho
 */
public class CadastrarProduto extends javax.swing.JFrame {
    
    /**
     * Creates new form CadastrarProduto
     */
    public CadastrarProduto() {
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

        botaoCadastrarProd = new javax.swing.JButton();
        jlNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlQnt = new javax.swing.JLabel();
        jlDescricao = new javax.swing.JLabel();
        taDescricao = new javax.swing.JTextArea();
        tfNome = new javax.swing.JTextField();
        tfQnt = new javax.swing.JTextField();
        jlQntMin = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfQntMin = new javax.swing.JTextField();
        tfPreco = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox<>();
        jlLote = new javax.swing.JLabel();
        tfLote = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbDiaVal = new javax.swing.JComboBox<>();
        cbMesVal = new javax.swing.JComboBox<>();
        cbAnoVal = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        botaoLimparCampos = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        botaoCadastrarProd.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        botaoCadastrarProd.setText("Cadastrar");
        botaoCadastrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarProdActionPerformed(evt);
            }
        });

        jlNome.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jlNome.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setText("Cadastrar Novo Produto");

        jlQnt.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jlQnt.setText("Qnt:");

        jlDescricao.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jlDescricao.setText("Descrição / Específico");

        taDescricao.setColumns(20);
        taDescricao.setRows(5);

        jlQntMin.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jlQntMin.setText("Qnt Mínima:");

        jlPreco.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jlPreco.setText("Preço (R$):");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jLabel7.setText("Categoria:");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicamento", "Higiene", "Alimento" }));

        jlLote.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jlLote.setText("Lote:");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jLabel9.setText("Validade:");

        cbDiaVal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbMesVal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cbAnoVal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "3000" }));
        cbAnoVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnoValActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jLabel10.setText("/");

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jLabel11.setText("/");

        botaoLimparCampos.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        botaoLimparCampos.setText("Limpar");
        botaoLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparCamposActionPerformed(evt);
            }
        });

        botaoCancelar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        botaoCancelar.setText("Voltar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoCadastrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(botaoLimparCampos, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbDiaVal, 0, 55, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlQntMin)
                                            .addComponent(jlPreco))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                            .addComponent(tfQntMin))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jlLote))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbCategoria, 0, 93, Short.MAX_VALUE)
                                            .addComponent(tfLote)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbMesVal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbAnoVal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)))))
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(taDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDescricao)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNome)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlQnt)
                                    .addComponent(tfQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jlQnt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlQntMin)
                    .addComponent(tfQntMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPreco)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLote)
                    .addComponent(tfLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbDiaVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAnoVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(cbMesVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarProd)
                    .addComponent(botaoLimparCampos)
                    .addComponent(botaoCancelar))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean checaNumero(){
        jlQnt.setForeground(Color.black);
        jlQntMin.setForeground(Color.black);
        jlPreco.setForeground(Color.black);
        
        try{
            double preco = Double.parseDouble(this.tfPreco.getText());
            int quant = Integer.parseInt(this.tfQnt.getText());
            int quantmin = Integer.parseInt(this.tfQntMin.getText());
            
            return true;
        }catch(NumberFormatException e){
            jlQnt.setForeground(Color.red);
            jlQntMin.setForeground(Color.red);
            jlPreco.setForeground(Color.red);
            
            return false;
        }
    }
    
    private boolean checaCamposVazios(){
        if(this.tfLote.getText().equals("") || this.tfQntMin.getText().equals("") ||
           this.tfQnt.getText().equals("") || this.tfPreco.getText().equals("") ||
           this.tfNome.getText().equals("") || this.taDescricao.getText().equals("")){
           
           if(this.tfLote.getText().equals("")){
               jlLote.setForeground(Color.red);
           }else{
               jlLote.setForeground(Color.black);
           }
           
           if(this.tfQntMin.getText().equals("")){
               jlQntMin.setForeground(Color.red);
           }else{
               jlQntMin.setForeground(Color.black);
           }
           
           if(this.tfQnt.getText().equals("")){
               jlQnt.setForeground(Color.red);
           }else{
               jlQnt.setForeground(Color.black);
           }
           
           if(this.tfNome.getText().equals("")){
               jlNome.setForeground(Color.red);
           }else{
               jlNome.setForeground(Color.black);
           }
           
           if(this.tfPreco.getText().equals("")){
               jlPreco.setForeground(Color.red);
           }else{
               jlPreco.setForeground(Color.black);
           }
           
           if(this.taDescricao.getText().equals("")){
               jlDescricao.setForeground(Color.red);
           }else{
               jlDescricao.setForeground(Color.black);
           }
            
            return false; 
        }
        else{
            jlLote.setForeground(Color.black);
            jlDescricao.setForeground(Color.black);
            jlPreco.setForeground(Color.black);
            jlNome.setForeground(Color.black);
            jlQnt.setForeground(Color.black);
            jlQntMin.setForeground(Color.black);
            
            return true;
        }
    }
    
    private void limpaCampos(){
        this.tfLote.setText("");
        this.tfQntMin.setText("");
        this.tfQnt.setText("");
        this.tfPreco.setText("");
        this.tfNome.setText("");
        this.taDescricao.setText("");
        
        this.cbAnoVal.setSelectedIndex(0);
        this.cbMesVal.setSelectedIndex(0);
        this.cbDiaVal.setSelectedIndex(0);
        this.cbCategoria.setSelectedIndex(0);
    }
    
    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        CadastrarProduto.this.dispose();
        new TelaInicial(0).setVisible(true);
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparCamposActionPerformed
        limpaCampos();
    }//GEN-LAST:event_botaoLimparCamposActionPerformed

    private void botaoCadastrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarProdActionPerformed
        if(checaCamposVazios()){
            if(checaNumero()){
                Dados.dados.add(
                new Produto(
                        Dados.IDdado++,
                        tfLote.getText(),
                        Integer.parseInt(tfQnt.getText()),
                        Integer.parseInt(tfQntMin.getText()),
                        tfNome.getText(),
                        Double.parseDouble(tfPreco.getText()),
                        cbCategoria.getSelectedItem().toString(),
                        cbDiaVal.getSelectedItem().toString(),
                        cbMesVal.getSelectedItem().toString(),
                        cbAnoVal.getSelectedItem().toString()  ));
        
                JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso!");
                /*tem q dar Override no toString do fornecedor
                  to com peguiça então faço depois*/
                //System.out.println(Dados.dados);
                Relatorio relatorioNovo = new Entrada(Dados.dados.get(Dados.dados.size()-1));
                Dados.relatorios.add(relatorioNovo);
                
                limpaCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Um dos campos: [Qnt], [Qnt Mínima] ou [Preço]\n não está preenchido com números!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Algum dos campos está vazio!");
        }
        
    }//GEN-LAST:event_botaoCadastrarProdActionPerformed

    private void cbAnoValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnoValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAnoValActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new TelaInicial(0).setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarProd;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimparCampos;
    private javax.swing.JComboBox<String> cbAnoVal;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbDiaVal;
    private javax.swing.JComboBox<String> cbMesVal;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlLote;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JLabel jlQnt;
    private javax.swing.JLabel jlQntMin;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTextField tfLote;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPreco;
    private javax.swing.JTextField tfQnt;
    private javax.swing.JTextField tfQntMin;
    // End of variables declaration//GEN-END:variables
}
