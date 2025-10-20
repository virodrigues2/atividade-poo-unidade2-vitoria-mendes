public class Funcionario implements Trabalhavel {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando!");
    }

    public void descansar() {
        System.out.println(nome + " está descansando!");
    }
}
