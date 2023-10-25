package OOP.interfaces;

public class InterfacesMain {
    public static void main(String[] args) {
        System.out.println("Bem vindo!");
        ContaCorrente ccBeto = new ContaCorrente();
        ccBeto.consultarSaldo();
        ccBeto.fazerPix();

        ContaPoupanca cpBeto = new ContaPoupanca();
        cpBeto.consultarSaldo();
        cpBeto.fazerPix();
    }
}
