package OOP.polimorfismo.main;

/*
 * Em programação orientada a objetos, polimorfismo (muitas/multiplas formas) é recurso que permite que variáveis de um mesmo tipo mais
 * genérico possam apontar para objetos de tipos específicos diferentes, tendo assim comportamentos diferentes
 * conforme cada tipo específico.
 *
 * Importate entender:
 * A associação do tipo específico com o tipo genérico é feita em tempo de execução (upcasting).
 * O compilador não sabe para qual tipo específico a chamada do método Withdraw está sendo feita (ele só sabe que são
 * duas variáveis tipo Account).
 *
 */


import OOP.polimorfismo.main.entities.Account;
import OOP.polimorfismo.main.entities.BusinessAccount;
import OOP.polimorfismo.main.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(1020, "Beto", 1000.0);
        Account account1 = new SavingsAccount(1021, "Julia", 1000.0, 0.01);

        account.withdraw(50.0);
        account1.withdraw(50.0);

        System.out.println(account.getBalance());
        System.out.println(account1.getBalance());

    }
}
