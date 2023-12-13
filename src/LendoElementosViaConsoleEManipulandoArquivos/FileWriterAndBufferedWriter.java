package LendoElementosViaConsoleEManipulandoArquivos;

/*
 * FileWriter (stream de escrita de caracteres em arquivos)
 * - cria/recria o arquivo: new FileWriter(path)
 * - Acrescenta ao arquivo existente: new FileWriter(path, true)
 *
 * BufferedWriter (mais rápido)
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {

    public static void main(String[] args) {

        String[] lines = new String[] {
                "Good morning",
                "Good afternoon",
                "Good nigth"
        };

        String path = "C:/Beto/Dev/Java/Start/java-spring/out.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
