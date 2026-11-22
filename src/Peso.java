public abstract class Peso {
    protected int quantidade;

    @Override
    public boolean equals(Object obj) {
        return this.quantidade == ((Peso) obj).quantidade;
    }
}
