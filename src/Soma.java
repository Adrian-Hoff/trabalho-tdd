public class Soma {
    Peso peso1;
    Peso peso2;
    Soma ultimaSoma;
    
    public Soma(Peso peso1, Peso peso2){
        this.peso1 = peso1;
        this.peso2 = peso2;
        ultimaSoma = null;
    }

    public Soma(Soma soma, Peso peso){
        this.ultimaSoma = soma;
        this.peso1 = peso;
        this.peso2 = null;
    }

    public Soma somar(Peso peso){
        return new Soma(this, peso);
    }
}
