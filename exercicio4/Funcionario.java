public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.10;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Salário: R$" + salario);
    }
}
