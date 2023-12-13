package LendoElementosViaConsoleEManipulandoArquivos;

import java.io.File;
import java.util.Scanner;

public class InformacoesDoCaminhoDoArquivo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        String stringPath = scanner.nextLine();

        File path = new File(stringPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());



        scanner.close();
    }

}
