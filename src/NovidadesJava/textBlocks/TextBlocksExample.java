package NovidadesJava.textBlocks;

/*
 * Veio no Java 15.
 * Forma de declararmos String com varias linhas com mais eficiencia e de modo mais clean.
 */

public class TextBlocksExample {

    public static void main(String[] args) {

        // Antes do Java 15
        String sqlAntesDoJava15 =
                "SELECT id, nome, sobrenome\n"
                        + "FROM estudante\n"
                        + "WHERE linguagem = \"Java\"\n"
                        + "ORDER BY nome";

        System.out.println(sqlAntesDoJava15);

        String sqlJava15 = """
                SELECT id, nome, sobrenome
                FROM estudante
                WHERE linguagem = "Javascript"
                ORDER by nome
                """;

        System.out.println(sqlJava15);

    }
}
