public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    public void renderJuros() {
        saldo += saldo * 0.05;
    }
}
