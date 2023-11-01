package ApiDeCollectionsAndGenerics.Generic;

/*
 * Vieram para facilitar principalmente casos de casting entre tipos,
 * Reduzindo a complexidade e volume de código escrito.
 * Podemos usar um tipo genérico de dados.
 */
public class GenericExample<T> {



    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public GenericExample(T mensagem) {
        this.name = mensagem;
    }

    T name;

    public void escrever(){
        System.out.println(name);
    }

}
