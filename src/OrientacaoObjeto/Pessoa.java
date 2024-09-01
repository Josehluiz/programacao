package OrientacaoObjeto;

public class Pessoa {
    String nome;
    String sobrenome;
    int altura;

    void andar(){
        System.out.println(nome+" andando...");
    }
    void correndo(){
        System.out.println(nome+" correndo...");
    }
    void parado(){
        System.out.println(nome+" parado...");
    }
    String obterDdos(){
        return "nome: "+nome+"sobrenome: "+sobrenome+"mede: "+altura+"cm";
    }
}
