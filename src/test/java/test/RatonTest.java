package test;

import static org.junit.Assert.*;
import clases.Raton;
import org.junit.*;

public class RatonTest {

    Raton mousseFiddler = new Raton("USB","Fiddler");
    Raton mousseLogitech = new Raton("Bluetooth","Logitech");

    @BeforeClass
    public static void InicializacionBCRaton () {
        System.out.println("Inicializando BeforeClass Raton...");
    }

    @Before
    public void inicializandoSetPruebasRaton () {
        System.out.println("Inicializando Set de pruebas clase Raton...");
    }

    @Test
    public void testRaton () {
        assertNotNull(mousseFiddler);
        assertNotNull(mousseLogitech);
        assertEquals(1,mousseFiddler.getIdRaton());
        assertEquals(2,mousseLogitech.getIdRaton());
        assertSame("USB",mousseFiddler.getTipoEntrada());
        assertNotSame("USB",mousseLogitech.getTipoEntrada());
    }

    @AfterClass
    public static void finzalizandoTestRaton () {
        System.out.println("Cerrando Set de pruebas ...");
    }

    @After
    public void comprobacionResultadosRaton () {
        System.out.println("Resultado Construcción Obejtos 1 : " +mousseFiddler);
        System.out.println("Resultado Construcción Obejtos 2 : " +mousseLogitech);
    }
}
