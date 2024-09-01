package alunoMedia;

import java.util.Random;
import java.util.Scanner;

public class Turma {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno a1 = new Aluno();

        System.out.println("Qual o nome do aluno: ");
        a1.nome = ler.next();

        System.out.println("Qual o sobrenome do aluno: ");
        a1.sobrenome = ler.next();

        System.out.println("Qual o email do aluno: ");
        a1.email = ler.next();

        a1.codigo = new Random().nextInt(1000, 10000);
        System.out.println("Qual a nota do "+a1.nome+":");
        a1.notaUm = ler.nextInt();

        System.out.println("Qual a segunda nota do "+a1.nome+":");
        a1.notaDois = ler.nextInt();

        System.out.println(a1.nome+" cadastro, obteve o código "+a1.codigo);

        System.out.println("Tem média "+a1.media()+" e está: "+a1.aprovacao());
    }
}
