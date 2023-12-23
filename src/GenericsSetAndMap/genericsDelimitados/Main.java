package GenericsSetAndMap.genericsDelimitados;

/*
 * Uma empresa de consultoria deseja avaliar a performance de produtos, funcionários, dentre outras coisas.
 * Um dos cálclulos que ela precisa é encontrar o mair dentre um conjunto de elementos. Fazer um programa que leia
 * um conjunto de produtos a partir de um arquivo e depois mostre o mais caro deles.
 */

import GenericsSetAndMap.genericsDelimitados.entities.Product;
import GenericsSetAndMap.genericsDelimitados.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        String path = "C:\\Beto\\Dev\\Java\\Start\\java-spring\\in02.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Most expensive: ");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
