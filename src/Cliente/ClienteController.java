/**
 * *****************************************************************************
 * Autor: Felipe Pinheiro de Oliveira e Alexsami Lopes Componente Curricular:
 * Programação II Concluido em: 21/11/2011 Declaro que este código foi elaborado
 * em dupla e não contém nenhum trecho de código de outro colega ou de outro
 * autor, tais como provindos de livros e apostilas, e páginas ou documentos
 * eletrônicos da Internet. Qualquer trecho de código de outra autoria que não a
 * minha está destacado com uma citação para o autor e a fonte do código, e
 * estou ciente que estes trechos não serão considerados para fins de avaliação.
 * ****************************************************************************************
 */
package Cliente;

import java.io.File;
import java.io.IOException;

public class ClienteController {

    
    private Cliente clienteob;
    private String NomeBuscado;
    private String CpfBuscado;
    private String TelefoneBuscado;
    private String EmailBuscado;
    private String CidadeBuscado;
    private String EstadoBuscado;

   private  File[] arquivo = null;
    public ClienteController() {
    }

   

    public void busca(String Nome) {

       
        
         String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação
        File arquivoCliente = new File(local+"\\Clientes\\"+Nome); //Busca o arquivo pelo nome do cliente
        try {
            clienteob = (Cliente) ClienteFile.lerObjeto(arquivoCliente);  //Passa o objeto do arquivo para a variável
            System.out.println("Objeto lido do arquivo ClienteController " + clienteob);
            System.out.println("Nome lido do arquivo ClienteController " + clienteob.getNome());
        } catch (IOException ex) {
            ex.printStackTrace(); //pilha de erro
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(); //pilha de erro
        }



        //Passa os dados buscados para variaveis que serão transferidas para a interface grafica de busca
        NomeBuscado = clienteob.getNome();
        CpfBuscado = clienteob.getCPF();
        TelefoneBuscado = clienteob.getTelefone();
        EmailBuscado = clienteob.getEmail();
        CidadeBuscado = clienteob.getCidade();
        EstadoBuscado = clienteob.getEstado();


    }

    public void remove(String 
            Nome) {

    
        System.out.println(Nome);
   String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação     
      File file = new File(local+"\\Clientes\\"+Nome);  
    if(file.exists())  // Se o arquivo existir, eh apagado
       file.delete();  


        
        

    }

    public void cadastraCliente(String Nome, String CPF, String Telefone, String Email, String Cidade, String Estado) {

        Cliente clienteob = new Cliente();
        clienteob.setNome(Nome);
        clienteob.setCPF(CPF);
        clienteob.setTelefone(Telefone);
        clienteob.setEmail(Email);
        clienteob.setCidade(Cidade);
        clienteob.setEstado(Estado);


        try {//Add no arquivo
            ClienteFile.gravaObjeto(clienteob);
            System.out.println("Objeto salvo no arquivo ");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Erro ao escrever no arquivo");
        }
        System.out.println("Isso foi lido do arquivo " + clienteob.getNome());

        
        

    }

    public void alteraDados(String altNome, String altCPF, String altTelefone, String altEmail, String altCidade, String altEstado, String antigoNome) {
       
        remove(antigoNome);
        //Sobrescreve os dados
        Cliente clienteAAlterar = new Cliente();
        clienteAAlterar.setNome(altNome);
        clienteAAlterar.setCPF(altCPF);
        clienteAAlterar.setTelefone(altTelefone);
        clienteAAlterar.setEmail(altEmail);
        clienteAAlterar.setCidade(altCidade);
        clienteAAlterar.setEstado(altEstado);

   
        
        try {//Add no arquivo
            ClienteFile.gravaObjeto(clienteAAlterar);
            System.out.println("Objeto salvo no arquivo ");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Erro ao escrever no arquivo");
        }
        System.out.println("Isso foi lido do arquivo " + clienteAAlterar.getNome());
        
        
        
        
        
        
        
        
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

   
public boolean verificaCPF(String CPF) throws IOException, ClassNotFoundException{
    Cliente[] clientes = ClienteFile.LerTodos();  
    boolean existe = false;
    
    for (int i = 0; i < clientes.length; i++) {
        if(clientes[i].getCPF().equalsIgnoreCase(CPF)) 
                 existe = true;
        if (existe == true)
            return existe;
        
    }
    return existe;
}

    public String[][] preencheTabela() throws IOException, ClassNotFoundException {
        Cliente[] clientes = ClienteFile.LerTodos();

        String[][] result = new String[clientes.length][4];
        for (int i = 0; i < clientes.length; i++) {
            
            Cliente client = clientes[i];
        
            result[i][0] = client.getNome();
            result[i][1] = client.getCPF();
            result[i][2] = client.getTelefone();
            result[i][3] = client.getCidade();
        }
        return result;
    }

}