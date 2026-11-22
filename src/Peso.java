public class Peso {
    protected String unidade;
    protected float quantidade;

    public Peso(float quantidade, String unidade) {
        this.unidade = unidade;
        this.quantidade = quantidade;
    }

    public Peso somar(Peso outroPeso, String unidadeDeOutroPeso){
        if(this.unidade == unidadeDeOutroPeso){
            return new Peso(quantidade + outroPeso.getQuantidade(), unidade);            
        }else{
            return new Peso(quantidade*1000 + outroPeso.getQuantidade(), unidadeDeOutroPeso);   
        }

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
