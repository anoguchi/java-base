package OOP.practices.practice02;

/*
 * Fazer um programa para ler os dados de um produto em estoque (nome, preço, e quantidade no estoque). Em seguida:
 * - Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque).
 * - Realizar uma entrada no estoque e mostrar novamente os dados do produto.
 * - Realizar uma saída no estoque e mostrar novamente os dados do produto.
 *
 */


import OOP.practices.practice02.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
    }
}
