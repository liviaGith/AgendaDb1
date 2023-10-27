import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {

    private List<Contato>contatos;


        public AgendaTelefonica() {
            contatos = new ArrayList<>();
        }

        public void adicionarContato(Contato contato) {
            contatos.add(contato);
            System.out.println("Contato adicionado com sucesso.");
        }

        public void removerContato(String nome) {
            for (Contato contato : contatos) {
                if (contato.getNome().equals(nome)) {
                    contatos.remove(contato);
                    System.out.println("Contato removido com sucesso.");
                    return;
                }
            }
            System.out.println("Contato não encontrado.");
        }

        public Contato buscarContato(String nome) {
            for (Contato contato : contatos) {
                if (contato.getNome().equals(nome)) {
                    return contato;
                }
            }
            return null;
        }

        public void atualizarContato(String nome, Contato novoContato) {
            for (int i = 0; i < contatos.size(); i++) {
                Contato contato = contatos.get(i);
                if (contato.getNome().equals(nome)) {
                    contatos.set(i, novoContato);
                    System.out.println("Contato atualizado com sucesso.");
                    return;
                }
            }
            System.out.println("Contato não encontrado.");
        }

        public void listarContatos() {
            if (contatos.size() > 0) {
                System.out.println("Lista de Contatos:");
                for (Contato contato : contatos) {
                    System.out.println("Nome: " + contato.getNome());
                    System.out.println("Telefone: " + contato.getNumeroTelefone());
                    System.out.println("---------------------------");
                }
            } else {
                System.out.println("Nenhum contato na agenda.");
            }
        }
    }


