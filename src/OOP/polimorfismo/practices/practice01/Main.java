package OOP.polimorfismo.practices.practice01;


/*
 * Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas
 * trabalhadas e valor por hora. Funcionários terceirizados possuem ainda uma despesa adicional.
 *
 * O pagamento dos funcionários corresponde ao valod da hora multiplicado pelas horas trabalhadas, sendo que os
 * funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
 *
 * Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois
 * de ler todos os dados, mostrar nome e pagamento de casa funcionário na mesma ordem em que foram digitados.
 */

import OOP.polimorfismo.practices.practice01.entities.Employee;
import OOP.polimorfismo.practices.practice01.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> listOfEmployees = new ArrayList<>();

        System.out.print("Enter the number os employees: ");
        int numberOfEmployees = scanner.nextInt();

        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char isOutsourced = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            if (isOutsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                listOfEmployees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                listOfEmployees.add(employee);
            }

        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee employee : listOfEmployees) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }



        scanner.close();
    }
}
