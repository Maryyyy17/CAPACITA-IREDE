public class TarefaPrioritaria extends Tarefa {
    private String prioridade;

    public TarefaPrioritaria (String titulo, String descricao, boolean status, String prioridade) {
        super(titulo, descricao,status);
        this.prioridade = prioridade;
    } 

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade ;
    }

    public String getPrioridade() {
        return this.prioridade ;
    }
    
    @Override
    public void show() {
        System.out.println(getTitulo() +  getDescricao() + getStatus() + getPrioridade()) ;
    }

}