package tratamentodeErros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Scanner;
public class PlaygroundErros {
    public static void main(String[] args) {
        System.out.println("==== Bem- vindo ao show de horrores do java==== \n ");

        Scanner ler = new Scanner(System.in);
        exemploIOException();
        exemploNullPointerException();

        exemploArithmeticException(ler);

        ler.close();
        System.out.println("===Sobrevivemos===== \n");
    }

    private static void exemploArithmeticException(Scanner ler) {
        try{
            System.out.println("Informe o primeiro numero:");
            int n1 = ler.nextInt()
            System.out.println("Informe o segundo numero:");
            int n2 = ler.nextInt()
            int resultado = n1/n2;
            System.out.println(("Resultado:" + resultado));

        } catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Um numero nao pode ser dividido por 0!");
        } catch(ImputMismatchException e) {
            System.out.println("Dados Invalidos!");
        } catch (Exception e) {
            System.out.println("Erro Inesperado");
        }

        private static void exemploIndexOfBoundException(Scanner ler) {
            String[] nomes = {" João", "Maria", "Jose"};
            System.out.println("Informe a posição do nome que voce deseja ver:");
            int indice = ler.nextInt();

            try{
                String nome = nomes(indice);
                System.out.println(("Nome selecionado:" + nomes));
        } catch(IndexOutOfBoundsException e) {
            System.out.println(("A posição " + indice + " não existe"));
        }

            }

        private static void exemploException() {
            try(BufferedReader leitor = new BufferedReader(new FileReader("dados.txt"))){
                String linha = leitor.readLine();
                System.out.println("Linha do arquivo:" + linha);
            }catch(IOException e) {
                System.out.println("Não foi possivel ler o arquivo \n" + e.getMessage());
            }
        }

        private static void exemploNullPointerException() {
            String texto = null;
            System.out.println(("Tamanho do texto:" + texto.length()));
        }
            
      
    }
    
}
