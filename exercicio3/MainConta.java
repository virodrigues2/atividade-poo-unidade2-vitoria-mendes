public class MainConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Vitória", 1000);
        ContaPoupanca cp = new ContaPoupanca("Mendes", 2000);

        cc.sacar(200);
        cp.renderJuros();

        cc.exibirSaldo();
        cp.exibirSaldo();
    }
}
