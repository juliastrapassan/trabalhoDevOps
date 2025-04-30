package test;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class teste {
    @Test
    public void testContarCaracteresNome() {
        String nome = "Julia";
        int esperado = 5;
        int resultado = nome.length();  // comportamento do método

        assertEquals(esperado, resultado);
    }

    @Test
    public void testInverterNome() {
        String nome = "Julia";
        String esperado = "ailuJ";

        String resultado = new StringBuilder(nome).reverse().toString();  // mesmo processo do método

        assertEquals(esperado, resultado);
    }

}
