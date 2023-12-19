package OOP.interfaces.defaultMethods;

/*
 * Default methods (defender methods)
 * A partir do Java 8, interfaces podem conter métodos concretos.
 * A intenção básica é prover implementação padrão para métodos, de moda a evitar:
 * - repetição de implementação em toda classe que implemente a interface.
 * - a necessidade de se criar classes abstratas para prover reuso da implementação.
 *
 * Outras vantagens:
 * - Manter a retrocompatibilidade com sistemas existentes.
 * - Permitir que "interfaces funcionais" (que devem conter apenas um método) possam prover outras operações
 * padrão reutilizáveis.
 *
 * Interfaces podem prover reuso. Agora temos uma forma de herança múltipla, mas o compilador reclama se houver mais
 * de um método com a mesma assinatura, obrigando a sobrescreve-lo.
 * Interfaces ainda são bem diferentes de classes abstratas. Interfaces não possuem recursos tais como construtores
 * e atributos.
 *
 * Fazer um programa para ler uma quantia e a duração em meses de um empréstimo. Informar o valor a ser pago depois
 * de decorrido o prazo do empréstimo, conforme regras de juros do Brasil. A regra de cálculo de juros do Brasil
 * é juro composto padrão de 2% ao mês.
 */

import OOP.interfaces.defaultMethods.services.InterestService;
import OOP.interfaces.defaultMethods.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Months: ");
        int months = scanner.nextInt();

        InterestService interestService = new UsaInterestService(2.0);
        double payment = interestService.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        scanner.close();

    }
}
