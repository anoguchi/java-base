package Playground.readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("MyText.txt");
            FileReader fileReader = new FileReader(myFile);

            BufferedReader reader = new BufferedReader(fileReader);

            /*
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            */
            Files.lines(Path.of("MyText.txt"))
                    .forEach(line -> System.out.println(line));
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
