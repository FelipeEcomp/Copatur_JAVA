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


import igrafica.CadastroReserva;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Felipe
 */
public class ReservaController {
   // private static Lista resLista = new Lista();
    private Reserva reservaob;
    CadastroReserva grafReserva = new CadastroReserva();
    
    private String ClienteBuscado;
    private String HotelBuscado;
    private String QuartoBuscado;
    private String PeriodoBuscado;
    private String ValorHotelBuscado;
    private String DataBuscado;   
    private String OrigemBuscado;
    private String DestinoBuscado;
    private String ValorPassagemBuscado;
    private String AtendenteBuscado;
    private String StatusBuscado;
    private String NumeroReserva;
    private String ValorTotal;

    public ReservaController() {

    }

    

    public void busca(String Nome) {

       String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação
        File arquivoReserva = new File(local+"\\Reservas\\"+Nome); //Busca o arquivo pelo nome do cliente
        try {
            reservaob = (Reserva) ReservaFile.lerObjeto(arquivoReserva);  //Passa o objeto do arquivo para a variável
            System.out.println("Objeto lido do arquivo ClienteController " + reservaob);
            System.out.println("Nome lido do arquivo ClienteController " + reservaob.getNome());
        } catch (IOException ex) {
            ex.printStackTrace(); //mostra qual o erro ocorrido
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(); //mostra qual o erro ocorrido
        }

        
      

        //Passa os dados buscados para variaveis que serão transferidas para a interface grafica de busca
        ClienteBuscado = reservaob.getNomeCliente();
        HotelBuscado = reservaob.getNomeHotel();
        QuartoBuscado = reservaob.getNivelQuarto();
        PeriodoBuscado = reservaob.getPeriodo();
        ValorHotelBuscado = reservaob.getValorHotel();
        DataBuscado = reservaob.getDataPassagem();
        OrigemBuscado = reservaob.getOrigem();
        DestinoBuscado = reservaob.getDestino();
        ValorPassagemBuscado = reservaob.getValorPassagem();
        AtendenteBuscado = reservaob.getNomeAtendente();
        StatusBuscado = reservaob.getStatus();
        ValorTotal = reservaob.getValorTotal();
        
    }

    public void remove(String Nome) {

          System.out.println(Nome);
   String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação     
      File file = new File(local+"\\Reservas\\"+Nome);  
    if(file.exists())  // Se o arquivo existir, eh apagado
       file.delete();  

    }

    public void cadastraReserva(String Nome, String Hotel, String Nivel, String Periodo, String ValorHotel, String Passagem, String Origem, String Destino, String ValorPassagem, String NomeAtendente, String Status, String ValorTotal) {

    String CodigoBusca = new StringBuilder().append(Nome).append(ValorTotal).toString();
    

        
        Reserva reservaob = new Reserva();
        reservaob.setNome(CodigoBusca);
        reservaob.setNomeCliente(Nome);
        reservaob.setNomeHotel(Hotel);
        reservaob.setNivelQuarto(Nivel);
        reservaob.setPeriodo(Periodo);
        reservaob.setValorHotel(ValorHotel);
        reservaob.setDataPassagem(Passagem);
        reservaob.setOrigem(Origem);
        reservaob.setDestino(Destino);
        reservaob.setValorPassagem(ValorPassagem);
        reservaob.setNomeAtendente(NomeAtendente);
        reservaob.setStatus(Status);
        reservaob.setValorTotal(ValorTotal);           

        try {//Add no arquivo
            ReservaFile.gravaObjeto(reservaob);
            System.out.println("Objeto salvo no arquivo ");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Erro ao escrever no arquivo");
        }
        

    }

    public void alteraDados(String altNome, String altHotel, String altNivel, String altPeriodo, String altValorHotel, String altPassagem, String altOrigem,String altDestino, String altValorPassagem, String altNomeAtendente, String altStatus, String antigoNome, String altValorTotal) {
       
       remove(antigoNome); 
       String CodigoBusca = new StringBuilder().append(altNome).append(altValorTotal).toString();
       Reserva reservaAAlterar = new Reserva();
        //Sobrescreve os dados    
        reservaAAlterar.setNome(CodigoBusca);
        reservaAAlterar.setNomeCliente(altNome);
        reservaAAlterar.setNomeHotel(altHotel);
        reservaAAlterar.setNivelQuarto(altNivel);
        reservaAAlterar.setPeriodo(altPeriodo);
        reservaAAlterar.setValorHotel(altValorHotel);
        reservaAAlterar.setDataPassagem(altPassagem);
        reservaAAlterar.setOrigem(altOrigem);
        reservaAAlterar.setDestino(altDestino);
        reservaAAlterar.setValorPassagem(altValorPassagem);
        reservaAAlterar.setNomeAtendente(altNomeAtendente);
        reservaAAlterar.setStatus(altStatus);
        reservaAAlterar.setValorTotal(altValorTotal);
         
       // celAtual.setElemento(reservaAAlterar);
        
        
         try {//Add no arquivo
            ReservaFile.gravaObjeto(reservaAAlterar);
            System.out.println("Objeto salvo no arquivo ");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Erro ao escrever no arquivo");
        }
        System.out.println("Isso foi lido do arquivo " + reservaAAlterar.getNome());
        
    }

    //Metodos de setar e retornar os atributos dos elementos buscados  
    
   
    
   
      
    public String getClienteBuscado() {
        return ClienteBuscado;
    }

    public String getHotelBuscado() {
        return HotelBuscado;
    }

    public String getQuartoBuscado() {
        return QuartoBuscado;
    }

    public String getPeriodoBuscado() {
        return PeriodoBuscado;
    }

    public String getValorHotelBuscado() {
        return ValorHotelBuscado;
    }

    public String getDataBuscado() {
        return DataBuscado;
    }
    
    public String getDestinoBuscado() {
        return DestinoBuscado;
    }
    public String getOrigemBuscado() {
         return OrigemBuscado;
    }
    
    public String getValorPassagemBuscado() {
        return ValorPassagemBuscado;
    }
    
    public String getAtendenteBuscado() {
        return AtendenteBuscado;
    }
    
    public String getStatusBuscado() {
        return StatusBuscado;
    }

  public String getValorTotal() {
        return ValorTotal;
    }
  
   
    
     public String[][] preencheTabela() throws IOException, ClassNotFoundException {
        Reserva[] reservas = ReservaFile.LerTodos();

        String[][] result = new String[reservas.length][7];
        for (int i = 0; i < reservas.length; i++) {
            System.out.println("I "+i);
            Reserva res = reservas[i];
            
            
            String CodigoBusca = new StringBuilder().append(res.getNomeCliente()).append(res.getValorTotal()).toString();
            result[i][0] = CodigoBusca;
            result[i][1] = res.getNomeCliente();
            result[i][2] = res.getNomeAtendente();
            result[i][3] = res.getDestino();
            result[i][4] = res.getPeriodo();
            result[i][5] = res.getNivelQuarto();
            result[i][6] = res.getStatus();
        }
        return result;
    }
}
