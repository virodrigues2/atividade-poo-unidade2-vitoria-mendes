public class MainAnimal {
    public static void main(String[] args) {
        Animal a1 = new Mamifero();
        Animal a2 = new Ave();
        Animal a3 = new Peixe();

        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
    }
}
