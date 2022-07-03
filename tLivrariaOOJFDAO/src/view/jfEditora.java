/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.mysql.cj.x.protobuf.MysqlxConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.editoraVO;
import services.EditoraServices;
import services.ServicesFactory;
import static tLivrariaOOJFDAO.Main.cadEdi;

/**
 *
 * @author Thiago Quevedo
 */
public class jfEditora extends javax.swing.JFrame {

    /**
     * Creates new form jfEditora
     */
    public jfEditora() throws SQLException {
        initComponents();
        this.addRowToTableNew();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfEndereco = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEditoras = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlNomeEditora = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jtfNomeEditora = new javax.swing.JTextField();
        jtfGerente = new javax.swing.JTextField();
        jlGerente = new javax.swing.JLabel();
        jbDeletar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbSalvar.setText("Adicionar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jtEditoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idEditora", "Nome", "Gerente", "Endereço", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtEditoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEditorasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtEditoras);
        if (jtEditoras.getColumnModel().getColumnCount() > 0) {
            jtEditoras.getColumnModel().getColumn(0).setResizable(false);
            jtEditoras.getColumnModel().getColumn(1).setResizable(false);
            jtEditoras.getColumnModel().getColumn(2).setResizable(false);
            jtEditoras.getColumnModel().getColumn(3).setResizable(false);
            jtEditoras.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("sansserif", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Editora");

        jlNomeEditora.setText("Nome Editora:");

        jlEndereco.setText("Endereço:");

        jlTelefone.setText("Telefone:");

        jlGerente.setText("Gerente:");

        jbDeletar.setText("Deletar");
        jbDeletar.setEnabled(false);
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNomeEditora)
                                    .addComponent(jlEndereco)
                                    .addComponent(jlGerente))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jtfNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtfGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jlTelefone)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(12, 12, 12)
                                                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(23, 23, 23))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeEditora)
                    .addComponent(jtfNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelefone)
                    .addComponent(jtfGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlGerente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEndereco)
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar)
                    .addComponent(jbCancelar)
                    .addComponent(jbDeletar)
                    .addComponent(jbAlterar))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jtEditoras.getModel();

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        Object rowData[] = new Object[6];//define vetor das colunas

        for (editoraVO listEdi : cadEdi.getEditoras()) {
            rowData[0] = listEdi.getIdEditora();
            rowData[1] = listEdi.getNomeEditora();
            rowData[2] = listEdi.getGerente();
            rowData[3] = listEdi.getEndereco();
            rowData[4] = listEdi.getTelefone();

            model.addRow(rowData);
        }
    }

    public void addRowToTableNew() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) this.jtEditoras.getModel();

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        Object rowData[] = new Object[6];//define vetor das colunas
        EditoraServices ediS = services.ServicesFactory.getEditoraServices();
        for (editoraVO listEdi : ediS.buscarEditora()) {
            rowData[0] = listEdi.getIdEditora();
            rowData[1] = listEdi.getNomeEditora();
            rowData[2] = listEdi.getGerente();
            rowData[3] = listEdi.getEndereco();
            rowData[4] = listEdi.getTelefone();

            model.addRow(rowData);
        }
    }

    public void deletar() {
        try {
            int linha = jtEditoras.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(rootPane, "Você não selecionou nenhuma linha");
            } else {
                EditoraServices ediS = services.ServicesFactory.getEditoraServices();
                int idEditora = (int) jtEditoras.getValueAt(linha, 0);
                ediS.deletarEditora(idEditora);
                JOptionPane.showMessageDialog(rootPane, "Editora deleta com sucesso");
                addRowToTableNew();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao deletar " + ex.getMessage());
        }
    }

    public void salvarLimparEnable() {
        jbSalvar.setEnabled(true);
        jbLimpar.setEnabled(true);
        jtEditoras.setEnabled(true);
        jbAlterar.setEnabled(false);
        jbDeletar.setEnabled(false);
        jbDeletar.setText("Deletar");
    }

    public void salvarLimparDisable() {
        jbSalvar.setEnabled(false);
        jbLimpar.setEnabled(false);
        jtEditoras.setEnabled(false);
        jbAlterar.setEnabled(false);
        jbDeletar.setEnabled(true);
        jbDeletar.setText("Salvar");
    }

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        jtfNomeEditora.setText("");
        jtfGerente.setText("");
        jtfEndereco.setText("");
        jtfTelefone.setText("");
        jtfNomeEditora.requestFocus();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
        System.out.println("clicou");
        editoraVO e = new editoraVO();
        byte i = 1;
        String erros[] = new String[6];
        boolean validaNome = false, validaGerente = false, validaEndereco = false, validaTelefone = false;

        if (!jtfNomeEditora.getText().equals("")) {
            e.setNomeEditora(jtfNomeEditora.getText());
            validaNome = true;
        } else {
            erros[i] = "Nome não pode ser em branco";
            i++;
        }

        if (!jtfGerente.getText().equals("")) {
            e.setGerente(jtfGerente.getText());
            validaGerente = true;
        } else {
            erros[i] = "Gerente não pode ser em branco";
            i++;
        }

        if (!jtfEndereco.getText().equals("")) {
            e.setEndereco(jtfEndereco.getText());
            validaEndereco = true;
        } else {
            erros[i] = "Endereço não pode ser em branco";
            i++;
        }

        if (!jtfTelefone.getText().equals("")) {
            e.setTelefone(jtfTelefone.getText());
            validaTelefone = true;
        } else {
            erros[i] = "Telefone não pode ser em branco";
            i++;
        }

        if (validaNome && validaGerente && validaEndereco && validaTelefone) {
            EditoraServices ediS = services.ServicesFactory.getEditoraServices();
            try {
                ediS.cadastraEditora(e);
                JOptionPane.showMessageDialog(this, "Editora cadastrada com sucesso!");
                jbLimparActionPerformed(evt);
                addRowToTableNew();
                System.out.println(cadEdi.getEditoras());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar editora " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, erros, "Erro", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        // TODO add your handling code here:
        if (jbDeletar.getText().equals("Deletar")) {
            this.deletar();
        } else if (jbDeletar.getText().equals("Salvar")) {
            try {
                editoraVO eVO = new editoraVO();
                EditoraServices ediS = services.ServicesFactory.getEditoraServices();
                eVO.setIdEditora((int) jtEditoras.getValueAt(jtEditoras.getSelectedRow(), 0));
                eVO.setNomeEditora(jtfNomeEditora.getText());
                eVO.setGerente(jtfGerente.getText());
                eVO.setEndereco(jtfEndereco.getText());
                eVO.setTelefone(jtfTelefone.getText());
                ediS.alterarEdiotora(eVO);
                this.addRowToTableNew();

                salvarLimparEnable();
                jbLimparActionPerformed(evt);

                jbDeletar.setText("Deletar");
            } catch (SQLException ex) {
                Logger.getLogger(jfEditora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jbDeletarActionPerformed
    private int linhaClicked = -1;
    private void jtEditorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEditorasMouseClicked
        // TODO add your handling code here:

        if (jtEditoras.isEnabled()) {
            if (jtEditoras.getSelectedRow() == linhaClicked) {
                this.jbAlterar.setEnabled(false);
                jtEditoras.clearSelection();
                this.jbDeletar.setEnabled(false);

                linhaClicked = -1;
            } else {
                linhaClicked = jtEditoras.getSelectedRow();
                this.jbAlterar.setEnabled(true);
                this.jbDeletar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jtEditorasMouseClicked


    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        int linha = jtEditoras.getSelectedRow();

        jtfNomeEditora.setText((String) this.jtEditoras.getValueAt(linha, 1));
        jtfGerente.setText((String) this.jtEditoras.getValueAt(linha, 2));
        jtfEndereco.setText((String) this.jtEditoras.getValueAt(linha, 3));
        jtfTelefone.setText((String) this.jtEditoras.getValueAt(linha, 4));
        jtEditoras.setEnabled(false);

        salvarLimparDisable();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        if (jbDeletar.getText().equals("Salvar")) {
            salvarLimparEnable();
            jtEditoras.clearSelection();
            jbLimparActionPerformed(evt);
        } else {
            jfEditora.this.dispose();
        }
    }//GEN-LAST:event_jbCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(jfEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new jfEditora().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(jfEditora.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlGerente;
    private javax.swing.JLabel jlNomeEditora;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JTable jtEditoras;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfGerente;
    private javax.swing.JTextField jtfNomeEditora;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}
