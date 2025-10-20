public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 0.10;
        super.sacar(valor + taxa);
    }
}
