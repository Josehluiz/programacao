public class Lampada {

        String marca;
        String modelo;
        String cor;
        String local;
        boolean estaLigada;

        void liga(){
            estaLigada = true;
        }

        void desligar(){
            estaLigada = false;
        }

        String estaLigada(){
            return estaLigada?"Ligada":"Desligada";
        }
        String obterDados(){
            return "modelo: "+modelo+"\nMarca: "+marca+"\nLocalização: "+local+"\n cor: "+cor+"\n"+estaLigada()+"\n";
        }
}
