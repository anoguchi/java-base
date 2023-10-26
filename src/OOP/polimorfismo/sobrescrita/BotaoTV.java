package OOP.polimorfismo.sobrescrita;

public class BotaoTV extends BotaoFogao {
    @Override
    public void ligar() {
        System.out.println("Ligando a TV!");
    }

    @Override
    public void desligando() {
        System.out.println("Chega de TV por hoje!");
    }
}
