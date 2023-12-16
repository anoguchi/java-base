package OOP.interfaces.comparable.practice;

/*
 * Faça um programa  para ler um arquivo contendo funcionários (nome e salário) no formato .csv, armazenando-os em
 * uma lista. Depois, ordenar a lista por nome e mostrar o resultado na tela. Nota: o caminho do arquivo pode ser
 * informado "hardcode".
 */

import OOP.interfaces.comparable.practice.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "C:/Beto/Dev/Java/Start/java-spring/in.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String employeeCsv = bufferedReader.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = bufferedReader.readLine();
            }
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
