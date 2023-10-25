package OOP.abrastracao;

class ContaPoupanca extends Conta {

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo da sua conta é zero.");
    }

    @Override
    public void fazerPix() {
        System.out.println("Deu ruim.");
    }
}
