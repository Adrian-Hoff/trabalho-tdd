public class Peso {
    protected String unidade;
    protected float quantidade;

    public Peso(float quantidade, String unidade) {
        this.unidade = unidade;
        this.quantidade = quantidade;
    }

    public Soma somar(Peso outroPeso){
        return new Soma(new Peso(this.quantidade, this.unidade), outroPeso);
    }

    public Peso multiplicar(int indice) {
        return new Peso(quantidade*indice, unidade);
    }

    public String getUnidade(){
        return unidade;
    };

    public float getQuantidade(){
        return quantidade;
    };

    @Override
    public boolean equals(Object obj) {
        return this.quantidade == ((Peso) obj).quantidade && this.unidade == ((Peso) obj).unidade;
    }
}
