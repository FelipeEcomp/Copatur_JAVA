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
package Reserva;

import copatur.Elemento;

/**
 *
 * @author Felipe
 */
public class Reserva extends Elemento{
    
    private String NomeCliente;
    private String NomeHotel;
    private String NivelQuarto;
    private String Periodo;
    private String ValorHotel;
    private String DataPassagem;
    private String Destino;
    private String ValorPassagem;
    private String NomeAtendente;
    private String Status;
    private String Origem;
    private String ValorTotal;
    
    public Reserva() {
          
    }

    
    
    public String getNomeHotel() {
        return NomeHotel;
    }

    public void setNomeHotel(String NomeHotel) { //Método para cadastrar nome do cliente  
        this.NomeHotel = NomeHotel;        
    }
    
    public String getNivelQuarto() {
        return NivelQuarto;
    }

    public void setNivelQuarto(String NivelQuarto) { //Método para cadastrar nome do cliente  
        this.NivelQuarto = NivelQuarto;        
    }
    
    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String Periodo) { //Método para cadastrar nome do cliente  
        this.Periodo = Periodo;        
    }
    
    public String getValorHotel() {
        return ValorHotel;
    }
    
    public void setValorHotel(String ValorHotel) {
        this.ValorHotel = ValorHotel;
    }

    
    public String getDataPassagem() {
        return DataPassagem;
    }

    public void setDataPassagem(String DataPassagem) { //Método para cadastrar nome do cliente  
        this.DataPassagem = DataPassagem;        
    }
    
    
    
    
    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) { //Método para cadastrar nome do cliente  
        this.Destino = Destino;        
    }
    
    public String getOrigem() {
        return Origem;
    }
    public void setOrigem(String Origem) { //Método para cadastrar nome do cliente  
        this.Origem = Origem;        
    }
    
    public String getValorPassagem() {
        return ValorPassagem;
    }

    public void setValorPassagem(String ValorPassagem) { //Método para cadastrar nome do cliente  
        this.ValorPassagem = ValorPassagem;        
    }
    
    
    
    public String getNomeAtendente() {
        return NomeAtendente;
    }

    public void setNomeAtendente(String NomeAtendente) { //Método para cadastrar nome do cliente  
        this.NomeAtendente = NomeAtendente;        
    }
    
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) { //Método para cadastrar nome do cliente  
        this.Status = Status;        
    }
    
   
  public  void setNomeCliente(String NomeCliente) {
       this.NomeCliente = NomeCliente;
    }
  
    public String getNomeCliente() {
       return NomeCliente;
    }
public String getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(String ValorTotal) { //Método para cadastrar nome do cliente  
        this.ValorTotal = ValorTotal;        
    }
    
    
    
}
