public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.portas = portas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Carro -> Marca: " + marca + ", Modelo: " + modelo + ", Portas: " + portas);
    }
}
