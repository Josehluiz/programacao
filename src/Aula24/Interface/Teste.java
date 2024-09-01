package Aula24.Interface;

public class Teste {
    public static void main(String[] args) {
            Vetor v1 = new Vetor();
            v1.adiciona("A");
            v1.adiciona("B");
            v1.adiciona("C");
            System.out.println(v1);
            v1.remove();
            System.out.println(v1);
            System.out.println("o tamanho de v1 é"+v1.obterTamanho());
            Fila f1 = new Fila();
            f1.adiciona("A");
            f1.adiciona("B");
            f1.adiciona("C");
            f1.adiciona("D");
            System.out.println(f1);
            f1.remove();
            System.out.println(f1);
            //para cria uma instancia de uma interface eu precsio usar o construtor de uma classe q a implemente
            Lista l1 = new Vetor();
            l1.adiciona("teste");
            l1.remove();
    }
    //Para criar uma instância de uma interfaace, eu preciso usar o construtor de uma classe

}

