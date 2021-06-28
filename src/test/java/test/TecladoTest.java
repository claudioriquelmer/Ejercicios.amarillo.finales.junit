package test;

import static org.junit.Assert.*;

import clases.Raton;
import clases.Teclado;
import org.junit.*;

public class TecladoTest {

    Teclado tecladoMicrosoft;
    Teclado tecladoLogitech;

    @BeforeClass
    public static void InicializacionBCTeclado () {
        System.out.println("Inicializando BeforeClass Teclado...");
    }

    @Before
    public void inicializandoSetPruebasTeclado () {
        tecladoMicrosoft = new Teclado("Minibin","Microsft", 10050);
        tecladoLogitech = new Teclado ("Bluetooth","Logitech", 12000);
        System.out.println("Inicializando Set de pruebas clase Raton...");
    }

    @Test
    public void testTecladoNotNull () {
        //Prueba Positiva NotNull
        assertNotNull(tecladoMicrosoft);
        assertNotNull(tecladoLogitech);
    }

    @Test
    public void testTecladoEquals () {
        //Segmentación de equivalencia con valores válidos
        assertEquals(5,tecladoMicrosoft.getIdTeclado());
        assertEquals(6,tecladoLogitech.getIdTeclado());
    }

    @Test
    public void testTecladoValorLimite () {
        //Pruebas de Valor Límite
        int teclados = 99;
        int esperado = teclados * 200;
        int resultado = tecladoLogitech.obtenerPrecioVentaTeclado(teclados);
        assertEquals(esperado,resultado);
    }

    @Test
    public void testTecladoValorLimitePrecio () {
        //Pruebas de Valor Límite precio inferior a cero
        assertNotNull(tecladoMicrosoft.consultarPrecioTeclado());
        assertNotNull(tecladoLogitech.consultarPrecioTeclado());
    }

    @Test
    public void testTecladoTipoAtributoEntrada () {
        //Prueba de comprobación del tipo de entrada
        assertSame("Bluetooth",tecladoLogitech.getTipoEntrada());

    }

    @AfterClass
    public static void finzalizandoTestTeclado () {
        System.out.println("Cerrando Set de pruebas ...");
    }

    @After
    public void comprobacionResultadosTeclado () {
        //System.out.println(tecladoMicrosoft);
        //System.out.println(tecladoLogitech);
    }
}
