public class MainBiblioteca {
    public static void main(String[] args) {
        Livro l1 = new Livro("Java para Iniciantes", "Vitória Mendes");
        l1.exibir();
        l1.emprestar();
        l1.exibir();
        l1.devolver();
        l1.exibir();
    }
}
