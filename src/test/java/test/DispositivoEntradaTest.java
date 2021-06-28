package test;

import static org.junit.Assert.*;
import clases.DispositivosEntrada;
import clases.Raton;
import clases.Teclado;
import org.junit.*;

public class DispositivoEntradaTest {

    DispositivosEntrada usbMicrosoft;
    DispositivosEntrada bluetoothLogitech;

    @BeforeClass
    public static void InicializacionBCTeclado () {
        System.out.println("Inicializando BeforeClass Dispositivo de Entrada...");
    }

    @Before
    public void inicializandoSetPruebasTeclado () {
        System.out.println("Inicializando Set de pruebas clase Raton...");
        usbMicrosoft = new DispositivosEntrada("Minibin","Microsft");
        bluetoothLogitech = new DispositivosEntrada ("Bluetooth","Logitech");
    }

    @Test
    public void testTecladoNotNull () {
        //Prueba Positiva NotNull
        assertNotNull(usbMicrosoft);
        assertNotNull(bluetoothLogitech);
    }

    @Test
    public void testTecladoEquals () {
        //Segmentación de equivalencia con valores válidos
        assertEquals("USB",usbMicrosoft.getTipoEntrada());
        assertEquals("Bluetooth",bluetoothLogitech.getTipoEntrada());
    }


    @Test
    public void testTecladoTipoAtributoEntrada () {
        //Prueba de comprobación del tipo de entrada
        assertSame("Bluetooth",bluetoothLogitech.getTipoEntrada());
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

