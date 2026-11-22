import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LogisticaTest {
    // QUILO
    @Test
    void given5kg_WhenMultiplicadoPor2_ThenRetorna10kg() {
        Peso cinco = new Peso(5, "kg");
        assertEquals(new Peso(10, "kg"), cinco.multiplicar(2));
    }

    @Test
    void given5kg_WhenEqualsComOutros5kg_ThenRetornaVerdadeiro() {
        assertTrue(new Peso(5, "kg").equals(new Peso(5, "kg")));
    }

    @Test
    void given5kg_WhenEqualsCom6kg_ThenRetornaFalso() {
        assertFalse(new Peso(5, "kg").equals(new Peso(6, "kg")));
    }

    @Test
    void given1kg_WhenSoma1kg_ThenRetorna2kg() {
        Peso umQuilo = new Peso(1,"kg");
        Peso outroQuilo = new Peso(1,"kg");
        Soma total = umQuilo.somar(outroQuilo);

        Balanca balanca = new Balanca();
        balanca.adicionarTaxaDeConversao("kg", "kg", 1);

        Peso convertido = balanca.converter(total, "kg");

        assertEquals(new Peso(2,"kg"), convertido);
    }




    // GRAMA
    @Test
    void given5g_WhenMultiplicadoPor2_ThenRetorna10g(){
        Peso cinco = new Peso(5, "g");
        assertEquals(new Peso(10, "g"), cinco.multiplicar(2));
    }

    @Test
    void given5g_WhenEqualsComOutros5g_ThenRetornaVerdadeiro() {
        assertTrue(new Peso(5, "g").equals(new Peso(5, "g")));
    }

    @Test
    void given5g_WhenEqualsCom6g_ThenRetornaFalso() {
        assertFalse(new Peso(5, "g").equals(new Peso(6, "g")));
    }

    @Test
    void given1g_WhenSoma1g_ThenRetorna2g() {
        Peso umGrama = new Peso(1,"g");
        Peso outroGrama = new Peso(1,"g");
        Soma total = umGrama.somar(outroGrama);

        Balanca balanca = new Balanca();
        balanca.adicionarTaxaDeConversao("g", "g", 1);

        Peso convertido = balanca.converter(total, "g");

        assertEquals(new Peso(2,"g"), convertido);
    }




    // QUILO E GRAMA
    @Test
    void givenAnyKgOuG_WhenEqualsComUnidadeCorreta_ThenRetornaVerdadeiro(){
        assertEquals("kg", new Peso(0, "kg").getUnidade());
        assertEquals("g", new Peso(0, "g").getUnidade());
    }

    @Test
    void given5kg_WhenEqualsCom5g_ThenRetornaFalso(){
        assertFalse(new Peso(5,"kg").equals(new Peso(5, "g")));
    }

    @Test
        void given1kg_WhenSoma500g_ThenRetorna1500g() {
        Peso umQuilo = new Peso(1,"kg");
        Peso quinhentosGramas = new Peso(500,"g");
        Balanca balanca = new Balanca();
        balanca.adicionarTaxaDeConversao("kg", "g", 1000);

        Soma total = umQuilo.somar(quinhentosGramas);
        Peso convertido = balanca.converter(total, "g");

        assertEquals(new Peso(1500,"g"), convertido);
    }

    @Test
        void given1kg_WhenSoma500g_ThenRetorna1kgEMeio() {
        Peso umQuilo = new Peso(1,"kg");
        Peso quinhentosGramas = new Peso(500,"g");
        Balanca balanca = new Balanca();
        balanca.adicionarTaxaDeConversao("g", "kg", 0.001f);

        Soma total = umQuilo.somar(quinhentosGramas);
        Peso convertido = balanca.converter(total, "kg");

        assertEquals(new Peso(1.5f,"kg"), convertido);
    }




    // BALANÇA 
    @Test
        void given1kg_WhenConverteParaGramas_ThenRetorna1000g () {
        Peso umQuilo = new Peso(1, "kg");
        Balanca balanca = new Balanca();
        balanca.adicionarTaxaDeConversao("kg", "g", 1000);
        Peso convertido = balanca.converter(umQuilo, "g");
        assertEquals(new Peso(1000, "g"), convertido);
    }

    @Test
        void given12kg_WhenConverteParaGramas_ThenRetorna12000g () {
        Peso umQuilo = new Peso(12, "kg");
        Balanca balanca = new Balanca();
        balanca.adicionarTaxaDeConversao("kg", "g", 1000);
        Peso convertido = balanca.converter(umQuilo, "g");
        assertEquals(new Peso(12000, "g"), convertido);
    }

    @Test
        void given1000g_WhenConverteParaGramas_ThenRetorna1kg () {
        Peso umGrama = new Peso(1000, "g");
        Balanca balanca = new Balanca();
        balanca.adicionarTaxaDeConversao("g", "kg", 0.001f);
        Peso convertido = balanca.converter(umGrama, "kg");
        assertEquals(new Peso(1, "kg"), convertido);
    }
}
