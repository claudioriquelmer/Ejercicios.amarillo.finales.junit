package test;

import static org.junit.Assert.*;
import clases.DispositivosEntrada;
import clases.Raton;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DispositivoEntradaTest {

    @BeforeClass
    public static void inicializacionBC () {
        System.out.println("Inicializando BeforeClassBC...");

    }

    @Before
    public void incializacionSetPruebas() {
        //Plan de pruebas
        System.out.println("Inicializando Test Comprobacion de Dispositivo...");

    }

    @Test
    public void comprobacionTipoDeEntradaNotNull() {
            DispositivosEntrada Fiddler = new DispositivosEntrada("USB", "Fiddler");
            DispositivosEntrada Logitech = new DispositivosEntrada("Bluetooth", "Logitech");
            assertNotNull(Fiddler);
            assertNotNull(Logitech);
    }


}

