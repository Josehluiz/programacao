package Aula24.Interface;

public class Fila implements Lista {

    private String[] elementos;
    private int tamanho;

    public Fila(){
        tamanho = 0;
        elementos = new String[10];
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

    @Override
    public void adiciona(String elemento) {

    }

    @Override
    public void remove() {

    }
}
