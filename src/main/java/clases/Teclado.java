package clases;

public class Teclado extends DispositivosEntrada {

    //Atributos
    private final int idTeclado;
    private static int contadorTeclado;
    private int precio;

    //Constructor
    public Teclado(int idTeclado){
        this.idTeclado = idTeclado;
    }

    public Teclado(String tipoEntrada, String marca, int precio) {
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclado;
        this.precio = precio;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public static int getContadorTeclado() {
        return contadorTeclado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int obtenerPrecioVentaTeclado (int teclados) {
        int valorVenta = 0;

        if(teclados > 0 && teclados <= 100){
            precio = 200;
            valorVenta = teclados * precio;
        }
        else if (teclados > 100 && teclados < 500){
            precio = 100;
            valorVenta = teclados * precio;
        }
        return valorVenta;
    }

    public int consultarPrecioTeclado () {
        if (precio <= 0) {
            System.out.println("El precio ingresado no es válido");
        } else {
            System.out.println("Precio ingresado correctamente");
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Teclado " +"\nId Teclado : " +idTeclado+ "\nPrecio : " + precio + "" + super.toString();
    }
}
