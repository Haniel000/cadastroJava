import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int options = 0;
        String excluirNome;
        long numeroExcluir;

        ArrayList<String> nomeCadastro = new ArrayList<>();
        ArrayList<Long> numeroTelefonico = new ArrayList<>();
        ArrayList<String> nomesExcluidos = new ArrayList<>();
        ArrayList<Long> numerosExcluidos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (options != 4) {
            System.out.println("1. CADASTRO");
            System.out.println("2. LISTAR");
            System.out.println("3. EXCLUIR");
            System.out.println("4. SAIR");
            System.out.println("Selecione uma opção: ");
            options = sc.nextInt();

            switch (options) {
                case 1:
                    System.out.println("Sessão de cadastro, insira seu nome e telefone:");
                    nomeCadastro.add(sc.next());
                    numeroTelefonico.add(sc.nextLong());
                    break;

                case 2:
                    System.out.println("Lista dos dados registrados:");
                    for (int i = 0; i < nomeCadastro.size(); i++) {
                        System.out.println("Nome: " + nomeCadastro.get(i) + " | Telefone: " + numeroTelefonico.get(i));
                    }
                    break;

                case 3:
                    System.out.println("Insira o nome e telefone para ser removido:");
                    excluirNome = sc.next();
                    numeroExcluir = sc.nextLong();

                    int index = -1;
                    for (int i = 0; i < nomeCadastro.size(); i++) {
                        if (nomeCadastro.get(i).equals(excluirNome) && numeroTelefonico.get(i).equals(numeroExcluir)) {
                            index = i;
                            break;
                        }
                    }

                    if (index != -1) {
                        nomesExcluidos.add(nomeCadastro.remove(index));
                        numerosExcluidos.add(numeroTelefonico.remove(index));
                        System.out.println("Registro removido com sucesso.");
                    } else {
                        System.out.println("Registro não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando programa.");
                    System.out.println("Dados excluídos:");
                    for (int i = 0; i < nomesExcluidos.size(); i++) {
                        System.out.println("Nome: " + nomesExcluidos.get(i) + " | Telefone: " + numerosExcluidos.get(i));
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
