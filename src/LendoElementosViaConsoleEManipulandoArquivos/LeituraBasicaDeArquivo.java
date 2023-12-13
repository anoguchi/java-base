package LendoElementosViaConsoleEManipulandoArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeituraBasicaDeArquivo {

    public static void main(String[] args) {

        File file = new File("C:/Beto/Dev/Java/Start/java-spring/nota-fiscal-123456.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
