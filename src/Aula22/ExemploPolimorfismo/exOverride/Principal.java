package Aula22.ExemploPolimorfismo.exOverride;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Jonas");
        p1.setSobrenome("Silva");
        p1.setIdade("12");
        System.out.println(p1);
        Aluno a1 = new Aluno();
        a1.setNome("Ana");
        a1.setSobrenome("Souza");
        a1.setIdade("45");
        a1.setMatricula(1234);
        System.out.println(a1);

    }
}
