

public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean status;

    public Tarefa (String titulo, String descricao, boolean status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

     public String getDescricao() {
        return this.descricao ;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao ;
    }

    public boolean getStatus() {
        return this.status ;

    }

    public void setStatus( boolean status) {
        this.status = status ;
    }

    public void show(){
        System.out.println(getTitulo() + getDescricao() + getStatus());
    }
}