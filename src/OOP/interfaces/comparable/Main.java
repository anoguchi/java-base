package OOP.interfaces.comparable;

/*
 * Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por linha), armazenando-os em uma lista.
 * Depois, ordenar os dados dessa lista e mostra-los ordenadamente. Nota: o caminho do arquivo pode ser
 * informado "hardcode".
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String path = "C:/Beto/Dev/Java/Start/java-spring/in.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String name = bufferedReader.readLine();
            while (name != null) {
                list.add(name);
                name = bufferedReader.readLine();
            }
            Collections.sort(list);
            for (String s : list) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
