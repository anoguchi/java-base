package LendoElementosViaConsoleEManipulandoArquivos.Practice;


/*
 * Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos. Cada item possui
 * um nome, preço unitário e quantidade, separados por vírgula. Você deve gerar um novo arquivo chamado "summary.csv",
 * localizado em uma subpasta chamada "out" a partir da pasta original do arquivo de origem, contendo apenas o nome
 * e o valor total para aquele item (preço unitário multiplicado pela quantidade), conforme exemplo.
 */


import LendoElementosViaConsoleEManipulandoArquivos.Practice.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter file path: ");
        String sourceFileStr = scanner.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        System.out.println(sourceFolderStr);

        boolean success = new File(sourceFolderStr + "\\out-temp").mkdir();

        String targetFileStr = sourceFolderStr + "/out-temp/summary.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = bufferedReader.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = bufferedReader.readLine();
            }

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFileStr))) {

                for (Product item: list) {
                    bufferedWriter.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bufferedWriter.newLine();
                }

                System.out.println(targetFileStr + " CREATED");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }





        scanner.close();

    }
}
