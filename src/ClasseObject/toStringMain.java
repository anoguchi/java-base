package ClasseObject;

public class toStringMain {
    public static void main(String[] args) {

        Funcionaria funcionaria = new Funcionaria();
        funcionaria.setCargo("Tech Lead");
        funcionaria.setIdade(35);
        funcionaria.setNome("Alberto");
        funcionaria.setSetor("Bancario");
        funcionaria.setSalario(10.000);

        System.out.println(funcionaria);

        System.out.println(funcionaria.getNome().equals("Beto"));
        System.out.println(funcionaria.getNome().equals("Alberto"));

        System.out.println(funcionaria.hashCode());
        System.out.println(funcionaria.getNome().hashCode());
        System.out.println(funcionaria.getCargo().hashCode());
        System.out.println(funcionaria.getSalario().hashCode());

        var setorHashCode = String.valueOf(funcionaria.getSetor().hashCode());
        var setorHashCodeNovo = String.valueOf("Bancario".hashCode());

        System.out.println(setorHashCode.equals(setorHashCodeNovo));

    }
}
