
public class Camisa extends Prenda{
	private String talla;

    public Camisa(String tipo, String marca, String talla)
    {
        super(tipo, marca);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public void desplegarInformacion() {
        super.desplegarInformacion();
        System.out.println("Talla: " + talla);
    }

}
