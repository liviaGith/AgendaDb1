import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu de Usuário:");
            System.out.println("1. Adicionar um novo contato");
            System.out.println("2. Remover um contato existente");
            System.out.println("3. Buscar um contato pelo nome");
            System.out.println("4. Atualizar informações de um contato");
            System.out.println("5. Listar todos os contatos na agenda");
            System.out.println("6. Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o número de telefone do contato: ");
                    String numeroTelefone = scanner.nextLine();
                    Contato novoContato = new Contato(nome, numeroTelefone);
                    agenda.adicionarContato(novoContato);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;
                case 3:
                    System.out.print("Digite o nome do contato a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    Contato contatoEncontrado = agenda.buscarContato(nomeBuscar);
                    if (contatoEncontrado != null) {
                        System.out.println("Contato encontrado:");
                        System.out.println("Nome: " + contatoEncontrado.getNome());
                        System.out.println("Telefone: " + contatoEncontrado.getNumeroTelefone());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do contato a ser atualizado: ");
                    String nomeAtualizar = scanner.nextLine();
                    Contato contatoExistente = agenda.buscarContato(nomeAtualizar);
                    if (contatoExistente != null) {
                        System.out.print("Digite o novo nome do contato: ");
                        String novoNome = scanner.nextLine();
                        System.out.print("Digite o novo número de telefone do contato: ");
                        String novoNumeroTelefone = scanner.nextLine();
                        Contato novoContatoAtualizado = new Contato(novoNome, novoNumeroTelefone);
                        agenda.atualizarContato(nomeAtualizar, novoContatoAtualizado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 5:
                    agenda.listarContatos();
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            System.out.println();
        } while (opcao != 6);

        scanner.close();
    }
}


