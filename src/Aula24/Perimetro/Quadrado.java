package Aula24.Perimetro;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calculaArea() {
        return Math.pow(lado, 2);
    }

    public double calculaPerimetro() {
        return 4 * lado;
    }

    public void imprime() {
        System.out.println("Nome da figura: Quadrado");
        System.out.println("Lado: " + lado);
        System.out.println("Area: " + calculaArea());
        System.out.println("Perimetro: " + calculaPerimetro());
    }


}
