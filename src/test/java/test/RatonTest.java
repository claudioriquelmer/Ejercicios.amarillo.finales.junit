package test;

import static org.junit.Assert.*;
import clases.Raton;
import org.junit.*;

public class RatonTest {

    Raton mousseFiddler;
    Raton mousseLogitech;

    @BeforeClass
    public static void InicializacionBCRaton () {
        System.out.println("Inicializando BeforeClass Raton...");
    }

    @Before
    public void inicializandoSetPruebasRaton () {
        System.out.println("Inicializando Set de pruebas clase Raton...");
        mousseFiddler = new Raton("USB","Fiddler", 10050);
        mousseLogitech = new Raton("Bluetooth","Logitech", 12000);
    }

    @Test
    public void testRatonNotNull () {
        //Segmentación de equivalencia con valores válidos
        assertNotNull(mousseFiddler);
        assertNotNull(mousseLogitech);
    }

    @Test
    public void testRatonEquals () {
        //Prueba positiva con Equals
        assertEquals(7,mousseFiddler.getIdRaton());
        assertEquals(8,mousseLogitech.getIdRaton());
    }

    @Test
    public void testRatonValorLimite () {
        // Prueba de Valor Límite
        int ratones = 99;
        int esperado = ratones * 200;
        int resultado = mousseLogitech.obtenerPrecioVenta(ratones);
        assertEquals(esperado,resultado);
    }

    @Test
    public void testTecladoValorLimitePrecio () {
        //Pruebas de Valor Límite precio inferior a cero
        assertNotNull(mousseFiddler.consultarPrecioRaton());
        assertNotNull(mousseLogitech.consultarPrecioRaton());
    }

    @Test
    public void testRatonTipoAtributoEntrada () {
        //Prueba de comprobación del tipo de entrada
        assertSame("Bluetooth",mousseLogitech.getTipoEntrada());
    }

    @AfterClass
    public static void finzalizandoTestRaton () {
        System.out.println("Cerrando Set de pruebas ...");
    }

    @After
    public void comprobacionResultadosRaton () {
        //System.out.println(mousseFiddler);
        //System.out.println(mousseLogitech);
        System.out.println("Test Finalizado");
    }
}
