public class Usuario {
    private String nome;
    private int idUsuario;

    public Usuario(String nome, int idUsuario) {
        this.nome = nome;
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", ID: " + idUsuario;
    }
}
