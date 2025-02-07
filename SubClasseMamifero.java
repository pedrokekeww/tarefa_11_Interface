class Mamifero extends Animal {
    public Mamifero(String nome) {
        super(nome);
    }

    public String amamentar() {
        return nome + " está amamentando!";
    }
}
