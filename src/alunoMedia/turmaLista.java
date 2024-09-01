package alunoMedia;

import java.util.Random;
import java.util.Scanner;

public class turmaLista {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno[] lista = new Aluno[20];
        lista[0] = new Aluno();
        int contAluno = 0;
        int codigoP;
        String op;
        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("c - Cadastro");
            System.out.println("l - lista alunos");
            System.out.println("p - pesquisar");
            System.out.println("s - sair");
            op = ler.next();

            if(op.equals("c")){
                System.out.println("Qual o nome do aluno: ");
                lista[contAluno].nome = ler.next();

                System.out.println("Qual o sobrenome do aluno: ");
                lista[contAluno].sobrenome = ler.next();

                System.out.println("Qual o email do aluno: ");
                lista[contAluno].email = ler.next();

                lista[contAluno].codigo = new Random().nextInt(1000, 10000);
                System.out.println("Qual a nota do "+lista[contAluno].nome+":");
                lista[contAluno].notaUm = ler.nextInt();

                System.out.println("Qual a segunda nota do "+lista[contAluno].nome+":");
                lista[contAluno].notaDois = ler.nextInt();

                System.out.println(lista[contAluno].nome+" cadastro, obteve o código "+lista[contAluno].codigo);
                System.out.println("Tem média "+lista[contAluno].media()+" e está: "+lista[contAluno].aprovacao());
                lista[contAluno++] = new Aluno();
            } else if (op.equals("l")) {
                for (int i=0; i<contAluno; i++){
                    System.out.println("Aluno: "+lista[i].nome);
                    System.out.println("codigo: "+lista[i].codigo);
                    System.out.println("Media: "+lista[i].media());
                    System.out.println("Status: "+lista[i].aprovacao());
                }
                lista[contAluno++] = new Aluno();
            }else if (op.equals("p")){
            System.out.println("Informe o código do aluno: ");
            codigoP = ler.nextInt();
            for (int i=0; i<contAluno; i++){
            if (codigoP==lista[i].codigo){
                System.out.println("Aluno: "+lista[i].nome);
                System.out.println("Media: "+lista[i].media());
                System.out.println("Status: "+lista[i].aprovacao());
            }else{
                System.out.println("Código inválido!");
                i--;
            }
            }
                lista[contAluno++] = new Aluno();
            }
        }while (!op.equals("s"));
    }
}
