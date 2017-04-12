/*******************************************************************************
Autor: Caelum, Felipe Pinheiro de Oliveira e Alexsami Lopes 
Componente Curricular: Programação II
Concluido em: 21/11/2011
Declaro que parte deste código foi elaborado em dupla e outra parte foi 
 retirada do material disponibilizado pela Caelum, onde foram feitas algumas alterações de minha parte
 para que esse código se adequasse melhor ao meu programa. 
******************************************************************************************/



package copatur;


public class Lista {

    private Celula primeira;
    private Celula ultima;
    private Celula anterior; //a lista eh duplamente ligada, por isso a inserçao desse atributo
    private int totalDeElementos;


    //Adiciona no fim da lista
    public void adicionaNoFim(Object elemento) {
if (this.totalDeElementos == 0) {  //checa se tem algum elemento na lista         
            this.adicionaNoComeco(elemento);         //chama metodo de add no começo

        } else {
            Celula nova = new Celula(elemento); 
            this.ultima.setProxima(nova);       //a celula adicionada passa a ser a ultima da lista     
            this.ultima = nova; 
            
                      
      
           this.totalDeElementos++;
}
    }

//Adiciona no começo
    public void adicionaNoComeco(Object elemento) {

        if (this.totalDeElementos == 0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova; //a referencia da primeira celula apaonta para a celula adicionada
            this.ultima = nova; //a referencia da ultima celula apaonta para a celula adicionada
        } 
        else {
            Celula nova = new Celula(this.primeira, elemento);
            this.primeira = nova;

        }
        this.totalDeElementos++;

    }
    
  public void insert (Object elemento){ //EM ORDEM ALFABETICA
            anterior = null;
            Celula atual = primeira;
            Celula nova = new Celula(elemento); 
            
            while (atual != null && atual.getElemento().getNome().charAt(0) > nova.getElemento().getNome().charAt(0)){
                anterior = atual;
                atual = atual.getProxima();
                 }
            if (anterior == null)
                primeira.setElemento(elemento);
            else
                anterior.setProxima(nova);
            nova.setProxima(atual);
  }  
    
    
    

    public Celula pegaCelula(String key) {
        Celula atual = primeira; //a busca começa da primeira celula da lista
        System.out.println(primeira);

        while (!atual.getElemento().getNome().equals(key)) { // caso a Key da celula atual n seja a mesma do

            if (atual.getProxima() == null) { //Se o proximo elemento for nulo, é sinal que a lista terminou e o elemento n foi encontrado
                System.out.println("Busca terminou e nao achou ninguem");
                return null;
            } else {
                 atual = atual.getProxima(); //vai passando de celula em celula
            }
        }
        //retorna a celula encontrada
        return atual;

    }

   

    public String toString() {//PERCORRENDO A LISTA E CONCATENANDO AS STRINGS
    // Verificando se a Lista está vazia
    if(this.totalDeElementos == 0){
    return "[]";
    }
    StringBuilder builder = new StringBuilder("[");
    Celula atual = primeira;
    // Percorrendo até o penúltimo elemento.
    for (int i = 0; i < this.totalDeElementos - 1; i++) {
    builder.append(atual.getElemento().getNome());
    builder.append("]");
    builder.append("\n");
    atual = atual.getProxima();
    }
    // último elemento
    builder.append("[");
    builder.append(atual.getElemento().getNome());
    
    builder.append("]");
    return builder.toString();
    }
    
   
//remove em qualquer posição
    public void remove(String key) {
        Celula atual = primeira; //a busca para remover começa da primeira celula
        Celula anterior = null;
        if (primeira.getElemento().getNome().equals(key)) { //caso o elemento buscado seja logo o primeiro da lista
            primeira = primeira.getProxima();
            totalDeElementos--;
        } else {

            while (atual != null && !atual.getElemento().getNome().equals(key)) { //percorre a lista
                anterior = atual;
                atual = atual.getProxima();
            }
            if (atual != null) { //caso tenha encontrado o elemento
                anterior.setProxima(atual.getProxima());
                totalDeElementos--;

            }
            if (atual == ultima) { //caso o elemento buscado seja o ultimo
                ultima = anterior;
            }


        }
    }

    public int tamanho() { //caso seja preciso retornar o tamanho da lista
        System.out.println(totalDeElementos);
        return this.totalDeElementos;
    }

        public String[] preencheTabela(int a) {//PERCORRENDO A LISTA E CONCATENANDO AS STRINGS
    // Verificando se a Lista está vazia
        
    Celula atual = primeira;
    // Percorrendo até o penúltimo elemento.
    if(a!=0){
    for(int i=0; i<a; i++){
    atual = atual.getProxima();
    }
    }
    if(a< this.totalDeElementos -1){
    String[] philosopher ={atual.getElemento().getNome()};
    return philosopher;
    }
       
    // último elemento
    String[] philosopher ={atual.getElemento().getNome()};
       
    return philosopher;
    }
        
        
    public int retornaTotalDeElementos(){
    int numberOfElements = this.totalDeElementos;
    return numberOfElements;
    }
    
    
    
    public Celula getPrimeira() {
        return primeira;
    }
    
    
    
}
