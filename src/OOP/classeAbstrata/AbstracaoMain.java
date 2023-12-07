package OOP.classeAbstrata;

public class AbstracaoMain {
    public static void main(String[] args) {

        System.out.println("Seja bem vindo!");
        ContaCorrente ccBeto = new ContaCorrente();
        ccBeto.consultarSaldo();
        ccBeto.fazerPix();

        ContaPoupanca cpBeto = new ContaPoupanca();
        cpBeto.consultarSaldo();
        cpBeto.fazerPix();

    }
}
