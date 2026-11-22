public abstract class Peso {
    protected int quantidade;

    public abstract String getUnidade();

    @Override
    public boolean equals(Object obj) {
        return this.quantidade == ((Peso) obj).quantidade;
    }
}
