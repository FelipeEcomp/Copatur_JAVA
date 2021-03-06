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
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class CadastroHotel extends javax.swing.JFrame {

   private String grafNome;
   private String grafTelefone;
   private String grafCidade;        
   private String grafEstado;
   private String grafBairro;
   private String grafEndereco;
   private String grafCNPJ;
    
    
    public CadastroHotel() {
        initComponents();
        
         setLocationRelativeTo( null ); // Centraliza Janela
    }

   

    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JFormattedTextField();
        CampoTelefone = new javax.swing.JFormattedTextField();
        CampoEndereco = new javax.swing.JFormattedTextField();
        CampoBairro = new javax.swing.JFormattedTextField();
        CampoCNPJ = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CampoCidade = new javax.swing.JFormattedTextField();
        CampoEstado = new javax.swing.JFormattedTextField();
        Cadastrar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Cadastro de Hotel");

        jLabel2.setText("Nome");

        jLabel3.setText("Telefone");

        jLabel4.setText("Bairro");

        jLabel5.setText("Endereço");

        jLabel6.setText("CNPJ");

        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        CampoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTelefoneActionPerformed(evt);
            }
        });

        CampoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEnderecoActionPerformed(evt);
            }
        });

        CampoBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoBairroActionPerformed(evt);
            }
        });

        CampoCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCNPJActionPerformed(evt);
            }
        });

        jLabel7.setText("Cidade");

        jLabel8.setText("Estado");

        CampoCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCidadeActionPerformed(evt);
            }
        });

        CampoEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEstadoActionPerformed(evt);
            }
        });

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(528, Short.MAX_VALUE)
                .addComponent(Cadastrar)
                .addGap(27, 27, 27)
                .addComponent(Cancelar)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)
                                .addComponent(CampoBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30)
                                .addComponent(CampoCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CampoTelefone)
                                    .addComponent(CampoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                    .addComponent(CampoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CampoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CampoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CampoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CampoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CampoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar)
                    .addComponent(Cancelar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void CampoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTelefoneActionPerformed

    private void CampoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCidadeActionPerformed

    private void CampoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEstadoActionPerformed

    private void CampoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEnderecoActionPerformed

    private void CampoBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoBairroActionPerformed

    private void CampoCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCNPJActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        //Alem de passar para a variavel cliente, alguns dados vao com as letras maiusculas
             
            
            grafNome = CampoNome.getText().toUpperCase();
            grafTelefone = CampoTelefone.getText();
            grafCidade = CampoCidade.getText().toUpperCase();
            grafEstado = CampoEstado.getText().toUpperCase();
            grafBairro = CampoBairro.getText();
            grafEndereco = CampoEndereco.getText(); //consertar q ta de cliente
            grafCNPJ = CampoCNPJ.getText();
            
           //Passa dados pros metodos
         setGrafNome(grafNome);         
         setGrafTelefone(grafTelefone);         
         setGrafCidade(grafCidade);
         setGrafEstado(grafEstado);
         setGrafBairro(grafBairro);
         setGrafEndereco(grafEndereco);
         setGrafCNPJ(grafCNPJ);
         
         
          HotelController hotelController = new HotelController(); 
         hotelController.cadastraHotel(getGrafNome(), getGrafTelefone(), getGrafCidade(), getGrafEstado(), getGrafBairro(), getGrafEndereco(), getGrafCNPJ());//Chama metodo de cadastro de clientes
                  
         JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso."); //painel informando q os dados foram cadasrados com sucesso
         this.dispose();         
                   
    }//GEN-LAST:event_CadastrarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JFormattedTextField CampoBairro;
    private javax.swing.JFormattedTextField CampoCNPJ;
    private javax.swing.JFormattedTextField CampoCidade;
    private javax.swing.JFormattedTextField CampoEndereco;
    private javax.swing.JFormattedTextField CampoEstado;
    private javax.swing.JFormattedTextField CampoNome;
    private javax.swing.JFormattedTextField CampoTelefone;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

   
  public String getGrafNome() {       
    return grafNome;
                }
    
  public String getGrafTelefone() { 
    return grafTelefone;
            }
  
  public String getGrafCidade() { 
    return grafCidade;
            }
  
  public String getGrafEstado() { 
    return grafEstado;
            }
 public String getGrafBairro() { 
    return grafBairro;
            }
  
  public String getGrafEndereco() { 
    return grafEndereco;
            }
  
  public String getGrafCNPJ() { 
    return grafCNPJ;
            }
  
  
  public void setGrafNome(String Nome) { 
      this.grafNome = Nome;
                }
     
  public void setGrafTelefone(String Telefone) { 
       this.grafTelefone = Telefone;
                }
     
  public void setGrafCidade(String Cidade) { 
        this.grafCidade = Cidade;
                  }
  
  public void setGrafEstado(String Estado) { 
        this.grafEstado = Estado;        
                   }
   public void setGrafBairro(String Bairro) { 
        this.grafBairro = Bairro;
                  }
  
  public void setGrafEndereco(String Endereco) { 
        this.grafEndereco = Endereco;        
                   }  

  public void setGrafCNPJ(String CNPJ) { 
        this.grafCNPJ = CNPJ;        
                   }  
}
