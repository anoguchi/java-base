package ApiDeCollectionsAndGenerics.queueJava;

public class Equipe {

    public Equipe(String nome, int saldoDePontos) {
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }

    public String nome;
    public int saldoDePontos;

    @Override
    public String toString() {
        return "Equipe " + nome + " está com pontuação " + saldoDePontos;
    }
}
