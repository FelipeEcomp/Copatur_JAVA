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
import Cliente.ClienteController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;



import javax.swing.table.DefaultTableModel;

public class ExibeCliente extends javax.swing.JFrame {
    private String Nome;
    private String CPF;
    private String Dado;
    
    ClienteController cliController = new ClienteController(); 
    
    public ExibeCliente() {
        
     
    initComponents();
    
    jTable1.setAutoCreateRowSorter(true); //permite alterar a ordem da tabela
    
    
    
             //INICIA OS CAMPOS SEM A POSSIBILIDADE DE EDITAR, SO SERA POSSIVEL SE ESCOLHER A OPÇÃO 
        CampoNome.setEditable(false);
        CampoCPF.setEditable(false);
        CampoTelefone.setEditable(false);
        CampoEmail.setEditable(false);
        CampoCidade.setEditable(false);
        CampoEstado.setEditable(false);
        
             setLocationRelativeTo( null ); // Centraliza Janela 
// Obtem o modelo da JTable  
  try {
            String[][] dados = cliController.preencheTabela();
            for (int i = 0; i < dados.length; i++) {
                ((DefaultTableModel) jTable1.getModel()).addRow(dados[i]);

            }
        } catch (IOException ex) {
            Logger.getLogger(ExibeCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException     ex) {
            Logger.getLogger(ExibeCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Sair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CampoTelefone = new javax.swing.JFormattedTextField();
        Salvar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoEstado = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        Excluir = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        CampoCidade = new javax.swing.JFormattedTextField();
        CampoNome = new javax.swing.JFormattedTextField();
        Editar = new javax.swing.JButton();
        CampoEmail = new javax.swing.JFormattedTextField();
        CampoCPF = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Busca de Clientes Cadastrados");

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "Cidade"
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

        CampoTelefone.setText("Telefone");

        Salvar.setText("Salvar Alterações");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        jLabel8.setText("Telefone");

        jLabel6.setText("Cidade");

        jLabel7.setText("Estado");

        jLabel4.setText("CPF");

        jLabel5.setText("Email");

        CampoEstado.setText("UF");

        jLabel3.setText("Nome");

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Buscar.setText("Exibir Todos os Dados");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        CampoCidade.setText("Cidade");

        CampoNome.setText("Nome");
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        Editar.setText("Editar Dados");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        CampoEmail.setText("Email");

        CampoCPF.setText("CPF");

        jLabel9.setText("Clique no Cliente em que se deseja Visualizar/Alterar os dados, depois clique no botão ao lado. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoEmail)
                            .addComponent(CampoTelefone)
                            .addComponent(CampoCPF)
                            .addComponent(CampoCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(CampoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Salvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Editar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                .addGap(108, 108, 108))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(CampoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
       this.dispose();
    }//GEN-LAST:event_SairActionPerformed

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
            
            
            //Chama metodo que alterar os dados do cliente
            cliController.alteraDados(altNome, altCPF, altTelefone, altEmail, altCidade, altEstado, Dado);
            
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso."); //painel informando q os dados foram cadasrados com sucesso
            this.setVisible(false);
           
        } else {
            JOptionPane.showMessageDialog(null, "O CPF é inválido, por favor insira um CPF válido."); //painel informando q o cpf é invalido
        }
        
    }//GEN-LAST:event_SalvarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        
        Dado = (String) jTable1.getValueAt(jTable1.getSelectedRow(),0); 
        cliController.remove(Dado);
        JOptionPane.showMessageDialog(null, "Cadastro removido com sucesso.");
        this.dispose();
        
    }//GEN-LAST:event_ExcluirActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        
      
       
         Dado = (String) jTable1.getValueAt(jTable1.getSelectedRow(),0);  //Retorna o dado da 1ª coluna da linha relecionada
       
        
        //Exibe os dados nos campos de texto
        cliController.busca(Dado);
        CampoNome.setText(cliController.getNomeBuscado());
        CampoCPF.setText(cliController.getCpfBuscado());
        CampoTelefone.setText(cliController.getTelefoneBuscado());
        CampoEmail.setText(cliController.getEmailBuscado());
        CampoCidade.setText(cliController.getCidadeBuscado());
        CampoEstado.setText(cliController.getEstadoBuscado());
        
        
        
        
    }//GEN-LAST:event_BuscarActionPerformed

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        
}//GEN-LAST:event_CampoNomeActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        //permite editar os dados buscados
        CampoNome.setEditable(true);
        CampoCPF.setEditable(true);
        CampoTelefone.setEditable(true);
        CampoEmail.setEditable(true);
        CampoCidade.setEditable(true);
        CampoEstado.setEditable(true);
    }//GEN-LAST:event_EditarActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JFormattedTextField CampoCPF;
    private javax.swing.JFormattedTextField CampoCidade;
    private javax.swing.JFormattedTextField CampoEmail;
    private javax.swing.JFormattedTextField CampoEstado;
    private javax.swing.JFormattedTextField CampoNome;
    private javax.swing.JFormattedTextField CampoTelefone;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Salvar;
    private javax.swing.JLabel jLabel1;
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
