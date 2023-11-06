package NovidadesJava.records;

/*
 * Oficialmente no Java 16
 * Um record é uma classe que armazena dados, ela é imutavel.
 * Já possui por padrao so metodos equals, hashcode e toString.
 * Diminui escrita de codigo boiler plate e do lombok.
 */

public record DepoisDoRecord(String nome, String endereco, String telefone) {
}
