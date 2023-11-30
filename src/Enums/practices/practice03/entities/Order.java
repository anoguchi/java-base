package Enums.practices.practice03.entities;

import Enums.main.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrdemItem> items = new ArrayList<>();

    public Order() {

    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrdemItem item) {
        items.add(item);
    }

    public void removeItem(OrdemItem item) {
        items.remove(item);
    }

    public double  total() {
        double sum = 0.0;
        for(OrdemItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Order moment: ");
        stringBuilder.append(simpleDateFormat.format(moment) + "\n");
        stringBuilder.append("Order status: ");
        stringBuilder.append(status + "\n");
        stringBuilder.append("Client: ");
        stringBuilder.append(client + "\n");
        stringBuilder.append("Order items:\n");
        for (OrdemItem ordemItem : items) {
            stringBuilder.append(ordemItem + "\n");
        }
        stringBuilder.append("Total price: $");
        stringBuilder.append(String.format("%.2f", total()));
        return stringBuilder.toString();
    }
}
