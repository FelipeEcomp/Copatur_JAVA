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
package Hotel;



import java.io.File;
import java.io.IOException;

public class HotelController {
   
    private Hotel hotelob;
   
    private String NomeBuscado;
    private String TelefoneBuscado;
    private String CidadeBuscado;
    private String EstadoBuscado;
    private String BairroBuscado;
    private String EnderecoBuscado;   
    private String CNPJBuscado;
    
    
    
    public HotelController() {

    }

   

    public void busca(String Nome) {

         String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação
        File arquivoHotel = new File(local+"\\Hoteis\\"+Nome); //Busca o arquivo pelo nome do cliente
        try {
            hotelob = (Hotel) HotelFile.lerObjeto(arquivoHotel);  //Passa o objeto do arquivo para a variável
            System.out.println("Objeto lido do arquivo ClienteController " + hotelob);
            System.out.println("Nome lido do arquivo ClienteController " + hotelob.getNome());
        } catch (IOException ex) {
            ex.printStackTrace(); //mostra qual o erro ocorrido
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(); //mostra qual o erro ocorrido
        }

     
        
 

        //Passa os dados buscados para variaveis que serão transferidas para a interface grafica de busca
        NomeBuscado = hotelob.getNome();
        TelefoneBuscado = hotelob.getTelefone();
        CidadeBuscado = hotelob.getCidade();
        EstadoBuscado = hotelob.getEstado();
        BairroBuscado = hotelob.getBairro();
        EnderecoBuscado = hotelob.getEndereco();
        CNPJBuscado = hotelob.getCNPJ(); //ta pra cliente mudar qd por generic
      
    }

    public void remove(String Nome) {
 
        System.out.println(Nome);
   String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação     
      File file = new File(local+"\\Hoteis\\"+Nome);  
    if(file.exists())  // Se o arquivo existir, eh apagado
       file.delete(); 

    }

    public void cadastraHotel(String Nome, String Telefone, String Cidade, String Estado, String Bairro, String Endereco, String CNPJ) {

        Hotel hotelob = new Hotel();
        hotelob.setNome(Nome);
        hotelob.setTelefone(Telefone);
        hotelob.setCidade(Cidade);
        hotelob.setEstado(Estado);
        hotelob.setBairro(Bairro);     
        hotelob.setEndereco(Endereco);
        hotelob.setCNPJ(CNPJ);
        
        
        try {//Add no arquivo
            HotelFile.gravaObjeto(hotelob);
            System.out.println("Objeto salvo no arquivo ");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Erro ao escrever no arquivo");
        }
        System.out.println("Isso foi lido do arquivo " + hotelob.getNome());
        

    }

    
    public void alteraDados(String altNome, String altTelefone, String altCidade, String altEstado, String altBairro, String altEndereco, String altCNPJ, String antigoNome) {
       
        remove(antigoNome);
        Hotel hotelAAlterar = new Hotel();
        //Sobrescreve os dados      
        hotelAAlterar.setNome(altNome);        
        hotelAAlterar.setTelefone(altTelefone);
        hotelAAlterar.setCidade(altCidade);
        hotelAAlterar.setEstado(altEstado);
        hotelAAlterar.setBairro(altBairro);
        hotelAAlterar.setCNPJ(altCNPJ);
         hotelAAlterar.setEndereco(altBairro);
     
        
        try {//Add no arquivo
            HotelFile.gravaObjeto(hotelAAlterar);
            System.out.println("Objeto salvo no arquivo ");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Erro ao escrever no arquivo");
        }
        System.out.println("Isso foi lido do arquivo " + hotelAAlterar.getNome());
        
        
    }

 //Metodos de setar e retornar os atributos dos elementos buscados   
    public String getNomeBuscado() {
        return NomeBuscado;
    }
    
    public String getTelefoneBuscado() {
        return TelefoneBuscado;
    }
    
     public String getCidadeBuscado() {
        return CidadeBuscado;
    }

    public String getEstadoBuscado() {
        return EstadoBuscado;
    }
    
    public String getBairroBuscado() {
        return BairroBuscado;
    }

    public String getEnderecoBuscado() {
        return EnderecoBuscado;
    }

    public String getCNPJBuscado() {
        return CNPJBuscado;
    }

   

  
  
   
 
    
    
  
   
    
   public String[][] preencheTabela() throws IOException, ClassNotFoundException {
        Hotel[] hoteis = HotelFile.LerTodos();

        String[][] result = new String[hoteis.length][5];
        for (int i = 0; i < hoteis.length; i++) {
            System.out.println("I "+i);
            Hotel atend = hoteis[i];
            System.out.println(atend);
            result[i][0] = atend.getNome();
            result[i][1] = atend.getEndereco();
            result[i][2] = atend.getBairro();
            result[i][3] = atend.getCidade();            
            result[i][4] = atend.getEstado();
        }
        return result;
    }
}
    
    
    
  