public class Grama {
    private final int quantidade;

    public Grama(int quantidade) {
        this.quantidade = quantidade;
    }

    public Grama multiplicar(int indice) {
        return new Grama(quantidade*indice);
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.quantidade == ((Grama) obj).quantidade;
    }
}