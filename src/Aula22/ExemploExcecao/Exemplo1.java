package Aula22.ExemploExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        try {
            System.out.println("Digite um valor: ");
            int v1 = ler.nextInt();
            System.out.println("Digte outro valor: ");
            int v2 = ler.nextInt();
            int resultado = v1 / v2;
            System.out.println(resultado);
        }
        catch (InputMismatchException erro){
            System.out.println("n1 e n2 precisam ser números!");
        }
        catch (ArithmeticException erro){
            System.out.println("Não é possível dividir por zero");
        }
        catch (Exception e){
            System.out.println("Algo deu errado!");
        }
        finally {
            System.out.println("Sempre será excecutado...");
        }
    }
}
