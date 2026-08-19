import java.util.ArrayList;

public class CRUD {
    ArrayList<Tarefa> Listas = new ArrayList<> () ;

    public void adicionarTarefa(Tarefa tarefa) {
        if (tarefa.getTitulo() == null) {
            return;
        }
        if (tarefa.getDescricao() == null) {
            return;
        }
        Lista.add(tarefa);
    }

    public void listarTarefas() {
        for (int t = 0 ; t < Listas.size(); t++) {
             Listas.get(t).show();
        }
    }

    public void concluirTarefa(String tarefa) {
        if(Listas.getTitulo() != tarefa) {
            return;
        }
        tarefa.setStatus(true);
        
    }

    public void removerTarefa(Tarefa tarefa) {
        Lista.remove(tarefa);
    }
}