package clases;

public class Raton extends DispositivosEntrada {


    //Atributos
    private final int idRaton;
    private static int contadorRatones;

    //Constructor
    public Raton(int idRaton) {
        this.idRaton = idRaton;
    }

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idRaton = ++contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public static int getContadorRatones() {
        return contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton " +"\nId Ratón : " +idRaton+ "" + super.toString();
    }

}
