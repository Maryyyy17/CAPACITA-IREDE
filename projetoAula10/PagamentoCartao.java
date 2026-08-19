package projetoAula10;

public class PagamentoCartao extends Pagamento{
    private int parcelas;

    public PagamentoCartao(double valor, int parcelas) {
        super(valor);
        this.parcelas = parcelas;
    }

    @Override
    public void processar() {
        System.out.println("Processando o cartão em " + parcelas + " vezes");

    public double calcularTaxa() {
        return parcelas > 1 ? valor * 0.02 : 0;

    }

    
}
