import java.util.Scanner;

public class main extends CRUD {
    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    main gerenciador = new main();

    int r = 0;

    while(r != 5) {
        System.out.println("======GERENCIADOR DE TAREFA=======");
        System.out.println("1- Criar tarefa");
        System.out.println("2- Listar tarefas");
        System.out.println("3- Marcar tarefa como concluida");
        System.out.println("4- Remover tarefa");
        System.out.println("5- Sair");
        System.out.println("Escolha uma opção:");
        r = scanner.nextInt();
        scanner.nextLine();

       switch(r) {

            case 1:
                System.out.println("Título:");
                String t = scanner.nextLine();

                System.out.println("Descrição:");
                String d = scanner.nextLine();
                
                System.out.println("Status");
                Boolean s = scanner.nextBoolean();
                scanner.nextLine();


                Tarefa tarefa = new Tarefa(t,d,s)
                gerenciador.adicionarTarefa(tarefa);
                break;
        
    

            case 2:
                gerenciador.listarTarefas();
                break;

    
            case 3:
   
                System.out.println("Qual tarefa voce deseja marcar como concluida?");
                String c = scanner.nextLine();
                gerenciador.concluirTarefa(c);
                break;

    

            case 4:
                System.out.println("Qual tarefa voce deseja remover?");
                String remover = scanner.nextLine();
                gerenciador.removerTarefa(remover);
                break;
        
    

            case 5:
                System.out.println("Saindo");
                break;

            default:
                System.out.println(" Digite um numero válido");
                break;
    }

            
    

    
}
}
}
}