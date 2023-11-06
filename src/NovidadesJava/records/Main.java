package NovidadesJava.records;

public class Main {
    public static void main(String[] args) {

        DepoisDoRecord depoisDoRecord = new DepoisDoRecord("Beto", "Rua Himalaia", "1111111");
        System.out.println(depoisDoRecord.nome());
        System.out.println(depoisDoRecord.telefone().equals("12345"));
        System.out.println(depoisDoRecord.endereco());

    }
}
