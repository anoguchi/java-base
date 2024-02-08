package Playground.writeFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Foo.txt");

            writer.write("Hello foo!");

            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
