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

/**
 *
 * @author Felipe
 */
public class Copaturgraf extends javax.swing.JFrame {
   
    Clientegraf CliGraf;
    Atendentegraf AteGraf;
    Hotelgraf HotelGraf;
   // Passagemgraf
    
    public Copaturgraf() {
        initComponents();
      setLocationRelativeTo( null ); // Centraliza Janela
    }
//Metodos para abrir as janelas

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jColorChooser1 = new javax.swing.JColorChooser();
        jFrame2 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cliente = new javax.swing.JButton();
        Hotel = new javax.swing.JButton();
        Atendentes = new javax.swing.JButton();
        Passagem = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 36));
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("COPATUR");

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 0, 18));
        jLabel2.setText("Tornando suas férias inesquecíveis!!!");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igrafica/mundogirando.gif"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igrafica/Turismoimgs.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igrafica/Turismoimgs.jpg"))); // NOI18N

        Cliente.setFont(new java.awt.Font("Tahoma", 0, 24));
        Cliente.setText("Clientes");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });

        Hotel.setFont(new java.awt.Font("Tahoma", 0, 24));
        Hotel.setText("Hotéis");
        Hotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotelActionPerformed(evt);
            }
        });

        Atendentes.setFont(new java.awt.Font("Tahoma", 0, 24));
        Atendentes.setText("Atendentes");
        Atendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtendentesActionPerformed(evt);
            }
        });

        Passagem.setFont(new java.awt.Font("Tahoma", 0, 24));
        Passagem.setText("Reserva");
        Passagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Hotel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Atendentes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                            .addComponent(Passagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Atendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Passagem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
       Clientegraf CliGraf = new Clientegraf();  
       CliGraf.setVisible(true);
    }//GEN-LAST:event_ClienteActionPerformed

    private void AtendentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtendentesActionPerformed
      Atendentegraf AteGraf = new Atendentegraf();  
       AteGraf.setVisible(true);
    }//GEN-LAST:event_AtendentesActionPerformed

    private void HotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotelActionPerformed
        Hotelgraf HotelGraf = new Hotelgraf();  
       HotelGraf.setVisible(true);
    }//GEN-LAST:event_HotelActionPerformed

    private void PassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassagemActionPerformed
       Reservagraf ResGraf = new Reservagraf();  
       ResGraf.setVisible(true);
    }//GEN-LAST:event_PassagemActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atendentes;
    private javax.swing.JButton Cliente;
    private javax.swing.JButton Hotel;
    private javax.swing.JButton Passagem;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
