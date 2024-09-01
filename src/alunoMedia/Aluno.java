package alunoMedia;

public class Aluno {
    String nome;
    String sobrenome;
    String email;
    int codigo;
    float notaUm;
    float notaDois;

    float media(){
        float media = notaUm+notaDois;
        media = media/2;
        return media;
    }
    String aprovacao(){
        if (media()>=8) {
            return "Aprovado";
        }else if(media()>=6){
            return "em Recuperacao";
        }else{
            return "Reprovado";
        }

    }
}
