package OrientacaoObjeto;

public class executavel
{
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Kelly";
        pessoa1.sobrenome = "ke";
        pessoa1.altura = 155;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Marcos";
        pessoa2.correndo();
        pessoa1.andar();
        pessoa1.parado();

    }
}


