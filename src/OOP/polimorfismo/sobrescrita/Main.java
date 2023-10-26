package OOP.polimorfismo.sobrescrita;

public class Main {
    public static void main(String[] args) {

        BotaoFogao botaoFogao = new BotaoFogao();
        botaoFogao.ligar();
        botaoFogao.desligando();

        BotaoTV botaoTV = new BotaoTV();
        botaoTV.ligar();
        botaoTV.desligando();

    }
}
