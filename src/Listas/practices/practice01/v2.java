package Listas.practices.practice01;

/*
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários.
 * Não deve haver repetição de id.
 *
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa
 * deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final,
 * mostrar a listagem atualizada dos funcionários, conforme exemplos.
 *
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente.
 * Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
 */

import Listas.practices.practice01.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class v2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = scanner.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already exist! Try again: ");
                id = scanner.nextInt();
            }


            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();

            Employee employee = new Employee(id, name, salary);

            list.add(employee);

        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idEmployee = scanner.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = scanner.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println("List of employees: ");
        for (Employee e : list) {
            System.out.println(e);
        }

        scanner.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}

