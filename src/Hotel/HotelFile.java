package Hotel;


import java.io.*;

public class HotelFile {

    Hotel hotelob = new Hotel();

    public static Object gravaObjeto(Hotel obj) throws IOException {

        
        //Gera o arquivo para armazenar o objeto
    String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação
    
    //==================================================
    //Cria a pasta chamada Hoteis
    File dir = new File(local+"\\Hoteis");  
    if (dir.mkdir()) {  
        System.out.println("Diretorio criado com sucesso!");  
    } else {  
        System.out.println("Diretório já existe!");  
    }  
    
    //===============================================
        File arquivoHotel = new File(local+"\\Hoteis\\"+obj.getNome());


        FileOutputStream fos = new FileOutputStream(arquivoHotel);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(obj);

        oos.flush();
        oos.close();
        fos.close();
        return arquivoHotel;
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
    
    
    
    
    public static Hotel[] LerTodos() throws IOException, ClassNotFoundException { //Lê todos os arquivos do diretorio CHECAR PQ ESTA DANDO ESSE ERRO
        String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação
        File dir = new File(local + "\\Hoteis");// Diretório onde será lido os arquivos  


        File[] files = dir.listFiles(); //Lista de arquivos no diretorio
        Hotel[] hoteis = new Hotel[files.length];
        for (int i = 0; i < files.length; i++) {
            hoteis[i] = (Hotel) lerObjeto(files[i]);
        }
        return hoteis;
    }
    
     public static int quantidadeArquivos(){//Quantidade de Arquivos numa pasta
     String local = System.getProperty("user.dir"); //Retorna o diretorio atual da aplicação
       File dir = new File(local+"\\Hoteis");// Diretório onde será lido os arquivos  
       
       int quantidade = dir.listFiles().length;
       return quantidade;
   }
        
    
    
    
}
