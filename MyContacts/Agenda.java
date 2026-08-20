package MyContacts;

import javax.swing.JOptionPane;

import AgendaAula12.ContatoDuplicadoException;

public class Agenda {
    static int contador = 0;
    static Contato[] contatos = new Contato[3];

    public static void main (String[] args) {
        for(int i = 0; i < contatos.length ; i++) {
            contatos[i] = criarContato();
        }
    }
    public static Contato criarContato() {
        try {
            Contato c = new Contato();
            c.setNome(capturaTexto("Informe o nome"));
            c.setNome(capturaTexto("Informe o telefone"));
            validarContato(c.getTelefone());
            contador = contador + 1;
            c.setIdentificador(contador);
            return c;
        } catch(ContatoDuplicadoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), ".: Sistema Agenda :.", JOptionPane.ERROR_MESSAGE);

        }
        return null;
    }


    public static void validarContato(String telefone) throws ContatoDuplicadoException{
        for (Contato contato : contatos) {
            if(contato != null && contato.getTelefone().equals(telefone)) {
                throw new ContatoDuplicadoException(contato);
            }
        }
    }

    private static void cadastrarContato() {
        try{
            catch (RuntimeException e)
            Contato c = new Contato();
            c.setNome(CapturaTexto("Informe o nome:"));
            c.setTelefone(CapturaTexto("Informe o telefone"));
            repository.cadastrar(c);
            JOptionPane.showMessageDialog(null, );
        }
    }

    public static String capturaTexto (String texto) {
        return JOptionPane.showInputDialog(null, texto, ".: Sistema Agenda :.", JOptionPane.QUESTION_MESSAGE);
    }

    public static void exibirDados(Contato[] contatos) {
        String mensagem = "";
        for  (Contato contato : contatos) {
            mensagem = mensagem + contato + "\n" ;
        }
        JOptionPane.showMessageDialog(null, "Contato Cadastrado com sucesso!\n" + c, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    } catch (RuntimeException e){
        JOptionPane.showMessageDialog(null, e,getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
}
