import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LogisticaTest {
    @Test
    void given5kg_WhenMultiplicadoPor2_ThenRetorna10kg() {
        Quilo cinco = new Quilo(5);
        Quilo dez = cinco.multiplicar(2);
        assertEquals(10, dez.quantidade);
    }

    @Test
    void given5kg_WhenEqualsComOutros5kg_ThenRetornaVerdadeiro() {
        assertTrue(new Quilo(5).equals(new Quilo(5)));
    }

    @Test
    void given5kg_WhenEqualsCom6kg_ThenRetornaFalso() {
        assertFalse(new Quilo(5).equals(new Quilo(6)));
    }
}
