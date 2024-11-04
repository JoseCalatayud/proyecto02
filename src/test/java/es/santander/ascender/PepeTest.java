package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PepeTest {
    Pepe cut = new Pepe();
    @Test
    public void testPepeSumar(){
        
        assertTrue(cut.sumar(3, 4) == 7);
    }
    @Test
    public void testPepeRestar(){
        
        assertTrue(cut.restar(3, 4) == -1, "El metodo restar es correcto");
    }
    @Test
    public void testPepeMultiplicar(){
        
        assertTrue(cut.multiplicar(5, 8)==40, "El metodo multiplicar es erroneo");
    }
    @Test
    public void testPepeDividir(){
        
        assertTrue(cut.dividir(12, 4) == 3, "El metodo dividir es erroneo");
    }
    
}
