package Enums.main;

/*
 * É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas.
 * Vantagem: melhor semântica, código mais legível e auxiliado pelo compilador.
 */

import Enums.main.entities.Order;
import Enums.main.entities.enums.OrderStatus;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
        OrderStatus orderStatus01 = OrderStatus.DELIVERED;
        OrderStatus orderStatus02 = OrderStatus.valueOf("DELIVERED");

        System.out.println(order);
        System.out.println(orderStatus01);
        System.out.println(orderStatus02);

    }
}
