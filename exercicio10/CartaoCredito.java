public class CartaoCredito extends Pagamento {
    public CartaoCredito(double valor) {
        super(valor);
    }

    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
    }
}
