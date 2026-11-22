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
}
