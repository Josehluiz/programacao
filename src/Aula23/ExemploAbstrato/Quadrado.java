package Aula23.ExemploAbstrato;

public class Quadrado extends Figura{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
        setNomeFigura("Quadrado");
    }

    @Override
    public double calculaArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calculaPerimetro() {
        return 4 * lado;
    }

    @Override
    public void imprime() {
        System.out.println("Nome da figura: " + getNomeFigura());
        System.out.println("Lado: " + lado);
        System.out.println("Area: " + calculaArea());
        System.out.println("Perimetro: " + calculaPerimetro());
    }
}
