package Exceptions.main;


/*
 * Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução.
 * Em Java, uma exceção é um objeto herdado da classe:
 * - java.lang.Exception - o compilador obriga a tratar ou propagar
 * - java.lan.RuntimeException - o compilador não obriga a tratar ou propagar
 *
 * Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja capturada
 * (tratada) ou o programa seja encerrado.
 *
 * Por que exceções?
 * O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando
 * boas práticas.
 * Vantagens:
 * - Delega a lógica do erro para a classe responsável por conhecer as regras que podem ocasionar o erro.
 * - Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes.
 * - A exceção pode carregar dados quaisquer.
 *
 * Bloco finally
 * É um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção.
 * Exemplo: fechar um arquivo, conexão de banco de dados, ou outro recurso específico ao final do processamento.
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method1();
        System.out.println("Fim do programa");

    }

    public static void method1() {
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }

    public static void method2() {
        System.out.println("***METHOD2 START***");

        Scanner scanner = new Scanner(System.in);

        try {
            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
            e.printStackTrace();
            scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("Erro de input");
        }

        scanner.close();
        System.out.println("***METHOD2 END***");
    }
}
