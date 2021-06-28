package test;

import static org.junit.Assert.*;
import clases.Teclado;
import org.junit.*;

public class TecladoTest {

    Teclado tecladoMicrosft = new Teclado("Minidin","Microsoft Ergonomic");
    Teclado tecladoLoggitech = new Teclado("USB", "Logitech");

    @BeforeClass
    public static void inicializacionBCTeclado () {
        System.out.println("Inicializando BeforeClass Teclado...");
    }

    @Before
    public void inicializandoSetPruebasTeclado () {
        System.out.println("Inicializando Set de pruebas clase Teclado...");
    }

    @Test
    public void testTeclado () {
        assertNotNull(tecladoMicrosft);
        assertNotNull(tecladoLoggitech);
        assertEquals(1,tecladoMicrosft.getIdTeclado());
        assertEquals(2,tecladoLoggitech.getIdTeclado());
        assertSame("Minidin",tecladoMicrosft.getTipoEntrada());
        assertNotSame("USB",tecladoLoggitech.getTipoEntrada());
    }

    @AfterClass
    public static void finalizandoTestTeclado () {
        System.out.println("Cerrando set de pruebas clase Teclado...");
    }

    @After
    public void comprobacionResultadosTeclado () {
        System.out.println("Resultados Construcción Objeto de prueba 1 : " +tecladoMicrosft);
        System.out.println("Resultados Construcción Objeto de prueba 2 : " +tecladoLoggitech);
    }
}
