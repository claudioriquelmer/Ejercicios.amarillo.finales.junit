package clases;

public class Raton extends DispositivosEntrada {


    //Atributos
    private final int idRaton;
    private static int contadorRatones;
    private int precio;

    //Constructor
    public Raton(int idRaton) {
        this.idRaton = idRaton;
    }

    public Raton(String tipoEntrada, String marca, int precio) {
        super(tipoEntrada, marca);
        idRaton = ++contadorRatones;
        this.precio = precio;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public static int getContadorRatones() {
        return contadorRatones;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int obtenerPrecioVenta (int ratones) {
        int valorVenta = 0;

        if(ratones > 0 && ratones <= 100){
            precio = 200;
            valorVenta = ratones * precio;
        }
        else if (ratones > 100 && ratones < 500){
            precio = 100;
            valorVenta = ratones * precio;
        }
        return valorVenta;

        }

     public int consultarPrecioRaton () {
        if (precio <= 0) {
            System.out.println("El precio ingresado no es válido");
        } else {
            System.out.println("Precio ingresado correctamente");
        }
        return precio;
    }


    @Override
    public String toString() {
        return "Raton " +"\nId Ratón : " +idRaton+ "" + super.toString();
    }

}
