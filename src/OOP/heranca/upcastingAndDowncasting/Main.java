package OOP.heranca.upcastingAndDowncasting;

/*
 * Casting da subclasse para superclass. Uso comum em polimorfismo.
 */

import OOP.heranca.upcastingAndDowncasting.entities.Account;
import OOP.heranca.upcastingAndDowncasting.entities.BusinessAccount;
import OOP.heranca.upcastingAndDowncasting.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(1001, "Beto", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Julia", 0.0, 500.00);

        // Upcasting
        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003, "Alberto", 0.0, 200.00);
        Account account3 = new SavingsAccount(1004, "Diego", 0.0, 0.01);

        // Downcasting
        BusinessAccount account4 = (BusinessAccount) account2;
        account4.loan(100.0);

        if (account3 instanceof BusinessAccount) {
            BusinessAccount account5 = (BusinessAccount) account3;
            account5.loan(200.0);
            System.out.println("Loan!");
        }

        if (account3 instanceof SavingsAccount) {
            SavingsAccount account5 = (SavingsAccount) account3;
            account5.updateBalance();
            System.out.println("Update!");
        }

        Account account5 = new BusinessAccount(1005, "Juliana", 1000.00, 500.00);
        account5.withdraw(200.00);
        System.out.println(account5.getBalance());


    }
}
