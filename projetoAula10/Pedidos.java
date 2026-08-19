package projetoAula10;

import java.util.List;

public class Pedidos {
    private Clientes clientes;
    private List<ItemPedido> itens;
    private double total ;

    public Pedidos(Cliente clientes) {
        this.clientes = clientes;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produtos produtos, int quantidade) {
        ItemPedido item = new ItemPedido(null, quantidade);
        itens.add(item);
    }

    public void exibirProdutos(){
        for(ItemPedido item : itens) {
            System.out.println(item.getProdutos().getNome() + item.getProdutos().getPreco() + item.calcularSubtotal());
        }
    }

    public double calcularTotal() {
        if(itens.isEmpty()) {
            return 0;
        }
        double total = 0;
        for(ItemPedido item : itens) {
            total = total + item.calcularSubtotal();
        }
        return total;
    }

    public Cliente getCliente() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public double getTotal() {
        return total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
}
