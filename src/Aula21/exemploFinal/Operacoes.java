package Aula21.exemploFinal;

public class Operacoes {
    //precisa ter um valor até o final do contrutor e precisa ser alterado
    public final double pi;
    //constante PI é estatica e publica além de final, e precisa ser inicializada no momento da declaração
    public static final double PI = 3.14;

    //A variável final precisa ser inicializada até o final do construtor
    public Operacoes(){
        pi = 3.14;
    }
}
