package LendoElementosViaConsoleEManipulandoArquivos;

import java.util.Scanner;

public class PedidoScanner {
    public static void main(String[] args) {

        System.out.println("Por favor, inserir o código do produto.");

        Scanner scanner = new Scanner(System.in);
        String codigo = scanner.nextLine();
        System.out.println("Por favor, inserir a quantidade de itens desse produto.");
        Integer quantidade = scanner.nextInt();
        System.out.println("Por favor, inserir o valor desse produto");
        Integer valor = scanner.nextInt();
        int total = valor * quantidade;

        System.out.println("O valor total da sua compra é " + total);

    }
}
