package Cliente;

import java.io.*;

public class ClienteFile {

    Cliente clienteob = new Cliente();

    public static Object gravaObjeto(Cliente obj) throws IOException {

        
        //Gera o arquivo para armazenar o objeto
    String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação
    
    //==================================================
    //Cria a pasta chamada Clientes
    File dir = new File(local+"\\Clientes");  
    if (dir.mkdir()) {  
        System.out.println("Diretorio criado com sucesso!");  
    } else {  
        System.out.println("Diretório já existe!");  
    }  
    
    //===============================================
        File arquivoCliente = new File(local+"\\Clientes\\"+obj.getNome());


        FileOutputStream fos = new FileOutputStream(arquivoCliente);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(obj);

        oos.flush();
        oos.close();
        fos.close();
        return arquivoCliente;
    }

    public static Object lerObjeto(File arquivoselecionado) throws IOException,
            ClassNotFoundException {

        FileInputStream fis = new FileInputStream(arquivoselecionado);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = ois.readObject();
        System.out.println("Objeto lido do arquivo " + obj);

        String[] aa = arquivoselecionado.list();//Imprime o nome dos arquivos do diretorio
        System.out.println("Nome dos Arquivos da pasta: " + aa);

        fis.close();
        ois.close();


        return obj;
    }
    
    
    
    
   public static Cliente[] LerTodos() throws IOException, ClassNotFoundException { //Lê todos os arquivos do diretorio CHECAR PQ ESTA DANDO ESSE ERRO
        String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação
        File dir = new File(local + "\\Clientes");// Diretório onde será lido os arquivos  


        File[] files = dir.listFiles(); //Lista de arquivos no diretorio
        Cliente[] clientes = new Cliente[files.length];
        for (int i = 0; i < files.length; i++) {
            clientes[i] = (Cliente) lerObjeto(files[i]);
        }
        return clientes;
    }
    
     public static int quantidadeArquivos(){//Quantidade de Arquivos numa pasta
     String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação
       File dir = new File(local+"\\Clientes");// Diretório onde será lido os arquivos  
       
       int quantidade = dir.listFiles().length;
       return quantidade;
   }
        
    
    
    
}
