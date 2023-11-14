package OOP.practices.practice01;

/*
 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). Em seguida,
 * mostrar o valor das áreas dos dois triângulos e dizer qual dos dois possui a maior área.
 * A fórmula para calcular a área de um triângulo a partir das medidas de seus lados, a, b e c é a seguinte
 * fórmula de Heron:
 * area = raiz quadrada p(p-a)(p-b)(p-c) onde p = a + b + c / 2
 */

import OOP.practices.practice01.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class WithOOP {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measure of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

    }
}
