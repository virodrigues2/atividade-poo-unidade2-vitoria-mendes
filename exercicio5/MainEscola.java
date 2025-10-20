public class MainEscola {
    public static void main(String[] args) {
        Aluno a = new Aluno("Vitória", 22, "ADS");
        Professor p = new Professor("Marcos", 45, "Programação");

        a.apresentar();
        p.apresentar();
    }
}
