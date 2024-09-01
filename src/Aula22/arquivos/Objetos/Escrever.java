package Aula22.arquivos.Objetos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escrever {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\maste\\Downloads\\pessoa.db");
        try{
            ObjectOutputStream escrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            //criando o objeto para escrever no arquivo
            Pessoa p1 = new Pessoa();
            p1.setNome("Jonas");
            p1.setSobrenome("Silva");
            p1.setCpf("39021047889");
            //escrever o oobjeto no arquivo
            escrita.writeObject(p1);
            System.out.println("Pessoa "+p1.getNome()+" salva com sucesso");
            escrita.close();
        }
        catch (IOException e){
            System.out.println("Erro ao criar o arquivo");
        }

    }
}
