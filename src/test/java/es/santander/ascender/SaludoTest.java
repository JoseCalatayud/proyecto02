package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SaludoTest {

    String nombre = "Jose";
    Saludo cut = new Saludo(nombre);

    @Test
    public void testSaludar() {
        String resultado  = cut.saludar(nombre);
        assertEquals( "Buenos dias Jose", resultado);

    }
}
