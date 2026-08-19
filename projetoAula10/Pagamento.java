package projetoAula10;

public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract void processar();
    public abstract double calcularTaxa();

    public double valorFinal() {
        return valor + calcularTaxa();
    }
    
}
