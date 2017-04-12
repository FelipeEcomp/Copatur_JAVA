package Reserva;


import java.io.*;

public class ReservaFile {

    Reserva reservaob = new Reserva();

    public static Object gravaObjeto(Reserva obj) throws IOException {

        
        //Gera o arquivo para armazenar o objeto
    String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação
    
    //==================================================
    //Cria a pasta chamada Clientes
    File dir = new File(local+"\\Reservas");  
    if (dir.mkdir()) {  
        System.out.println("Diretorio criado com sucesso!");  
    } else {  
        System.out.println("Erro ao criar diretorio!");  
    }  
    
    //===============================================
        File arquivoReserva = new File(local+"\\Reservas\\"+obj.getNome());


        FileOutputStream fos = new FileOutputStream(arquivoReserva);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(obj);

        oos.flush();
        oos.close();
        fos.close();
        return arquivoReserva;
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
    
    
    
    
    public static Reserva[] LerTodos() throws IOException, ClassNotFoundException { //Lê todos os arquivos do diretorio CHECAR PQ ESTA DANDO ESSE ERRO
        String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação
        File dir = new File(local + "\\Reservas");// Diretório onde será lido os arquivos  


        File[] files = dir.listFiles(); //Lista de arquivos no diretorio
        Reserva[] reservas = new Reserva[files.length];
        for (int i = 0; i < files.length; i++) {
            reservas[i] = (Reserva) lerObjeto(files[i]);
        }
        return reservas;
    }
    
     public static int quantidadeArquivos(){//Quantidade de Arquivos numa pasta
     String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação
       File dir = new File(local+"\\Reservas");// Diretório onde será lido os arquivos  
       
       int quantidade = dir.listFiles().length;
       return quantidade;
   }
        
    
    
    
}
