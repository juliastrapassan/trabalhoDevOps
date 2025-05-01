import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    @Test
    public void testContarCaracteresNome() {
        String nome = "Julia";
        int esperado = 5;
        int resultado = nome.length();

        assertEquals(esperado, resultado);
    }

    @Test
    public void testInverterNome() {
        String nome = "Julia";
        String esperado = "ailuJ";

        String resultado = new StringBuilder(nome).reverse().toString();

        assertEquals(esperado, resultado);
    }
}
