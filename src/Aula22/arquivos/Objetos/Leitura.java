package Aula22.arquivos.Objetos;

import java.io.*;

public class Leitura {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\maste\\Downloads\\pessoa.db");
        try{
            ObjectInputStream leitura =
                new ObjectInputStream (new FileInputStream(arquivo.getAbsoluteFile()));
            Pessoa p = (Pessoa) leitura.readObject();


        }catch (FileNotFoundException e){
            System.out.println("Arquivo não existe");
        }catch (IOException e){
            System.out.println("Erro ao ler o arquivo");
        } catch (ClassNotFoundException e) {
            System.out.println("Objeto não identificado");
        }
    }
}
