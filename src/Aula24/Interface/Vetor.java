package Aula24.Interface;

import com.sun.source.doctree.VersionTree;

public class Vetor implements Lista {

    private String[] elementos;
    private int tamanho;

    public void adiciona() {
        tamanho = 0;
        elementos = new String[10];
    }

    @Override
    public void adiciona(String elemento){
        elementos[tamanho] = elemento;
    }

    @Override
    public void remove(){
        if(tamanho>0)
            tamanho--;
    }

    public int obterTamanho(){
        return tamanho;
    }
    @Override
    public String toString()
    {
        String retorno = "[";
        if (tamanho>0)
        {
            for(int i=0;i<tamanho-1;i++)
            {
                retorno+=elementos[i]+",";
            }
            retorno+=elementos[tamanho-1];
        }
        retorno+="]";
        return retorno;
    }
}

