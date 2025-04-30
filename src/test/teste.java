package src.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class teste {

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
