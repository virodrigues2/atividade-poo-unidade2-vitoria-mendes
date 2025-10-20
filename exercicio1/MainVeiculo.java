public class MainVeiculo {
    public static void main(String[] args) {
        Carro c = new Carro("Toyota", "Corolla", 4);
        Moto m = new Moto("Honda", "CG 160", 160);

        c.exibirInformacoes();
        m.exibirInformacoes();
    }
}
