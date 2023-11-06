package Exceptions.Unchecked;

public class ArrayIndexOutOfBoundExample {
    public static void main(String[] args) {

        // Tenta fazer isso aqui
        try {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(array[100]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Não foi possível acessar essa posição do array");
        } finally {
            System.out.println("Passou aqui!");
        }
    }
}
