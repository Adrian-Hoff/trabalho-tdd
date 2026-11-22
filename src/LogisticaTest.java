import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LogisticaTest {
    // QUILO
    @Test
    void given5kg_WhenMultiplicadoPor2_ThenRetorna10kg() {
        Quilo cinco = new Quilo(5);
        assertEquals(new Quilo(10), cinco.multiplicar(2));
    }

    @Test
    void given5kg_WhenEqualsComOutros5kg_ThenRetornaVerdadeiro() {
        assertTrue(new Quilo(5).equals(new Quilo(5)));
    }

    @Test
    void given5kg_WhenEqualsCom6kg_ThenRetornaFalso() {
        assertFalse(new Quilo(5).equals(new Quilo(6)));
    }

    // GRAMA
    @Test
    void given5g_WhenMultiplicadoPor2_ThenRetorna10g(){
        Grama cinco = new Grama(5);
        assertEquals(new Grama(10), cinco.multiplicar(2));
    }

    @Test
    void given5g_WhenEqualsComOutros5g_ThenRetornaVerdadeiro() {
        assertTrue(new Grama(5).equals(new Grama(5)));
    }

    @Test
    void given5g_WhenEqualsCom6g_ThenRetornaFalso() {
        assertFalse(new Grama(5).equals(new Grama(6)));
    }
}
