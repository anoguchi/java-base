package OOP.heranca;

public class Pessoa {
    public static void main(String[] args) {
        PessoaDevBackEnd pessoaDevBackEnd = new PessoaDevBackEnd("Beto", "java", 2.000);
        pessoaDevBackEnd.codar();

        PessoaDevFrontEnd pessoaDevFrontEnd = new PessoaDevFrontEnd("Julia", "JS", 3.000);
        pessoaDevFrontEnd.codar();
    }
}
