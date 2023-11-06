package NovidadesJava.methodReference;

/*
 * Nova forma de referenciar metodos de uma interface funcional (no caso, essa)
 * mais simples e compacta do que as lambdas expressions. Temos algumas formas de usar method reference.
 * Referenciar um metodo estatico (nesse exemplo).
 * Referenciar a instancia de um metodo, ex: Integer::sum
 * Referenciar um construtor (pouco usada).
 */
public interface Programar {
    void programar();
}
