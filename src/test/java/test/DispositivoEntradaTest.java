package test;

import static org.junit.Assert.*;
import clases.DispositivosEntrada;
import clases.Raton;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DispositivoEntradaTest {

    DispositivosEntrada asus = new DispositivosEntrada("USB", "Asus");
    Raton mousse = new Raton("USB","PHILIP");
    Raton maucce = new Raton("Bluetooth","asus");


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
    public void comprobacionDispositivoEntrada() {
            assertNotNull(asus );

            //System.out.println("Dispositivo ingresado correctamente");
        }

}

