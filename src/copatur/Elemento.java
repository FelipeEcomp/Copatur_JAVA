/**
 * *****************************************************************************
 * Autor: Felipe Pinheiro de Oliveira e Alexsami Lopes Componente Curricular:
 * Programação II Concluido em: 21/11/2011 Declaro que este código foi elaborado
 * em dupla e não contém nenhum trecho de código de outro colega ou de outro
 * autor, tais como provindos de livros e apostilas, e páginas ou documentos
 * eletrônicos da Internet. Qualquer trecho de código de outra autoria que não a
 * minha está destacado com uma citação para o autor e a fonte do código, e
 * estou ciente que estes trechos não serão considerados para fins de avaliação.
*****************************************************************************************
 */
package copatur;

import java.io.Serializable;

/**
 *
 * @author Felipe
 */
public class Elemento implements Serializable {

    private String nome;

    public Elemento() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { //Método para cadastrar nome do cliente  
        this.nome = nome;

    }
}
