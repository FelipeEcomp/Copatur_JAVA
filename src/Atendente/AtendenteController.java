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
package Atendente;



import java.io.File;
import java.io.IOException;

public class AtendenteController {
    
    private Atendente atendenteob;
    
    private String NomeBuscado;
    private String CpfBuscado;
    private String TelefoneBuscado;
    private String EmailBuscado;
    private String CidadeBuscado;
    private String EstadoBuscado;   
    private String DataBuscado;
    private String SalarioBuscado;
    
    
    public AtendenteController() {

    }

   
    public void busca(String Nome) {
    
  String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação
        File arquivoAtendente = new File(local+"\\Atendentes\\"+Nome); //Busca o arquivo pelo nome do cliente
        try {
            atendenteob = (Atendente) AtendenteFile.lerObjeto(arquivoAtendente);  //Passa o objeto do arquivo para a variável
            System.out.println("Objeto lido do arquivo ClienteController " + atendenteob);
            System.out.println("Nome lido do arquivo ClienteController " + atendenteob.getNome());
        } catch (IOException ex) {
            ex.printStackTrace(); //mostra qual o erro ocorrido
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(); //mostra qual o erro ocorrido
        }
        
        
        
        

        //Passa os dados buscados para variaveis que serão transferidas para a interface grafica de busca
        NomeBuscado = atendenteob.getNome();
       CpfBuscado = atendenteob.getCPF();
        TelefoneBuscado = atendenteob.getTelefone();
        EmailBuscado = atendenteob.getEmail();
        CidadeBuscado = atendenteob.getCidade();
        EstadoBuscado = atendenteob.getEstado();
        DataBuscado = atendenteob.getDataEntrada(); //ta pra cliente mudar qd por generic
        SalarioBuscado = atendenteob.getSalario();
        
        
    }

    public void remove(String Nome) {

    
        System.out.println(Nome);
   String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação     
      File file = new File(local+"\\Atendentes\\"+Nome);  
    if(file.exists())  // Se o arquivo existir, eh apagado
       file.delete();  

    }

    public void cadastraAtendente(String Nome, String CPF, String Telefone, String Email, String Cidade, String Estado, String Data, String Salario) {

        Atendente atendenteob = new Atendente();
        atendenteob.setNome(Nome);
        atendenteob.setCPF(CPF);
        atendenteob.setTelefone(Telefone);
        atendenteob.setEmail(Email);
        atendenteob.setCidade(Cidade);
        atendenteob.setEstado(Estado);
        atendenteob.setDataEntrada(Data);
        atendenteob.setSalario(Salario);     
        
        
        try {//Add no arquivo
            AtendenteFile.gravaObjeto(atendenteob);
            System.out.println("Objeto salvo no arquivo ");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Erro ao escrever no arquivo");
        }
        System.out.println("Isso foi lido do arquivo " + atendenteob.getNome());

    }

   
    public void alteraDados(String altNome, String altCPF, String altTelefone, String altEmail, String altCidade, String altEstado, String altData, String altSalario, String antigoNome) {
        //Altera dados do cliente,  o parametro antigoCPF foi criado para não perder a informação de onde estar o cliente que eu quero alterar
     
       Atendente atendenteAAlterar = new Atendente();
        remove(antigoNome);
        //Sobrescreve os dados      
        atendenteAAlterar.setNome(altNome);
        atendenteAAlterar.setCPF(altCPF);
        atendenteAAlterar.setTelefone(altTelefone);
        atendenteAAlterar.setEmail(altEmail);
        atendenteAAlterar.setCidade(altCidade);
        atendenteAAlterar.setEstado(altEstado);
        atendenteAAlterar.setDataEntrada(altData);
        atendenteAAlterar.setSalario(altSalario);
       
      
        
       try {//Add no arquivo
            AtendenteFile.gravaObjeto(atendenteAAlterar);
            System.out.println("Objeto salvo no arquivo ");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Erro ao escrever no arquivo");
        }
        System.out.println("Isso foi lido do arquivo " + atendenteAAlterar.getNome()); 
        
        
        
        
        
    }

 //Metodos de setar e retornar os atributos dos elementos buscados   
    public String getNomeBuscado() {
        return NomeBuscado;
    }

    public String getCpfBuscado() {
        return CpfBuscado;
    }

    public String getEmailBuscado() {
        return EmailBuscado;
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

    public String getDataBuscado() {
        return DataBuscado;
    }
    
    public String getSalarioBuscado() {
        return SalarioBuscado;
    }
    
    

  public boolean verificaCPF(String CPF) throws IOException, ClassNotFoundException{
    Atendente[] atendentes = AtendenteFile.LerTodos();  
    boolean existe = false;
    for (int i = 0; i < atendentes.length; i++) {
        if(atendentes[i].getCPF().equalsIgnoreCase(CPF)) 
                 existe = true;
        if (existe == true)
            return existe;
        
    }
          
      
      return existe;
  }  
    
    
    
  
    
    
        public String[][] preencheTabela() throws IOException, ClassNotFoundException {
        Atendente[] atendentes = AtendenteFile.LerTodos();

        String[][] result = new String[atendentes.length][4];
        for (int i = 0; i < atendentes.length; i++) {
          
            Atendente atend = atendentes[i];
          
            result[i][0] = atend.getNome();
            result[i][1] = atend.getCPF();
            result[i][2] = atend.getTelefone();
            result[i][3] = atend.getEmail();
        }
        return result;
    }



}