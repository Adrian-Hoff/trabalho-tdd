public class Balanca {
    float taxaDeConversao;
    
    public void adicionarTaxaDeConversao(String unidadeOrigem, String unidadeDestino, float indiceDeConversao){
        taxaDeConversao = indiceDeConversao;
    }

    public Peso converter(Peso peso, String unidade){
        return new Peso(peso.quantidade * taxaDeConversao, unidade);
    }

    public Peso converter(Soma soma, String unidade){
        Peso peso1 = soma.peso1;
        Peso peso2 = soma.peso2;

        if (!soma.peso1.unidade.equals(unidade)) 
            peso1 = new Peso(soma.peso1.quantidade * taxaDeConversao, unidade);

        if (!soma.peso2.unidade.equals(unidade)) 
            peso2 = new Peso(soma.peso2.quantidade * taxaDeConversao, unidade);

        return new Peso(peso1.quantidade + peso2.quantidade, unidade);
    }
}
