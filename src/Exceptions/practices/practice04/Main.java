package Exceptions.practices.practice04;

/*
 * Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária,
 * mostrando o novo saldo. Um saque não pode ocorrer: se não houver saldo na conta ou se o valor do saque for
 * superior ao limite de saque da conta.
 */

import Exceptions.practices.practice04.model.entities.Account;
import Exceptions.practices.practice04.model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Número: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Titular: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double accountInitialBalance = scanner.nextDouble();
        System.out.print("Limite de saque: ");
        double accountWithdrawLimit = scanner.nextDouble();

        Account account = new Account(accountNumber, accountHolder, accountInitialBalance, accountWithdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n" , account.getBalance());
        } catch (BusinessException businessException) {
            System.out.println(businessException.getMessage());
        }

        scanner.close();

    }

}
