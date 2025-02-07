public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Mia", "Persa");
        System.out.println(gato.emitirSom());
        gato.alimentar();
        gato.levarVeterinario();
        gato.chamarVeterinario();
        gato.brincar();
        gato.levarPassear();

        Cachorro cachorro = new Cachorro("Rex", "Médio", "Labrador");
        System.out.println(cachorro.emitirSom());
        cachorro.alimentar();
        cachorro.levarVeterinario();
        cachorro.chamarVeterinario();
        cachorro.brincar();
        cachorro.levarPassear();
    }
}
