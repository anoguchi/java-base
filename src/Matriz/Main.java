package Matriz;

/*
 * Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros. Em seguida,
 * mostrar a diagonal principal e a quantidade de valores negativos da matriz.
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];

        for (int ilinha = 0; ilinha < mat.length; ilinha++) {
            for (int icoluna = 0; icoluna < mat[ilinha].length; icoluna++) {
                mat[ilinha][icoluna] = scanner.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i] + " ");
        }

        int count = 0;
        for (int ilinha = 0; ilinha < mat.length; ilinha++) {
            for (int icoluna = 0; icoluna < mat[ilinha].length; icoluna++) {
                if (mat[ilinha][icoluna] < 0) {
                    count ++;
                }
            }
        }

        System.out.println("Negative number: " + count);



        scanner.close();

    }
}
