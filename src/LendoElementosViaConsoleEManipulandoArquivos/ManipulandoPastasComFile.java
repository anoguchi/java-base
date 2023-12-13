package LendoElementosViaConsoleEManipulandoArquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String stringPath = scanner.nextLine();

        File path = new File(stringPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        assert folders != null;
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        assert files != null;
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(stringPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);


        scanner.close();

    }
}
