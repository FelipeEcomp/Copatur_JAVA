/*******************************************************************************
Autor: Felipe Pinheiro de Oliveira e Alexsami Lopes
Componente Curricular: Programação II
Concluido em: 21/11/2011
Declaro que este código foi elaborado em dupla e não contém nenhum 
trecho de código de outro colega ou de outro autor, tais como provindos de livros e 
apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
******************************************************************************************/
package igrafica;

import Hotel.HotelController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



import javax.swing.table.DefaultTableModel;

public class ExibeHotel extends javax.swing.JFrame {
    private String Nome;
    private String Dado;
    
    HotelController hotelController = new HotelController(); 
    
    public ExibeHotel() {
        
    initComponents();
    
    jTable1.setAutoCreateRowSorter(true); //permite alterar a ordem da tabela
    setLocationRelativeTo( null ); // Centraliza Janela
     
        CampoNome.setEditable(false);
        CampoTelefone.setEditable(false);
        CampoCidade.setEditable(false);
        CampoEstado.setEditable(false);
        CampoBairro.setEditable(false);
        CampoEndereco.setEditable(false);
        CampoCNPJ.setEditable(false);
    
    
   // Obtem o modelo da JTable  
        try {
            String[][] dados = hotelController.preencheTabela();
            for (int i = 0; i < dados.length; i++) {
                ((DefaultTableModel) jTable1.getModel()).addRow(dados[i]);

            }
        } catch (IOException ex) {
            Logger.getLogger(ExibeAtendente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExibeAtendente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        CampoCNPJ = new javax.swing.JFormattedTextField();
        Editar = new javax.swing.JButton();
        CampoEndereco = new javax.swing.JFormattedTextField();
        Excluir = new javax.swing.JButton();
        CampoBairro = new javax.swing.JFormattedTextField();
        Salvar = new javax.swing.JButton();
        CampoTelefone = new javax.swing.JFormattedTextField();
        CampoCidade = new javax.swing.JFormattedTextField();
        CampoEstado = new javax.swing.JFormattedTextField();
        BuscaNome = new javax.swing.JButton();
        CampoNome = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Busca de Hotéis Cadastrados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Endereço", "Bairro", "Cidade", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        jLabel9.setText("Estado");

        CampoCNPJ.setText("CNPJ");
        CampoCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCNPJActionPerformed(evt);
            }
        });

        Editar.setText("Editar Dados");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        CampoEndereco.setText("Endereço");
        CampoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEnderecoActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        CampoBairro.setText("Bairro");
        CampoBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoBairroActionPerformed(evt);
            }
        });

        Salvar.setText("Salvar Alterações");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        CampoTelefone.setText("Telefone");
        CampoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTelefoneActionPerformed(evt);
            }
        });

        CampoCidade.setText("Cidade");
        CampoCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCidadeActionPerformed(evt);
            }
        });

        CampoEstado.setText("UF");
        CampoEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEstadoActionPerformed(evt);
            }
        });

        BuscaNome.setText("Exibir Todos os Dados");
        BuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaNomeActionPerformed(evt);
            }
        });

        CampoNome.setText("Nome");
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        jLabel5.setText("Endereço");

        jLabel6.setText("CNPJ");

        jLabel2.setText("Nome");

        jLabel4.setText("Bairro");

        jLabel3.setText("Telefone");

        jLabel7.setText("Cidade");

        jLabel11.setText("Clique no cliente em que se deseja Visualizar/Alterar os dados, depois clique no");

        jLabel8.setText(" botão ao lado. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(75, 75, 75)
                        .addComponent(BuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CampoCNPJ)
                                    .addComponent(CampoBairro)
                                    .addComponent(CampoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                                    .addComponent(CampoTelefone)
                                    .addComponent(CampoCidade)
                                    .addComponent(CampoEndereco)))
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CampoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109))
                            .addComponent(Salvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CampoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(CampoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CampoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CampoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(CampoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(BuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCNPJActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoCNPJActionPerformed

    private void CampoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEnderecoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoEnderecoActionPerformed

    private void CampoBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoBairroActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoBairroActionPerformed

    private void CampoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefoneActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoTelefoneActionPerformed

    private void CampoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCidadeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoCidadeActionPerformed

    private void CampoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEstadoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoEstadoActionPerformed

    private void BuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaNomeActionPerformed
        Nome = BuscaNome.getText().toUpperCase();
        
        Dado = (String) jTable1.getValueAt(jTable1.getSelectedRow(),0);  //Retorna o dado da 1ª coluna da linha relecionada
        
        //Exibe os dados nos campos de texto
        hotelController.busca(Dado);
        CampoNome.setText(hotelController.getNomeBuscado());
        CampoTelefone.setText(hotelController.getTelefoneBuscado());
        CampoCidade.setText(hotelController.getCidadeBuscado());
        CampoEstado.setText(hotelController.getEstadoBuscado());
        CampoBairro.setText(hotelController.getBairroBuscado());
        CampoEndereco.setText(hotelController.getEnderecoBuscado());
        CampoCNPJ.setText(hotelController.getCNPJBuscado());
}//GEN-LAST:event_BuscaNomeActionPerformed

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoNomeActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        CampoNome.setEditable(true);
        CampoTelefone.setEditable(true);
        CampoCidade.setEditable(true);
        CampoEstado.setEditable(true);
        CampoBairro.setEditable(true);
        CampoEndereco.setEditable(true);
        CampoCNPJ.setEditable(true);
    }//GEN-LAST:event_EditarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
       Dado = (String) jTable1.getValueAt(jTable1.getSelectedRow(),0); 
        
        hotelController.remove(Dado);
        JOptionPane.showMessageDialog(null, "Cadastro removido com sucesso.");
        this.dispose();
    }//GEN-LAST:event_ExcluirActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        
                        
            String altNome = CampoNome.getText().toUpperCase();
            String altTelefone = CampoTelefone.getText().toUpperCase();
            String altCidade = CampoCidade.getText().toUpperCase();
            String altEstado = CampoEstado.getText().toUpperCase();
            String altBairro = CampoBairro.getText().toUpperCase();
            String altEndereco = CampoEndereco.getText().toUpperCase();
            String altCNPJ = CampoCNPJ.getText().toUpperCase();
           
           
            
            //Chama metodo que alterar os dados do cliente
            hotelController.alteraDados(altNome, altTelefone, altCidade, altEstado, altBairro, altEndereco, altCNPJ, Dado);
            
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso."); //painel informando q os dados foram cadasrados com sucesso
            this.setVisible(false);
       
    }//GEN-LAST:event_SalvarActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscaNome;
    private javax.swing.JFormattedTextField CampoBairro;
    private javax.swing.JFormattedTextField CampoCNPJ;
    private javax.swing.JFormattedTextField CampoCidade;
    private javax.swing.JFormattedTextField CampoEndereco;
    private javax.swing.JFormattedTextField CampoEstado;
    private javax.swing.JFormattedTextField CampoNome;
    private javax.swing.JFormattedTextField CampoTelefone;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
