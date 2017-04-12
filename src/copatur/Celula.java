/*******************************************************************************
Autor: Caelum, Felipe Pinheiro de Oliveira e Alexsami Lopes
Componente Curricular: Programação II
Concluido em: 21/11/2011
Declaro que parte deste código foi elaborado em dupla e outra parte foi 
 retirada do material disponibilizado pela Caelum, onde foram feitas algumas alterações de minha parte
 para que esse código se adequasse melhor ao meu programa. 
******************************************************************************************/

package copatur;




public class Celula {

//É o nó da lista encadeada
    private Celula proxima; //proxima celula
    private Object elemento; //elemento ao qual se refere (cliente)


    public Celula(Celula proxima, Object elemento) { //Construtor com 2 parametros, usado em alguns métodos, em que se necessita saber  posição
        this.proxima = proxima; 
        this.elemento = elemento;

    }

    public Celula(Object elemento) { //Construtor usado em métdo em que se necessita saber apenas o elemento
        this.elemento = elemento;
    }

    public void setProxima(Celula proxima) { 
        this.proxima = proxima;

    }

    public Celula getProxima() {
        return proxima;
    }

        
    public Elemento getElemento() {
        return (Elemento) elemento;
    }
    
    
    
    
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }      
  
}
