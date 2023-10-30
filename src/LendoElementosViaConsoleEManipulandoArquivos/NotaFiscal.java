package LendoElementosViaConsoleEManipulandoArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class NotaFiscal {
    public static void main(String[] args) throws IOException {

        System.out.println("Por favor, inserir o código do produto.");

        Scanner scanner = new Scanner(System.in);
        String codigo = scanner.nextLine();
        System.out.println("Por favor, inserir a quantidade de itens desse produto.");
        Integer quantidade = scanner.nextInt();
        System.out.println("Por favor, inserir o valor desse produto");
        Integer valor = scanner.nextInt();
        int total = valor * quantidade;

        System.out.println("O valor total da sua compra é " + total);

        System.out.println("aguarde um momento....estamos emitindo sua nota fiscal");

        Path fileName = Path.of("C:/Beto/Dev/Java/Start/java-spring/nota-fiscal-"+codigo+".txt");
        String text = "Código do produto: " + codigo + "\nqtd: " + quantidade + "\nvalor do produto: " + valor + "\n" +
                "total da compra: " + total + " ";
        Files.writeString(fileName, text);
        String fileContent = Files.readString(fileName);
        System.out.println(fileContent);
    }
}
