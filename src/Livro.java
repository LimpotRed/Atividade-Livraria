public class Livro {
    private String titulo;
    private boolean emprestado;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Emprestado: " + (emprestado ? "Sim" : "Não");
    }
}
