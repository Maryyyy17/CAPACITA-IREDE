package projetoAula10;

public class pagamentoPix extends Pagamento {

    public pagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public void processar(){
        System.out.println("Gerando chave Pix...");
    }

    @Override
    public double calcularTaxa() {
        return valor - (valor * 0.10) ;
    }
    
}
