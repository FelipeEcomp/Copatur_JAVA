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

import copatur.Pessoa;



public class Atendente extends Pessoa { //Subclasse de Pessoa
     private String DataEntrada; //Data em que o funcionario entrou na empresa
     private String Salario; //Salario do Funcionario
     
     
     
    public Atendente() {
          
    }

    public String getDataEntrada() {
        return DataEntrada;
    }

    public void setDataEntrada(String DataEntrada) { //Método para cadastrar nome do cliente  
        this.DataEntrada = DataEntrada;        
    }
    
    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) { //Método para cadastrar nome do cliente  
        this.Salario = Salario;        
    }

    
}
