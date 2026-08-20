package AgendaAula12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class ContatoRepository {
    private final String caminhoArquivo;

    public ContatoRepository(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
        garantirArquivoExiste();

        private void garantirArquivoExiste() {
            File arquivo = new File (caminhoArquivo);

            if (!arquivo.exists()) {
                try{
                    arquivo.createNewFile();
                }catch(IOException e){
                    throw new RuntimeException("Não foi possivel criar o arquivo de dados:" + caminhoArquivo, e)
                }
            }
        }

        public Contato cadastrar (Contato contato) {
            List<Contato> contatos = new ArrayList<> () ;
            contatos.add(contato);

            salvarTodos(contatos);
            return contato;
        }

        public void salvarTodos (List<Contato> contatos) {
            try{
                BufferedWriter bw = new BufferedWriter(new. FileWriter(caminhoArquivo, false)){
                   for (Contato c : contatos) {
                    bw.write(c.toString());
                   }
                        } catch(IOException e) {
                            throw new RuntimeException("Erro ao salvar o arquivo de dados", e);
                        }
                
                }
            }
        }
    }
}
