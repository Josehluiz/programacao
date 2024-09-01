public class Main {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.marca = "lg";
        l1.modelo = "led";
        l1.cor = "vermelho";
        l1.local = "sala";

        System.out.print(l1.obterDados());
        l1.liga();
        System.out.println(l1.obterDados());
    }
}