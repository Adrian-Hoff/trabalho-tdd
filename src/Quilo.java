public class Quilo {
    private final int quantidade;

    public Quilo(int quantidade) {
        this.quantidade = quantidade;
    }

    public Quilo multiplicar(int indice) {
        return new Quilo(quantidade*indice);
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.quantidade == ((Quilo) obj).quantidade;
    }
}