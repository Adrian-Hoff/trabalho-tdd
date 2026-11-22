public class Grama extends Peso{
    public Grama(int quantidade) {
        this.quantidade = quantidade;
    }

    public Grama multiplicar(int indice) {
        return new Grama(quantidade*indice);
    }
}