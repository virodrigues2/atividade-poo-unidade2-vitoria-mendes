public class MainLoja {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500);
        Produto p2 = new Produto("Mouse", 100);

        p1.exibir();
        p2.exibir();

        p1.setPreco(3700);
        System.out.println("Preço atualizado do " + p1.getNome() + ": R$" + p1.getPreco());
    }
}
