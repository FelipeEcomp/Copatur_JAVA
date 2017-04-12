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

import copatur.Elemento;


public class Hotel extends Elemento {
    
    private String Endereco;
    private String Cidade;
    private String Estado;
    private String Telefone;
    private String Bairro;
    private String CNPJ;
    
    
    public Hotel() {
}
    
       
    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) { //Método para cadastrar nome do cliente  
        this.Endereco = Endereco;        
    }
    
    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) { //Método para cadastrar nome do cliente  
        this.Telefone = Telefone;        
    }
    
    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) { //Método para cadastrar nome do cliente  
        this.Bairro = Bairro;        
    }
    
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) { //Método para cadastrar nome do cliente  
        this.CNPJ = CNPJ;        
    }
    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) { //Método para cadastrar nome do cliente  
        this.Cidade = Cidade;
           }
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) { //Método para cadastrar nome do cliente  
        this.Estado = Estado;        
    }
    
    
}