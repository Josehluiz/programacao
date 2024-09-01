package Aula22.ExemploPolimorfismo.exOverride;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String obterDados(){
        String retorno = "Nome: "+nome+" "+sobrenome;
        retorno += "\nIdade: "+idade;
        return retorno;
    }

    @Override
    public String toString(){
        String retorno = "Nome: "+nome+" "+sobrenome;
        retorno += "\nIdade: "+idade;
        return retorno;
    }
}
