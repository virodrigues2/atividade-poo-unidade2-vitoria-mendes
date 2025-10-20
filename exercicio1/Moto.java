public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Moto -> Marca: " + marca + ", Modelo: " + modelo + ", Cilindradas: " + cilindradas);
    }
}
