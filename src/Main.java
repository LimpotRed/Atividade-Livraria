import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar novo livro");
            System.out.println("2. Cadastrar novo usuário");
            System.out.println("3. Registrar empréstimo de livro");
            System.out.println("4. Devolver livro");
            System.out.println("5. Verificar empréstimo de livro");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    biblioteca.cadastrarNovoLivro();
                    break;
                case 2:
                    biblioteca.cadastrarNovoUsuario();
                    break;
                case 3:
                    System.out.println("Digite o título do livro para emprestar:");
                    String tituloEmprestimo = scanner.nextLine();
                    Livro livroEmprestimo = null;
                    for (Livro livro : biblioteca.getLivros()) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloEmprestimo)) {
                            livroEmprestimo = livro;
                            break;
                        }
                    }
                    if (livroEmprestimo != null) {
                        biblioteca.registrarEmprestimo(livroEmprestimo);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o título do livro para devolver:");
                    String tituloDevolucao = scanner.nextLine();
                    Livro livroDevolucao = null;
                    for (Livro livro : biblioteca.getLivros()) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloDevolucao)) {
                            livroDevolucao = livro;
                            break;
                        }
                    }
                    if (livroDevolucao != null) {
                        biblioteca.devolverLivro(livroDevolucao);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 5:
                    biblioteca.verificarEmprestimo();
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
