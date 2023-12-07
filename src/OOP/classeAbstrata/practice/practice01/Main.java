package OOP.classeAbstrata.practice.practice01;

import OOP.classeAbstrata.practice.practice01.entities.Circle;
import OOP.classeAbstrata.practice.practice01.entities.Rectangle;
import OOP.classeAbstrata.practice.practice01.entities.Shape;
import OOP.classeAbstrata.practice.practice01.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number os shapes: ");
        int numberOfShapes = scanner.nextInt();

        for (int i = 1; i <= numberOfShapes; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char isRectangleOrCircle = scanner.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED)? ");
            Color color = Color.valueOf(scanner.next());

            if (isRectangleOrCircle == 'r' ) {
                System.out.print("Width: ");
                double width = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();
                list.add(new Rectangle(color, width, height));
            }
            else {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list) {
            System.out.printf("%.2f%n", shape.area());
        }


        scanner.close();

    }

}
