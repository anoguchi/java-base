package Arrays.practices.practice02;

/*
 * Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N produtos. Armazene os N produtos
 * em um vetor. Em seguida, mostrar o preço médio dos produtos.
 */

import Arrays.practices.practice02.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); // linha pendente do nexInt anterior
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("Average price = %.2f%n", avg);

        sc.close();
    }
}
