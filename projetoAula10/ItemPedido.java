package projetoAula10;

public class ItemPedido {
    private Produtos produto;
    private int quantidade ;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public Produtos getProdutos() {
        return this.produto;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
}
