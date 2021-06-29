package test;

import static org.junit.Assert.*;
import clases.DispositivosEntrada;
import org.junit.*;

public class DispositivoEntradaTest {

    DispositivosEntrada usbMicrosoft;
    DispositivosEntrada bluetoothLogitech;

    @BeforeClass
    public static void InicializacionBCDE () {
        System.out.println("Inicializando BeforeClass Dispositivo de Entrada...");
    }

    @Before
    public void inicializandoSetPruebasDE () {
        System.out.println("Inicializando Set de pruebas clase Dispositivos de Entrada...");
        usbMicrosoft = new DispositivosEntrada("Minibin","Microsoft");
        bluetoothLogitech = new DispositivosEntrada ("Bluetooth","Logitech");
    }

    @Test
    public void testDENotNull () {
        //Prueba Positiva NotNull
        assertNotNull(usbMicrosoft);
        assertNotNull(bluetoothLogitech);
    }

    @Test
    public void testMarcaDE () {
        //Prueba
        assertNotNull(usbMicrosoft.confirmarMarcaDE());
    }

    @Test
    public void testDEEquals () {
        //Segmentación de equivalencia con valores válidos
        assertEquals("Minibin",usbMicrosoft.getTipoEntrada());
        assertEquals("Bluetooth",bluetoothLogitech.getTipoEntrada());
    }


    @Test
    public void testDETipoAtributoEntrada () {
        //Prueba de comprobación del tipo de entrada
        assertSame("Bluetooth",bluetoothLogitech.getTipoEntrada());
    }

    @AfterClass
    public static void finzalizandoTestDE () {
        System.out.println("Cerrando Set de pruebas ...");
    }

    @After
    public void comprobacionResultadosDE () {
        //System.out.println(usbMicrosoft);
        //System.out.println(bluetoothLogitech);
        System.out.println("Test Finalizado");
    }


}

