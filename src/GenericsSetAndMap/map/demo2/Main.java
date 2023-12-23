package GenericsSetAndMap.map.demo2;

import GenericsSetAndMap.map.demo2.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Product, Double> stock = new HashMap<>();

        Product product = new Product("TV", 900.0);
        Product product1 = new Product("Notebook", 1900.0);
        Product product2 = new Product("Tablet", 300.0);

        stock.put(product, 10000.0);
        stock.put(product1, 20000.0);
        stock.put(product2, 1000.0);

        Product product3 = new Product("TV", 900.0);
        System.out.println("Contains 'product3' key: " + stock.containsKey(product3));
    }
}
