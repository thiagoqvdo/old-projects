/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.cliente;
import static tLivrariaOOJF.Main.cadCli;

/**
 *
 * @author Thiago Quevedo
 */
public class jfCliente extends javax.swing.JFrame {


    /**
     * Creates new form NewJFrame
     */
    public jfCliente() {
        initComponents();
        System.out.println("Imprimindo do JFrame\n"+cadCli.getClientes());
        this.addRowToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgCpfCnpj = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlNomeCliente = new javax.swing.JLabel();
        jrbCpf = new javax.swing.JRadioButton();
        jrbCnpj = new javax.swing.JRadioButton();
        jlEndereco = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jtfNomeCliente = new javax.swing.JTextField();
        jtfCpfCnpj = new javax.swing.JTextField();
        jtfEndereco = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 2, 24)); // NOI18N
        jLabel1.setText("Cadastro de Cliente");

        jlNomeCliente.setText("Nome Cliente:");

        bgCpfCnpj.add(jrbCpf);
        jrbCpf.setText("CPF");

        bgCpfCnpj.add(jrbCnpj);
        jrbCnpj.setText("CNPJ");

        jlEndereco.setText("Endereço:");

        jlTelefone.setText("Telefone:");

        jbSalvar.setText("Salvar");
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

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idCliente", "Nome", "Cpf", "Cnpj", "Endereço", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtClientes);
        if (jtClientes.getColumnModel().getColumnCount() > 0) {
            jtClientes.getColumnModel().getColumn(0).setResizable(false);
            jtClientes.getColumnModel().getColumn(1).setResizable(false);
            jtClientes.getColumnModel().getColumn(2).setResizable(false);
            jtClientes.getColumnModel().getColumn(3).setResizable(false);
            jtClientes.getColumnModel().getColumn(4).setResizable(false);
            jtClientes.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEndereco)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbCpf)
                                .addGap(18, 18, 18)
                                .addComponent(jrbCnpj))
                            .addComponent(jlNomeCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbCancelar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfNomeCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jtfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeCliente)
                    .addComponent(jtfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbCpf)
                    .addComponent(jrbCnpj)
                    .addComponent(jtfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelefone)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEndereco)
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar)
                    .addComponent(jbCancelar))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        jtfNomeCliente.setText("");
        jtfCpfCnpj.setText("");
        jtfEndereco.setText("");
        jtfTelefone.setText("");
        jtfNomeCliente.requestFocus();
    }//GEN-LAST:event_jbLimparActionPerformed

    
    public void addRowToTable(){
    DefaultTableModel model = (DefaultTableModel) jtClientes.getModel();

    model.getDataVector().removeAllElements();
    model.fireTableDataChanged();
    Object rowData[] = new Object[6];//define vetor das colunas

    for (cliente listCli: cadCli.getClientes()){
      rowData[0] = listCli.getIdCliente();
      rowData[1] = listCli.getNomeCliente();
      rowData[2] = listCli.getCpf();
      rowData[3] = listCli.getCnpj();
      rowData[4] = listCli.getTelefone();
      rowData[5] = listCli.getEndereco();

      model.addRow(rowData);

    }
  }
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
        cliente c = new cliente();
        byte i = 1;
        String erros[] = new String[6];
        boolean valida = false, validaNome = false, validaCpfCnpj = false, validaEndereco = false, validaTelefone = false;

        if (!jtfNomeCliente.getText().equals("")) {
            c.setNomeCliente(jtfNomeCliente.getText());
            validaNome = true;
        } else {
            erros[i] = "Nome não pode ser em branco";
            i++;
        }

        if (jrbCpf.isSelected()) {
            valida = true;
            switch (jtfCpfCnpj.getText().length()) {
                case 0:
                    erros[i] = "Cpf não pode ser em branco";
                    i++;
                    break;

                case 11:
                    if (!cadCli.verificaCpf(jtfCpfCnpj.getText())) {
                        c.setCpf(jtfCpfCnpj.getText());
                        validaCpfCnpj = true;
                    } else {
                        erros[i] = "Cpf já cadastrado";
                        i++;
                    }
                    break;

                default:
                    erros[i] = "Cpf inválido";
                    i++;
                    break;
            }
        }

        if (jrbCnpj.isSelected()) {
            valida = true;
            switch (jtfCpfCnpj.getText().length()) {
                case 0:
                    erros[i] = "Cnpj não pode ser em branco";
                    i++;
                    break;

                case 13:
                    if (!cadCli.verificaCnpj(jtfCpfCnpj.getText())) {
                        c.setCnpj(jtfCpfCnpj.getText());
                        validaCpfCnpj = true;
                    } else {
                        erros[i] = "Cnpj já cadastrado";
                        i++;
                    }
                    break;

                default:
                    erros[i] = "Cnpj inválido";
                    i++;
                    break;
            }
        }

        if (!jrbCnpj.isSelected() && !jrbCpf.isSelected()) {
            JOptionPane.showMessageDialog(this, "Primeiro selecione Cpf ou Cnpj", "Selecione", JOptionPane.INFORMATION_MESSAGE);
            valida = false;
        }

        if (!jtfEndereco.getText().equals("")) {
            c.setEndereco(jtfEndereco.getText());
            validaEndereco = true;
        } else {
            erros[i] = "Endereço não pode ser em branco";
            i++;
        }

        if (!jtfTelefone.getText().equals("")) {
            c.setTelefone(jtfTelefone.getText());
            validaTelefone = true;
        } else {
            erros[i] = "Telefone não pode ser em branco";
            i++;
        }

        if (valida) {
            if (validaNome && validaCpfCnpj && validaEndereco && validaTelefone) {
                c.setIdCliente(cadCli.criaIdCliente());
                cadCli.addCliente(c);
                JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
                jbLimparActionPerformed(evt);
                addRowToTable();
                System.out.println(cadCli.getClientes());
            } else {
                JOptionPane.showMessageDialog(this, erros, "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_jbSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(jfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgCpfCnpj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlNomeCliente;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JRadioButton jrbCnpj;
    private javax.swing.JRadioButton jrbCpf;
    private javax.swing.JTable jtClientes;
    private javax.swing.JTextField jtfCpfCnpj;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNomeCliente;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}