package OOP.abrastracao;

class ContaCorrente extends Conta {
    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é 1234.");
    }

    @Override
    public void fazerPix() {
        System.out.println("Digite o valor que você deseja transferir.");
    }
}
