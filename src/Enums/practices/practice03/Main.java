package Enums.practices.practice03;

/*
 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um sumário do pedido. O instante
 * do pedido deve ser o instante do sistema: new Date()
 */

import Enums.main.entities.enums.OrderStatus;
import Enums.practices.practice03.entities.Client;
import Enums.practices.practice03.entities.OrdemItem;
import Enums.practices.practice03.entities.Order;
import Enums.practices.practice03.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        // String para data
        Date birthday = simpleDateFormat.parse(scanner.next());

        Client client01 = new Client(name, email, birthday);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next());

        Order order = new Order(new Date(), status, client01);

        System.out.print("How many items to this order? ");
        int numberOrders = scanner.nextInt();
        for (int i = 0; i < numberOrders; i++) {
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.print("Product name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            Product product01 = new Product(productName, productPrice);
            OrdemItem ordemItem01 = new OrdemItem(quantity, productPrice, product01);
            order.addItem(ordemItem01);

        }

        System.out.println();
        System.out.println(order);

        scanner.close();

    }
}
