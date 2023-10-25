package OOP.encapsulamento.cachorro;

public class Cachorro {

    // private só acessa dentro da classe
    private Double peso;
    private Integer idade;

    // o projeto inteiro tem o acesso
    public double pesoPublic;
    public Integer idadePublic;

    // só dentro do meu pacote
    protected Double pesoProtected;
    protected Integer idadeProtected;

    public String latir(){
        return "auaua";
    }

    protected String dormir(){
        return "zzzzz";
    }

    private String comer(){
        return "hora da ração";
    }


}
