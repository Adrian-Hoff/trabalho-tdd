public class Peso {
    protected String unidade;
    protected int quantidade;

    public Peso(int quantidade, String unidade) {
        this.unidade = unidade;
        this.quantidade = quantidade;
    }

    public Peso somar(Peso outroPeso){
        return new Peso(quantidade + outroPeso.getQuantidade(), unidade);
    }

    public Peso multiplicar(int indice) {
        return new Peso(quantidade*indice, unidade);
    }

    public String getUnidade(){
        return unidade;
    };

    public int getQuantidade(){
        return quantidade;
    };

    @Override
    public boolean equals(Object obj) {
        return this.quantidade == ((Peso) obj).quantidade && this.unidade == ((Peso) obj).unidade;
    }
}
