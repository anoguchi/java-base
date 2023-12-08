package OOP.classeAbstrata.practice.practice02;

/*
 * Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais podem ser pessoa
 * física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto
 * arrecadado.
 * Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica são nome, renda
 * anual e número de funcionários. As regras para cálculo de imposto são as seguintes.
 *
 * Pessoa física: pessoas cuja renda for abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 em
 * diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto. Exemplo:
 * uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
 * fica: (50000 * 25%) - (2000 * 50%) = 11500.00
 *
 * Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, ela
 * paga 14% de imposto. Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
 * 400000 * 14% = 56000.00
 *
 */

import OOP.classeAbstrata.practice.practice02.entities.Company;
import OOP.classeAbstrata.practice.practice02.entities.Individual;
import OOP.classeAbstrata.practice.practice02.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.print("Enter the number of taxpayers: ");
        int getNumberOfTaxPayers = scanner.nextInt();

        for (int i = 1; i <= getNumberOfTaxPayers; i++) {
            System.out.println("Taxpayer #" + i + " data:");
            System.out.print("Individual or Company (i/c)? ");
            char getIndividualOrCompany = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String getName = scanner.nextLine();
            System.out.print("Annual income: ");
            double getAnnualIncome = scanner.nextDouble();

            if (getIndividualOrCompany == 'i') {
                System.out.print("Health expenditures: ");
                double getHeathExpenditures = scanner.nextDouble();

                Individual individual = new Individual(getName, getAnnualIncome, getHeathExpenditures);
                taxPayerList.add(individual);
            } else {
                System.out.print("Number of employees: ");
                Integer getNumberOfEmployees = scanner.nextInt();
                taxPayerList.add(new Company(getName, getAnnualIncome, getNumberOfEmployees));
            }

        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer taxPayer : taxPayerList) {
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
        }

        System.out.println();

        double sum = 0.0;
        for (TaxPayer taxPayer : taxPayerList) {
            sum += taxPayer.tax();
        }

        System.out.println("TOTAL TAXES: $ " +String.format("%.2f", sum));

        scanner.close();

    }
}
