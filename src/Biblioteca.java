import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.setLivros(new ArrayList<>());
        this.usuarios = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
        
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
        
    }

    public void cadastrarLivro(Livro livro) {
        getLivros().add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void registrarEmprestimo(Livro livro) {
        if (!livro.isEmprestado()) {
            livro.setEmprestado(true);
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livro.isEmprestado()) {
            livro.setEmprestado(false);
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro não está emprestado.");
        }
    }

    public void listarUsuarios() {
        System.out.println("Usuários cadastrados:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    public void listarLivros() {
        System.out.println("Livros na Biblioteca:");
        for (Livro livro : getLivros()) {
            System.out.println(livro);
        }
    }

    public void cadastrarNovoLivro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        Livro livro = new Livro(titulo);
        cadastrarLivro(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void cadastrarNovoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();
        System.out.println("Digite o ID do usuário:");
        int idUsuario = scanner.nextInt();
        Usuario usuario = new Usuario(nome, idUsuario);
        cadastrarUsuario(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void verificarEmprestimo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título do livro para verificar:");
        String titulo = scanner.nextLine();
        for (Livro livro : getLivros()) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(livro);
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}
