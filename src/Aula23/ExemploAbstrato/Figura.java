package Aula23.ExemploAbstrato;

public abstract class Figura {
    private String nomeFigura;

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }


    public abstract double calculaArea();

    public abstract double calculaPerimetro();

    public abstract void imprime();


}
