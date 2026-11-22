public class Balanca {
    float taxaDeConversao;
    
    public void adicionarTaxaDeConversao(String unidadeOrigem, String unidadeDestino, float indiceDeConversao){
        taxaDeConversao = indiceDeConversao;
    }

    public Peso converter(Peso peso, String unidade){
        return new Peso(peso.quantidade * taxaDeConversao, unidade);
    }
}
