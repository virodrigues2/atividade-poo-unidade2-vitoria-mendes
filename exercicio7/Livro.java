public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro já está emprestado!");
        }
    }

    public void devolver() {
        emprestado = false;
        System.out.println("Livro devolvido!");
    }

    public void exibir() {
        System.out.println(titulo + " - " + autor + " | Emprestado: " + emprestado);
    }
}
