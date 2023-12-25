package ProgramacaoFuncionalAndExpressoesLambda.stream.practices.practice01;

/*
 * Fazer um programa para ler um conjunto de produtos a partir de um arquivo em formato .csv (suponha que exista pelo
 * menos um produto). Em seguida mostrar o preço médio dos produtos. Depois, mostrar os nomes, em ordem decrescente,
 * dos produtos que possuem preço inferior ao preço médio.
 */

import ProgramacaoFuncionalAndExpressoesLambda.stream.practices.practice01.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            double avg = list.stream().map(Product::getPrice)
                    .reduce(0.0, Double::sum) / list.size();
            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream().filter(product -> product.getPrice() < avg)
                    .map(Product::getName).sorted(comparator.reversed()).toList();

            names.forEach(System.out::println);


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}