package Static;

public class StaticPedidos {
    private String id;
    public static int pedidosFeitos;
    protected static final String status = "Pedido Concluido";

    public StaticPedidos(String id){
        this.id = id;
        pedidosFeitos++;
    }

    static void completarPedido(){
        pedidosFeitos++;
        System.out.println("Pedido atualizado com o status " + status + " já tivemos " + pedidosFeitos + " essa semana.");
    }

}
