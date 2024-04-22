// Clase Prenda
public class Prenda {
    private static int contadorInstancia = 0;
    private int id;
    private String tipo;
    private String marca;

    public Prenda(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
        this.id = ++contadorInstancia * 3;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void desplegarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }
}
