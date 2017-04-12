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
import Atendente.AtendenteController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




import javax.swing.table.DefaultTableModel;

public class ExibeAtendente extends javax.swing.JFrame {
    private String Nome;
    private String CPF;
    private String Dado;
    
    AtendenteController ateController = new AtendenteController(); 
    
    public ExibeAtendente() {
       
    initComponents();
     setLocationRelativeTo( null ); // Centraliza Janela
     jTable1.setAutoCreateRowSorter(true); //permite alterar a ordem da tabela
     
     
        CampoNome.setEditable(false);
        CampoCPF.setEditable(false);
        CampoTelefone.setEditable(false);
        CampoEmail.setEditable(false);
        CampoCidade.setEditable(false);
        CampoEstado.setEditable(false);
        CampoData.setEditable(false);
        CampoSalario.setEditable(false);
    
    
     
 // Obtem o modelo da JTable  
     
 
 // Obtem o modelo da JTable  
        try {
            String[][] dados = ateController.preencheTabela();
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
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CampoEmail = new javax.swing.JFormattedTextField();
        CampoSalario = new javax.swing.JFormattedTextField();
        Editar = new javax.swing.JButton();
        CampoTelefone = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoEstado = new javax.swing.JFormattedTextField();
        Excluir = new javax.swing.JButton();
        CampoCidade = new javax.swing.JFormattedTextField();
        Salvar = new javax.swing.JButton();
        CampoCPF = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoData = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JFormattedTextField();
        Buscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Busca de Atendentes Cadastrados");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "e-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        CampoEmail.setText("Email");
        CampoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmailActionPerformed(evt);
            }
        });

        CampoSalario.setText("Salário");
        CampoSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSalarioActionPerformed(evt);
            }
        });

        Editar.setText("Editar Dados");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        CampoTelefone.setText("Telefone");
        CampoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTelefoneActionPerformed(evt);
            }
        });

        jLabel9.setText("Cidade");

        jLabel8.setText("Salário");

        jLabel7.setText("CPF");

        jLabel6.setText("Data de Entrada");

        jLabel5.setText("Email");

        CampoEstado.setText("UF");
        CampoEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEstadoActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        CampoCidade.setText("Cidade");
        CampoCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCidadeActionPerformed(evt);
            }
        });

        Salvar.setText("Salvar Alterações");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        CampoCPF.setText("CPF");
        CampoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCPFActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        CampoData.setText("Data de Entrada");
        CampoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDataActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefone");

        jLabel10.setText("Estado");

        CampoNome.setText("Nome");
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        Buscar.setText("Exibir Todos os Dados");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel11.setText("Clique no Atendente em que se deseja Visualizar/Alterar os dados, depois clique no botão ao lado. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1)
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CampoEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(CampoCPF, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoCidade, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoTelefone)
                    .addComponent(CampoData)
                    .addComponent(CampoSalario))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(CampoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoEmailActionPerformed

    private void CampoSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSalarioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoSalarioActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        //permite editar os dados buscados
        CampoNome.setEditable(true);
        CampoCPF.setEditable(true);
        CampoTelefone.setEditable(true);
        CampoEmail.setEditable(true);
        CampoCidade.setEditable(true);
        CampoEstado.setEditable(true);
        CampoData.setEditable(true);
        CampoSalario.setEditable(true);
    }//GEN-LAST:event_EditarActionPerformed

    private void CampoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefoneActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoTelefoneActionPerformed

    private void CampoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEstadoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoEstadoActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        Dado = (String) jTable1.getValueAt(jTable1.getSelectedRow(),0); 
        
        ateController.remove(Dado);
        JOptionPane.showMessageDialog(null, "Cadastro removido com sucesso.");
        this.dispose();
}//GEN-LAST:event_ExcluirActionPerformed

    private void CampoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCidadeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoCidadeActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        String testeCPF = CampoCPF.getText();
        int tamanhoCPF = testeCPF.length(); //passa o tamanho da String pra variavel
        
        if (tamanhoCPF==11){//SO CONFIRMA CADASTRO SE O TAMANHO DO CPF FOR IGUAL A 11
            
            
            String altNome = CampoNome.getText().toUpperCase();
            String altCPF = CampoCPF.getText().toUpperCase();
            String altTelefone = CampoTelefone.getText().toUpperCase();
            String altEmail = CampoEmail.getText().toUpperCase();
            String altCidade = CampoCidade.getText().toUpperCase();
            String altEstado = CampoEstado.getText().toUpperCase();
            String altData = CampoData.getText().toUpperCase();
            String altSalario = CampoSalario.getText().toUpperCase();
            
            //Chama metodo que alterar os dados do cliente
            ateController.alteraDados(altNome, altCPF, altTelefone, altEmail, altCidade, altEstado, altData, altSalario, Dado);
            
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso."); //painel informando q os dados foram cadasrados com sucesso
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "O CPF é inválido, por favor insira um CPF válido."); //painel informando q o cpf é invalido
        }
}//GEN-LAST:event_SalvarActionPerformed

    private void CampoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCPFActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoCPFActionPerformed

    private void CampoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDataActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoDataActionPerformed

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoNomeActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        
        
         Dado = (String) jTable1.getValueAt(jTable1.getSelectedRow(),0);  //Retorna o dado da 1ª coluna da linha relecionada
        
        //Exibe os dados nos campos de texto
        ateController.busca(Dado);
        CampoNome.setText(ateController.getNomeBuscado());
        CampoCPF.setText(ateController.getCpfBuscado());
        CampoTelefone.setText(ateController.getTelefoneBuscado());
        CampoEmail.setText(ateController.getEmailBuscado());
        CampoCidade.setText(ateController.getCidadeBuscado());
        CampoEstado.setText(ateController.getEstadoBuscado());
        CampoCidade.setText(ateController.getCidadeBuscado());
        CampoData.setText(ateController.getDataBuscado());
        CampoSalario.setText(ateController.getSalarioBuscado());
}//GEN-LAST:event_BuscarActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JFormattedTextField CampoCPF;
    private javax.swing.JFormattedTextField CampoCidade;
    private javax.swing.JFormattedTextField CampoData;
    private javax.swing.JFormattedTextField CampoEmail;
    private javax.swing.JFormattedTextField CampoEstado;
    private javax.swing.JFormattedTextField CampoNome;
    private javax.swing.JFormattedTextField CampoSalario;
    private javax.swing.JFormattedTextField CampoTelefone;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Salvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
