package clases;

public class DispositivosEntrada {
    //Atributos
    private String tipoEntrada;
    private String marca;

    public DispositivosEntrada(){}

    public DispositivosEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    //Contructor

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String confirmarMarcaDE () {
        if (marca.length() == 0 || tipoEntrada.length() == 0) {
            System.out.println("Debe ingresar una marca y/o tipo de entrada");
        } else {
            System.out.println("Marca Ingresada correctamente");
        }
        return marca;
    }

    @Override
    public String toString() {
        return "\nTipo de Entrada : "+tipoEntrada+ "\nMarca : " +marca;
    }
}
