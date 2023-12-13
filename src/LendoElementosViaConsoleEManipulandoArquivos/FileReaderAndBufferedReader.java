package LendoElementosViaConsoleEManipulandoArquivos;


/*
 * FileReader (stream de leitura de caracteres a partir de arquivos)
 * BufferedReader (mais rápido)
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAndBufferedReader {

    public static void main(String[] args) {

        String path = "C:/Beto/Dev/Java/Start/java-spring/nota-fiscal-123456.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
