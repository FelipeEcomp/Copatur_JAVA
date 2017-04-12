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

/**
 *
 * @author Felipe
 */
public class Pessoa extends Elemento { //Superclasse para Atendente e Clientes

    private String cpf;
    private String tel;
    private String email;
    private String estado;
    private String cidade;

    public Pessoa() {
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) { //Método para cadastrar cpf do cliente           
        this.cpf = cpf;
    }

    public String getTelefone() {
        return tel;
    }

    public void setTelefone(String tel) { //Método para cadastrar telefone do cliente          
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) { //Método para cadastrar email do cliente          
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) { //Método para cadastrar estado do cliente          
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) { //Método para cadastrar cidade do cliente           
        this.cidade = cidade;
    }
}
