public class MainFuncionario {
    public static void main(String[] args) {
        Gerente g = new Gerente("Vitória", 5000, 1000);
        Estagiario e = new Estagiario("Mendes", 1500);

        g.exibirInformacoes();
        System.out.println("Bônus: R$" + g.calcularBonus());

        e.exibirInformacoes();
        System.out.println("Bônus: R$" + e.calcularBonus());
    }
}
