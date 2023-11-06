package Exceptions.Checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExample {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream = null;

        try{
            fileInputStream = new FileInputStream("invalid.txt");
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não localizado no caminho informado, ocorreu o seguinte erro {[]} " + e);
        }


    }
}
