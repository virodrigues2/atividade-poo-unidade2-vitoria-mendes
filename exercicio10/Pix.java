public class Pix extends Pagamento {
    public Pix(double valor) {
        super(valor);
    }

    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " realizado via Pix.");
    }
}
