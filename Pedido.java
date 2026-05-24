
public class Pedido {

    int numped;
    String cliente;
    String item;
    double valor;
    String status = "PENDENTE";

    // Construtor
    public Pedido(int numped, String cliente, String item, double valor) {

        this.numped = numped;
        this.cliente = cliente;
        this.item = item;
        this.valor = valor;
    }
    
    public void exibirPedido() {

        System.out.println("\n-------------------------");
        System.out.println("Número: " + numped);
        System.out.println("Cliente: " + cliente);
        System.out.println("Item: " + item);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
    }
}