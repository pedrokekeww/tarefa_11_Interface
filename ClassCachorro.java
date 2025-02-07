class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
    private String tamanho;
    private String raca;

    public Cachorro(String nome, String tamanho, String raca) {
        super(nome);
        this.tamanho = tamanho;
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return nome + " está latindo!";
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está sendo alimentado.");
    }

    @Override
    public void levarVeterinario() {
        System.out.println(nome + " está indo ao veterinário.");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Chamando o veterinário para " + nome);
    }

    @Override
    public void brincar() {
        System.out.println(nome + " está brincando.");
    }

    @Override
    public void levarPassear() {
        System.out.println(nome + " está passeando.");
    }
}
