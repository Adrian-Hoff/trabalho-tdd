public class Quilo extends Peso {    
    public Quilo(int quantidade) {
        this.quantidade = quantidade;
    }

    public Quilo multiplicar(int indice) {
        return new Quilo(quantidade*indice);
    }

    @Override
    public String getUnidade() {
        return "kg";
    }
}