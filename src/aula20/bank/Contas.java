package aula20.bank;

import java.io.Serializable;
import java.util.Random;

public class Contas implements Serializable {
   private static int contadorId = 0;
   private String titular;
   private String id;
   protected float saldo;
   private String senha;

   public Contas(String titular, String senha) {
      this.titular = titular;
      this.senha = senha;
      this.id = gerarId();
      this.saldo = 0;
   }

   public void depositar(float valor) {
      if (valor > 0) {
         saldo += valor;
         System.out.println("Depósito de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
      } else {
         System.out.println("Valor de depósito inválido.");
      }
   }

   private String gerarId() {
      Random aleat = new Random();
      String Identificador = "";
      for (int i = 0; i < 4; i++) {
         Identificador += (char) aleat.nextInt(65, 90);
         Identificador += aleat.nextInt(1000, 2000);

      }
      return Identificador;
   }

   public String getId() {
      return id;
   }

   public boolean validaAcesso(String id, String senha) {
      return this.senha.equals(senha) && this.id.equals(id);
   }

   public String getTitular() {
      return titular;
   }

   public float getSaldo() {
      return saldo;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }
}