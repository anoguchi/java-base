package GenericsSetAndMap.generics;

/*
 * Generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo. Seus benefícios são:
 * - Reuso
 * - Type safety
 * - Performance
 *
 * Uso comum: coleções
 *
 * Deseja-se fazer um programa que leia uma quantidade N, e depois N números inteiros. Ao final, imprima esses números
 * de forma organizada conforme exemplo: Em seguida, informar qual foi o primeiro valor informado.
 */

import GenericsSetAndMap.generics.services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();

        System.out.print("How many values? ");
        int getScannerIntValue = scanner.nextInt();

        for (int i = 0; i < getScannerIntValue; i++) {
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        System.out.println("First: " + printService.first());

        scanner.close();

    }
}
