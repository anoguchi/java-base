package OOP;

public class EstudanteMain {
    public static void main(String[] args) {

        Estudante beto = new Estudante();
        beto.setNome("Alberto");
        beto.setStack("Java");

        beto.estudar();
        beto.dormir();

        System.out.println(beto.getNome());
        System.out.println(beto.getStack());
    }
}
