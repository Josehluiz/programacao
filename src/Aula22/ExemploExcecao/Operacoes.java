package Aula22.ExemploExcecao;

public class Operacoes {
    public int divide (int n1,int n2) throws ArithmeticException{
        if(n2==0){
            throw new ArithmeticException("Não é possível divdir por zero");
        }
        return n1/n2;
    }
}
