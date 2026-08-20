package AgendaAula12;

import javax.swing.JOptionPane;

public class Agenda2 {
    private static final String ARQUIVO_DADOS = "contatos.txt";
    private static final ContatoRepository repository = new ContatoRepository(ARQUIVO_DADOS);
    public static void main (String{} args) {
        boolean continuar = true ;

        while(continuar) {
            String opcao = JOptionPane.showInputDialog(null, "==== AGENDA ==== \n"
                + "1 - Cadastrar Contato \n"
                + "2 - Listar Contatos \n"
                + "6 - Sair \n \n"
                + "Escolha uma opção:",
            "Menu Principal",
            JOptionPane.PLAIN_MESSAGE);

            if (opcao == null) {
                break
            }
            switch (opcao.trim()) {
                case "1":
                    cadastrarContato();
                case "2":
                    break;
                case "6" :
                    continuar  = false;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! (Escolha um número (1,2,6)");
            }
        
            
        }
        JOptionPane.showMessageDialog(null, "Até logo!");
    }
}
