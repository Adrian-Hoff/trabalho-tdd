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
        Peso total = umQuilo.somar(outroQuilo, "kg");

        assertEquals(new Peso(2,"kg"), total);
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
        Peso total = umGrama.somar(outroGrama, "g");

        assertEquals(new Peso(2,"g"), total);
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

        Peso total = umQuilo.somar(quinhentosGramas, "g");

        assertEquals(new Peso(1500,"g"), total);
    }
}
