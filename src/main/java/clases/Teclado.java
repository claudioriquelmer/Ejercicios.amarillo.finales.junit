package clases;

public class Teclado extends DispositivosEntrada {

    //Atributos
    private final int idTeclado;
    private static int contadorTeclado;

    //Constructor
    public Teclado(int idTeclado){
        this.idTeclado = idTeclado;
    }

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclado;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public static int getContadorTeclado() {
        return contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado " +"\nId Teclado : " +idTeclado+ "" +super.toString();
    }
}
