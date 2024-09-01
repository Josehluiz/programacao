package Aula24.Perimetro;

public class Circulo {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void imprime() {
        System.out.println("Nome da figura: Circulo");
        System.out.println("Raio: " + raio);
        System.out.println("Area: " + calculaArea()+"cm²");
        System.out.println("Perimetro: " + calculaPerimetro()+"cm");
    }
}
