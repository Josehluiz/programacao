package Aula22.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo2 {
    public static void main(String[] args) {
        String caminho = "C:\\Users\\maste\\Downloads\\teste.txt";
        try{
            BufferedReader arquivo = new BufferedReader(new FileReader(caminho));
            String texto ="";
            String linha = "";
            while (linha != null){
                linha = arquivo.readLine();
                if (linha!=null){
                    texto+=linha+"\n";
                }
            }
            System.out.println(texto);
        }
        catch (IOException e){
            System.out.println("Erro ao ler o arquivo");
        }
    }
}
