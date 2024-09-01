package Aula23.ExemploAbstrato;

public class Teste {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5);
        c1.setNomeFigura("Circulo");
        c1.setRaio(5);
        c1.imprime();

        Quadrado q1 = new Quadrado(5);
        q1.setNomeFigura("Quadrado");
        q1.imprime();

        Retangulo r1 = new Retangulo(5, 10);
        r1.setNomeFigura("Retangulo");
        r1.imprime();
    }
}
