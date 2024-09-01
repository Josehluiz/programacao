package Aula22.ExemploPolimorfismo.exOverride;

public class Aluno extends Pessoa {
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String obterDados(){
        String retorno = "Nome: "+getNome()+" "+getSobrenome();
        retorno += "\nIdade: "+getIdade();
        retorno += "\nMatricula: "+ getMatricula();
        return retorno;
    }

    @Override
    public String toString(){
        String retorno = "Nome: "+getNome()+" "+getSobrenome();
        retorno += "\nIdade: "+getIdade();
        retorno += "\nMatricula: "+ getMatricula();
        return retorno;
    }
}
