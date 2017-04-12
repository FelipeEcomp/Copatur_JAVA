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
import Cliente.ClienteController;
import Grafo.Mapa;
import Reserva.ReservaController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Hotel.HotelController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Felipe
 */
public class ExibeReserva extends javax.swing.JFrame {
 ReservaController resController = new ReservaController(); 
 ClienteController cliController = new ClienteController();
 AtendenteController ateController = new AtendenteController();
 HotelController hotelController = new HotelController();
   
 String Dado;  
  
  
    public ExibeReserva() {
        initComponents();
        
        CampoCliente.setEditable(false);
        CampoAtendente.setEditable(false);
        CampoHotel.setEditable(false);
        CampoPeriodo.setEditable(false);
        CampoVHotel.setEditable(false);
        CampoData.setEditable(false);
        CampoDestino.setEditable(false);
        CampoVPassagem.setEditable(false);        
        CampoValorTotal.setEditable(false);
        CampoOrigem.setEditable(false);
        
         setLocationRelativeTo( null ); // Centraliza Janela
         jTable1.setAutoCreateRowSorter(true); //permite alterar a ordem da tabela
         
                setLocationRelativeTo( null ); // Centraliza Janela 
 // Obtem o modelo da JTable  
        try {
            String[][] dados = resController.preencheTabela();
            for (int i = 0; i < dados.length; i++) {
                ((DefaultTableModel) jTable1.getModel()).addRow(dados[i]);
                
               
            }
        } catch (IOException ex) {
            Logger.getLogger(ExibeAtendente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExibeAtendente.class.getName()).log(Level.SEVERE, null, ex);
        }
    
   
jTable2.setAutoCreateRowSorter(true); //permite alterar a ordem da tabela
        jTable3.setAutoCreateRowSorter(true); //permite alterar a ordem da tabela
        jTable4.setAutoCreateRowSorter(true); //permite alterar a ordem da tabela     
        
         setLocationRelativeTo( null ); // Centraliza Janela
         
          try {
            String[][] dados = cliController.preencheTabela();
            for (int i = 0; i < dados.length; i++) {
                ((DefaultTableModel) jTable2.getModel()).addRow(dados[i]);

            }
        } catch (IOException ex) {
            Logger.getLogger(ExibeCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException     ex) {
            Logger.getLogger(ExibeCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
         
      try {
            String[][] dados = ateController.preencheTabela();
            for (int i = 0; i < dados.length; i++) {
                ((DefaultTableModel) jTable3.getModel()).addRow(dados[i]);

            }
        } catch (IOException ex) {
            Logger.getLogger(ExibeCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException     ex) {
            Logger.getLogger(ExibeCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
      try {
            String[][] dados = hotelController.preencheTabela();
            for (int i = 0; i < dados.length; i++) {
                ((DefaultTableModel) jTable4.getModel()).addRow(dados[i]);

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

        Buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CampoVPassagem = new javax.swing.JFormattedTextField();
        CampoDestino = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CampoPeriodo = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        CampoVHotel = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        CampoData = new javax.swing.JFormattedTextField();
        Editar = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        ComboQuarto = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        ComboStatus = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        CampoValorTotal = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoOrigem = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CampoCliente = new javax.swing.JFormattedTextField();
        CampoAtendente = new javax.swing.JFormattedTextField();
        CampoHotel = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Buscar.setText("Exibir Todos os Dados");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Arquivo", "Nome do Cliente", "Nome do Atendente", "Destino", "Período", "Nivel do Quarto", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Busca de Reservas Cadastradas");

        CampoDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDestinoActionPerformed(evt);
            }
        });

        jLabel9.setText("R$");

        jLabel5.setText("Valor total do Hotel");

        jLabel4.setText("R$");

        jLabel7.setText("Destino");

        jLabel6.setText("Data da Passagem");

        jLabel8.setText("Valor da Passagem");

        jLabel10.setText("Período que ficará no Hotel");

        Editar.setText("Editar Dados");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Salvar.setText("Salvar Alterações");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        ComboQuarto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nível do Quarto", "Standart", "Superior", "Luxo" }));
        ComboQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboQuartoActionPerformed(evt);
            }
        });

        jLabel12.setText("Clique na Reserva em que se deseja Visualizar/Alterar os dados, depois clique no botão de Exibir ao lado. ");

        ComboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Status da Reserva", "Pendente", "Finalizado" }));
        ComboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboStatusActionPerformed(evt);
            }
        });

        jLabel17.setText("Valor Total                 R$");

        jLabel2.setText("Origem");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "Cidade"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel18.setText("CLIENTES");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel19.setText("ATENDENTES");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "Email"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Endereço", "Bairro", "Cidade", "Estado"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel20.setText("Hoteis");

        jLabel3.setText("Cliente");

        jLabel11.setText("Hotel");

        jLabel13.setText("Atendente");

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*Selecione o nome do Cliente, Atendente ou Hotel novamente caso altere algum cadastro");

        rota.setFont(new java.awt.Font("Tahoma", 0, 14));
        rota.setText("Definir rotas de Origem/Destino");
        rota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(407, 407, 407))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(424, 424, 424))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(52, 52, 52)
                                                .addComponent(jLabel4))
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CampoVPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(ComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CampoHotel, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                            .addComponent(CampoAtendente)
                                            .addComponent(CampoCliente)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(50, 50, 50)
                                            .addComponent(CampoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel7)
                                            .addGap(43, 43, 43)
                                            .addComponent(CampoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoVHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rota)
                                .addGap(49, 49, 49))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(602, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(CampoAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(CampoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(ComboQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(CampoPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CampoVHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoVPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(CampoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addComponent(ComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Editar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addComponent(Sair, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                            .addComponent(Salvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rota, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        
      // String Cliente = BuscaCliente.getText().toUpperCase();
       Dado = (String) jTable1.getValueAt(jTable1.getSelectedRow(),0);
        
        
        //Exibe os dados nos campos de texto
        resController.busca(Dado);
        CampoCliente.setText(resController.getClienteBuscado());
        CampoHotel.setText(resController.getHotelBuscado());
     //   CampoQuarto.setText(resController.getQuartoBuscado());
        CampoPeriodo.setText(resController.getPeriodoBuscado());
        CampoVHotel.setText(resController.getValorHotelBuscado());
        CampoData.setText(resController.getDataBuscado());
        CampoOrigem.setText(resController.getOrigemBuscado());
        CampoDestino.setText(resController.getDestinoBuscado());
        CampoVPassagem.setText(resController.getValorPassagemBuscado());
        CampoAtendente.setText(resController.getAtendenteBuscado());
        CampoValorTotal.setText(resController.getValorTotal());
        
    }//GEN-LAST:event_BuscarActionPerformed

    private void CampoDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDestinoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CampoDestinoActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        //permite editar os dados buscados
        
     //   CampoQuarto.setEditable(true);
        CampoPeriodo.setEditable(true);
        CampoVHotel.setEditable(true);
        CampoData.setEditable(true);
        CampoOrigem.setEditable(true);
        CampoDestino.setEditable(true);
        CampoVPassagem.setEditable(true);        
        CampoValorTotal.setEditable(true);
}//GEN-LAST:event_EditarActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        
       String NomeCliente = CampoCliente.getText().toUpperCase();
       String NomeAtendente = CampoAtendente.getText().toUpperCase();
       
       
       
      
                 
           String grafCliente = (String) jTable2.getValueAt(jTable2.getSelectedRow(),0);
           String grafHotel = (String) jTable4.getValueAt(jTable4.getSelectedRow(),0);
           String  grafAtendente = (String) jTable3.getValueAt(jTable3.getSelectedRow(),0);
           String grafQuarto = (String) ComboQuarto.getSelectedItem();
           String grafPeriodo = CampoPeriodo.getText().toUpperCase();
           String grafVHotel = CampoVHotel.getText().toUpperCase();
           String grafData = CampoData.getText().toUpperCase();
           String grafOrigem = CampoOrigem.getText().toUpperCase();
           String grafDestino = CampoDestino.getText().toUpperCase();
           String grafVPassagem = CampoVPassagem.getText().toUpperCase();
          
           String grafStatus = (String) ComboStatus.getSelectedItem();
           String grafValorTotal = CampoValorTotal.getText().toUpperCase();
          ReservaController resController = new ReservaController(); 
         resController.alteraDados(grafCliente, grafHotel, grafQuarto, grafPeriodo, grafVHotel, grafData, grafOrigem, grafDestino, grafVPassagem, grafAtendente, grafStatus, Dado, grafValorTotal);//Chama metodo de cadastro de clientes
                 
         JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso."); //painel informando q os dados foram cadasrados com sucesso
         this.dispose();      
       
      
      
    }//GEN-LAST:event_SalvarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
      Dado = (String) jTable1.getValueAt(jTable1.getSelectedRow(),0); 
        
        resController.remove(Dado);
        JOptionPane.showMessageDialog(null, "Cadastro removido com sucesso.");
        this.dispose();
}//GEN-LAST:event_ExcluirActionPerformed

    private void ComboQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboQuartoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_ComboQuartoActionPerformed

    private void ComboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboStatusActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_ComboStatusActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        this.dispose();
}//GEN-LAST:event_SairActionPerformed

    private void rotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotaActionPerformed
        JFrame frame = new JFrame("Rotas Disponíves");
        frame.add(new Mapa());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
}//GEN-LAST:event_rotaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JFormattedTextField CampoAtendente;
    private javax.swing.JFormattedTextField CampoCliente;
    private javax.swing.JFormattedTextField CampoData;
    private javax.swing.JFormattedTextField CampoDestino;
    private javax.swing.JFormattedTextField CampoHotel;
    private javax.swing.JFormattedTextField CampoOrigem;
    private javax.swing.JFormattedTextField CampoPeriodo;
    private javax.swing.JFormattedTextField CampoVHotel;
    private javax.swing.JFormattedTextField CampoVPassagem;
    private javax.swing.JFormattedTextField CampoValorTotal;
    private javax.swing.JComboBox ComboQuarto;
    private javax.swing.JComboBox ComboStatus;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JButton rota;
    // End of variables declaration//GEN-END:variables
}
