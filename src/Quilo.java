public class Quilo {
    public int quantidade;

    public Quilo(int quantidade) {
        this.quantidade = quantidade;
    }

    public Quilo multiplicar(int indice) {
        return new Quilo(quantidade*indice);
    }
}