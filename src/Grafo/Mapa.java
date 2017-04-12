/*******************************************************************************
Autor: Felipe Pinheiro de Oliveira, Alexsami Lopes e Marcos Norberto
Componente Curricular: Programação II
Concluido em: 21/11/2011
Declaro que este código foi elaborado em dupla e não contém nenhum 
trecho de código de outro colega ou de outro autor, tais como provindos de livros e 
apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
******************************************************************************************/
package Grafo;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.geom.Ellipse2D;
import javax.swing.JOptionPane;

public class Mapa extends JPanel {

   

    private int dx = 0;// coordenadas
    private int dy = 0;
    private int ox = 0;
    private int oy = 0;
    
   Image mapabr;
   Dimension size;

 String nOrigem;
 String nDestino;
  
    private Ellipse2D Salvador;
    private Ellipse2D Rio;
    private Ellipse2D SaoPaulo;
    private Ellipse2D BH;
    private Ellipse2D Recife;
    private Ellipse2D Fortaleza;
    private Ellipse2D Manaus;
    private Ellipse2D Cuiaba;
    private Ellipse2D Natal;
    private Ellipse2D Goiania;
    private Ellipse2D Porto;
    private Ellipse2D Brasilia;
    private Ellipse2D Branco;
    private Ellipse2D Curitiba;
    private Ellipse2D Belem;
   
    //Vertices
 
 private int Origem = 0;
 private int Destino = 0;
   private int[] caminho=null;
 //Definindo caminho entre os vertices
 
 
 
 
    public Mapa() { //A janela possui o tamanho da Imagem
        size = new Dimension();
        mapabr = new ImageIcon(this.getClass().getResource("mapabr2.gif")).getImage();
        size.width = mapabr.getWidth(null);
        size.height = mapabr.getHeight(null);
        
        setPreferredSize(size);
        
     
        
        
        this.addMouseListener( //evento que diz a coordenada do mouse o clicar
      new MouseAdapter(){
        public void mouseClicked(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();

          

            if (Salvador.contains(x, y)) {
                
                if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                      Origem = 0;
                   
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                     Destino = 0;
                     
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                    
                    
            }
            
            if (Rio.contains(x, y)) {
                
                 if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                    Origem = 1;  
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                    Destino = 1;
                    
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                         
                    
            }
            
            if (SaoPaulo.contains(x, y)) {
                
                 if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                      Origem = 2;
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                    Destino = 2;
                    
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                     
                    
                
            }
            
            if (BH.contains(x, y)) {
               if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                      Origem = 3;
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                     Destino = 3;
                     
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                          
                   
            }

            if (Recife.contains(x, y)) {
                 if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                     Origem = 4;
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                    Destino = 4;
                    
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                
                    
            }

            if (Fortaleza.contains(x, y)) {
                if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                     Origem = 5; 
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                    Destino = 5;
                    
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
             }               
                   
            }

            if (Manaus.contains(x, y)) {
                if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                      Origem = 6;
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                    Destino = 6;
                    
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                 
                   
            }
            if (Cuiaba.contains(x, y)) {
                if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                     Origem = 7; 
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                   Destino = 7;
                   
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                           
                   
            }

            if (Natal.contains(x, y)) {
                if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                      Origem = 8;
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                   Destino = 8;
                   
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                     
                   
            }
            
            if (Goiania.contains(x, y)) {
                  if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                      Origem = 9;
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                    Destino = 9;
                    
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                     
                    
            }
            
            if (Porto.contains(x, y)) {
                  if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                      Origem = 10;
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                     Destino = 10;
                     
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                
                   
            }
            
            if (Brasilia.contains(x, y)) {
                 if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                      Origem = 11;
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                      Destino = 11;
                      
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                
                    
            }
            
            if (Branco.contains(x, y)) {
              if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                      Origem = 12;
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                     Destino = 12;
                     
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                         
                    
            }
            
            if (Curitiba.contains(x, y)) {
                 if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                      Origem = 13;
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                     Destino = 13;
                     
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                       
                        }
            
            if (Belem.contains(x, y)) {   
                if (e.getButton() == MouseEvent.BUTTON3){ //botao direito 
                       ox = e.getX();
                       oy = e.getY();
                      Origem = 14;
            }
             if (e.getButton() == MouseEvent.BUTTON1){ //botao esquerdo
                       
                       dx = e.getX();
                       dy = e.getY();
                    Destino = 14;                    
                    
                try {
                    menorCaminho(Origem, Destino); //calcula o menor caminho entre os vertices
                } catch (Exception ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
                }                        
                     }
           
        
        }
           
      }
    );    
        
        
        
        
        
        Salvador = new Ellipse2D.Double(718, 420, 15, 15);
        Rio = new Ellipse2D.Double(612, 606, 15, 15);
        SaoPaulo = new Ellipse2D.Double(540, 618, 15, 15);
        BH = new Ellipse2D.Double(603, 545, 15, 15);
        Recife = new Ellipse2D.Double(794, 332, 15, 15);
        Fortaleza = new Ellipse2D.Double(720, 234, 15, 15);
        Manaus = new Ellipse2D.Double(331, 202, 15, 15);
        Cuiaba = new Ellipse2D.Double(378, 444, 15, 15);
        Natal = new Ellipse2D.Double(790, 281, 15, 15);
        Goiania = new Ellipse2D.Double(507, 478, 15, 15);
        Porto = new Ellipse2D.Double(460, 747, 15, 15);
        Brasilia = new Ellipse2D.Double(536, 462, 15, 15);
        Branco = new Ellipse2D.Double(145, 338, 15, 15);
        Curitiba = new Ellipse2D.Double(498, 654, 15, 15);
        Belem = new Ellipse2D.Double(536, 172, 15, 15);  
        
    }
    
    public void setCaminho(int[] caminho){ //metodo com os vertices do menor caminho
    this.caminho=caminho;
    }

    public void paint(Graphics g) { //metodo que pinta os vertices no mapa

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(mapabr, 0, 0, null);
        g2d.setColor(Color.black);
        
         
         float dashes[] = {1};
         g2d.setStroke(new BasicStroke(4,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,10,dashes,0)); //Propriedades da linha
        
        int a = size.width;
        int b = size.height;
        
        
        g2d.setColor(Color.RED);
        
        
        g2d.fill(Salvador);
        g2d.fill(Rio);
        g2d.fill(SaoPaulo);
        g2d.fill(BH);
        g2d.fill(Recife);
        g2d.fill(Fortaleza);
        g2d.fill(Manaus);
        g2d.fill(Cuiaba);
        g2d.fill(Natal);
        g2d.fill(Goiania);
        g2d.fill(Porto);
        g2d.fill(Brasilia);
        g2d.fill(Branco);
        g2d.fill(Curitiba);
        g2d.fill(Belem);
        
        
    }
    
       

    
  public void desenhaCaminho(){ //desenha as rotas do menor caminho
     
    Graphics2D g2d = (Graphics2D)this.getGraphics();
      
      g2d.setColor(Color.black);
      
      float dashes[] = {1};
         g2d.setStroke(new BasicStroke(4,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,10,dashes,0)); //Propriedades da linha
        
        
      
     
     int i =0;
      //desenhando os caminhos passando pelos vertices
      while(caminho[i]==16){
      i++;
      }
     while(i<15){
     int vertice=caminho[i];
     
      if (vertice == 0) { //ssa
          if (ox == 0 && oy == 0){
              ox = 722;
              oy = 424; 
              
          }
          else{
              dx = 722;
              dy = 424;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
      
       if (vertice == 1) { //rj
          if (ox == 0 && oy == 0){
              ox = 616;
              oy = 610; 
              
          }
          else{
              dx = 616;
              dy = 610;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
      
       if (vertice == 2) {//sp
          if (ox == 0 && oy == 0){
              ox = 544;
              oy = 622; 
              
          }
          else{
              dx = 544;
              dy = 622;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
      
      if (vertice == 3) { //bh
          if (ox == 0 && oy == 0){
              ox = 607;
              oy = 549; 
              
          }
          else{
              dx = 607;
              dy = 549;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
      
      if (vertice == 4) { //re
          if (ox == 0 && oy == 0){
              ox = 798;
              oy = 336; 
              
          }
          else{
              dx = 798;
              dy = 336;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
      
      if (vertice == 5) {//fo
          if (ox == 0 && oy == 0){
              ox = 724;
              oy = 238; 
              
          }
          else{
              dx = 724;
              dy = 238;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
      
      
      
      if (vertice == 6) {//ma
          if (ox == 0 && oy == 0){
              ox = 335;
              oy = 206; 
              
          }
          else{
              dx = 335;
              dy = 206;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
      
      if (vertice == 7) {//cu
          if (ox == 0 && oy == 0){
              ox = 382;
              oy = 448; 
              
          }
          else{
              dx = 382;
              dy = 448;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
      
      if (vertice == 8) {//natal
          if (ox == 0 && oy == 0){
              ox = 790;
              oy = 281; 
              
          }
          else{
              dx = 794;
              dy = 285;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
      
      if (vertice == 9) {//go
          if (ox == 0 && oy == 0){
              ox = 511;
              oy = 482; 
              
          }
          else{
              dx = 511;
              dy = 482;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
            
      if (vertice == 10) {//po
          if (ox == 0 && oy == 0){
              ox = 464;
              oy = 751; 
              
          }
          else{
              dx = 464;
              dy = 751;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
      if (vertice == 11) {//bsb
          if (ox == 0 && oy == 0){
              ox = 540;
              oy = 466; 
              
          }
          else{
              dx = 540;
              dy = 466;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
      
      if (vertice == 12) {//br
          if (ox == 0 && oy == 0){
              ox = 149;
              oy = 342; 
              
          }
          else{
              dx = 149;
              dy = 342;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
      
      if (vertice == 13) { //cur
          if (ox == 0 && oy == 0){
              ox = 502;
              oy = 658; 
              
          }
          else{
              dx = 502;
              dy = 658;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
      }
      
      if (vertice == 14) { //be
          if (ox == 0 && oy == 0){
              ox = 540;
              oy = 176; 
              
          }
          else{
              dx = 540;
              dy = 176;
              g2d.drawLine(ox, oy, dx, dy);
              ox = dx;
              oy = dy;
          }
          
      }
      i++;
  }
        
  }
   
  
  
    private void menorCaminho(int Origem, int Destino) throws Exception {
      int[] caminho = null;
      int a;
           System.out.print ("No. vertices:"); 
    int nVertices = 16;
    System.out.print ("No. arestas:"); 
    int nArestas = 60;
    System.out.print ("Raiz da ACMC:"); 
    int raiz = Origem;
    
Grafo grafo = new Grafo (16);
     Dijkstra dj = new Dijkstra (grafo);
     for (int i = 0; i < nArestas; i++) {
   
   //criação das arestas com seus pesos   
  grafo.insereAresta(0, 1, 100);
  grafo.insereAresta(0, 3, 90);
  grafo.insereAresta(0, 4, 50);
  grafo.insereAresta(0, 8, 60);
  grafo.insereAresta(1, 3, 50);
  grafo.insereAresta(1, 2, 40);
  grafo.insereAresta(1, 0, 95);
  grafo.insereAresta(1, 13, 50);
  grafo.insereAresta(2, 1, 50);  
  grafo.insereAresta(2, 3, 50);
  grafo.insereAresta(2, 9, 200);
  grafo.insereAresta(2, 13, 100);
  grafo.insereAresta(3, 2, 200);
  grafo.insereAresta(3, 11, 50);
  grafo.insereAresta(3, 9, 90);
  grafo.insereAresta(3, 1, 40);
  grafo.insereAresta(4, 0, 100);
  grafo.insereAresta(4, 8, 50);
  grafo.insereAresta(4, 5, 90);
  grafo.insereAresta(4, 14, 250);
  grafo.insereAresta(5, 14, 60);
  grafo.insereAresta(5, 8, 70);
  grafo.insereAresta(5, 0, 150);
  grafo.insereAresta(5, 11, 200);
  grafo.insereAresta(6, 12, 50);
  grafo.insereAresta(6, 7, 300);
  grafo.insereAresta(6, 14, 90);
  grafo.insereAresta(6, 9, 300);
  grafo.insereAresta(7, 2, 50);
  grafo.insereAresta(7, 10, 60);
  grafo.insereAresta(7, 1, 200);
  grafo.insereAresta(7, 9, 300);
  grafo.insereAresta(8, 0, 200);  
  grafo.insereAresta(8, 4, 50);
  grafo.insereAresta(8, 5, 60);
  grafo.insereAresta(8, 11, 300);
  grafo.insereAresta(9, 11, 40);
  grafo.insereAresta(9, 7, 50);
  grafo.insereAresta(9, 6, 350);
  grafo.insereAresta(9, 3, 200);
  grafo.insereAresta(10, 13, 60);
  grafo.insereAresta(10, 7, 300);
  grafo.insereAresta(10, 2, 200);
  grafo.insereAresta(10, 1, 350);
  grafo.insereAresta(11, 7, 200);
  grafo.insereAresta(11, 9, 50);
  grafo.insereAresta(11, 14, 350);
  grafo.insereAresta(11, 2, 200);
  grafo.insereAresta(12, 6, 80);
  grafo.insereAresta(12, 7, 120);
  grafo.insereAresta(12, 14, 200);
  grafo.insereAresta(12, 11, 100);
  grafo.insereAresta(13, 10, 50);
  grafo.insereAresta(13, 7, 300);
  grafo.insereAresta(13, 1, 250);
  grafo.insereAresta(13, 3, 200);
  grafo.insereAresta(14, 6, 50);
  grafo.insereAresta(14, 5, 80);
  grafo.insereAresta(14, 8, 200);
  grafo.insereAresta(14, 4, 300);
  
  
    
    grafo.imprime (); //imprime matriz de adjascencia
    
    dj.obterArvoreCMC (raiz);   
    dj.imprime (); //imprime as arestas percorridos com os respectivos pesos
   dj.imprimeCaminho (Origem, Destino); //imprime o menor caminho através do pesos das arestas
                                          //o peso das arestas representam os custos da passagem
  
    
    }//atribuição de numeros a cada cidade do grafo
    if (Origem == 0) nOrigem = "Salvador"; if (Destino == 0) nDestino = "Salvador";
    if (Origem == 1) nOrigem = "Rio de Janeiro";if (Destino == 1) nDestino = "Rio de Janeiro";
    if (Origem == 2) nOrigem = "São Paulo";if (Destino == 2) nDestino = "São Paulo";
    if (Origem == 3) nOrigem = "Belo Horizonte";if (Origem == 3) nDestino = "Belo Horizonte";
    if (Origem == 4) nOrigem = "Recife";if (Destino == 4) nDestino = "Recife";
    if (Origem == 5) nOrigem = "Fortaleza"; if (Destino == 5) nDestino = "Fortaleza";
    if (Origem == 6) nOrigem = "Manaus";if (Destino == 6) nDestino = "Manaus";
    if (Origem == 7) nOrigem = "Cuiabá";if (Destino == 7) nDestino = "Cuiabá";
    if (Origem == 8) nOrigem = "Natal";if (Destino == 8) nDestino = "Natal";
    if (Origem == 9) nOrigem = "Goiania";if (Destino== 9) nDestino= "Goiania";
    if (Origem == 10) nOrigem = "Porto Alegre";if (Destino == 10) nDestino = "Porto Alegre";
    if (Origem == 11) nOrigem = "Brasilia"; if (Destino == 11) nDestino = "Brasilia";
    if (Origem == 12) nOrigem = "Rio Branco";if (Destino == 12) nDestino = "Rio Branco";
    if (Origem == 13) nOrigem = "Curitiba";if (Destino == 13) nDestino= "Curitiba";
    if (Origem == 14) nOrigem = "Belem";if (Destino == 14) nDestino = "Belem";
    
              JOptionPane.showMessageDialog(null, "ROTA TRAÇADA COM SUCESSO\nCOLOCAR OS DADOS NOS RESPECTIVOS CAMPOS:\nORIGEM: "
                +nOrigem+"\nDESTINO: "+nDestino+"\nVALOR MAIS BARATO: R$"+dj.peso(Destino)+"\nAPERTE O BOTÃO PARA VISUALIZAR A ROTA");
 
              
              setCaminho(dj.getCaminho());
              desenhaCaminho();//método que desenha a rota de mnor custo no mapa
        }
        
   
    
    
    
    
    
   
}
    
  

  
  
  
 


