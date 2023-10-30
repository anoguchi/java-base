package LendoElementosViaConsoleEManipulandoArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ValidadorNotaFiscal {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:/Beto/Dev/Java/Start/java-spring/nota-fiscal-123456.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
