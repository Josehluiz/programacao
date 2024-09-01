package Aula23.ExemploAbstrato;

public class Circulo  extends  Figura{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
        setNomeFigura("Circulo");
    }

    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void imprime() {
        System.out.println("Nome da figura: " + getNomeFigura());
        System.out.println("Raio: " + raio);
        System.out.println("Area: " + calculaArea());
        System.out.println("Perimetro: " + calculaPerimetro());
    }
}
