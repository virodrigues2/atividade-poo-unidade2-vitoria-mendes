public class MainPagamento {
    public static void main(String[] args) {
        Pagamento p1 = new CartaoCredito(150);
        Pagamento p2 = new Pix(90);

        p1.processarPagamento();
        p2.processarPagamento();
    }
}
