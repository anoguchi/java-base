package GenericsSetAndMap.curingasDelimitadorOrBoundedWildcards.main;

/*
 * Fazer um método para retornar a soma das áreas de uma lista de figuras.
 * Nota 1: soluções impróprias:
 * - public double totalArea(List<Shape> list)
 * - public double totalArea(List<?> list)
 * Nota 2: não conseguiremos adicionar elementos na lista do método.
 */

import GenericsSetAndMap.curingasDelimitadorOrBoundedWildcards.main.entities.Circle;
import GenericsSetAndMap.curingasDelimitadorOrBoundedWildcards.main.entities.Rectangle;
import GenericsSetAndMap.curingasDelimitadorOrBoundedWildcards.main.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));

    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }

}
