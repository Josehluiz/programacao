package Aula23.ExemploAbstrato;

public class Retangulo extends Figura{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void imprime() {
        System.out.println("Nome da figura: " + getNomeFigura());
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calculaArea());
        System.out.println("Perímetro: " + calculaPerimetro());
    }
}
